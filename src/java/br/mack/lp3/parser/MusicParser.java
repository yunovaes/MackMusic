/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.lp3.parser;

import br.mack.lp3.persistence.entities.Music;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author 115417
 */
public class MusicParser {

    public static String openURL(String uri) {

        String return_str = "";

        java.net.URL url;
        try {
            url = new java.net.URL(uri);
//            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.2", 8080)); //Proxy da rede física do Mack
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("172.16.0.10", 3128)); //Proxy da rede física do MackII
            HttpURLConnection con = (HttpURLConnection) url.openConnection(proxy);

            //Códigos de resposta: 200: OK; 401, ou 403: erro de proxy
            int responseCode = con.getResponseCode();
            if (responseCode == 200) {
                //Obtém o token para futuras consultas e os dados públicos do usuário
                BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder resp = new StringBuilder();
                while ((inputLine = reader.readLine()) != null) {
                    resp.append(inputLine);
                }
                reader.close();

                //Apenas mostrando a resposta.
                return_str = (resp.toString());

            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(MusicParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MusicParser.class.getName()).log(Level.SEVERE, null, ex);
        }

        return return_str;
    }

    public static List<Music> parse(String content) {

        Music mu = null;
        JsonObject root;
        try (JsonReader reader = Json.createReader(new StringReader(content))) {

            root = reader.readObject();
        }
        JsonArray results = root.getJsonArray("results");

        List<Music> musics = new ArrayList<>();
        for (int i = 0; i < results.size(); i++) {

            JsonObject re = results.getJsonObject(i);

            String trackName = re.getJsonString("trackName").getString();
            String author = re.getJsonString("artistName").getString();
            String country = re.getJsonString("country").getString();

            mu = new Music(trackName, author, country);

            mu.setAuthor(author);
            mu.setName(trackName);
            mu.setCountry(country);
            
            musics.add(mu);
        }
        System.out.println("**********************************absiydbasoiuf" + mu.author );
        return musics;
    }
}
