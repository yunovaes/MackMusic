/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.lp3.controller.impl;

import br.mack.lp3.controller.AbstractController;
import br.mack.lp3.parser.MusicParser;
import br.mack.lp3.persistence.entities.Music;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author 115417
 */
public class SearchMusicController extends AbstractController {

    @Override
    public void execute() {

        HttpServletRequest request = this.getRequest();

        String termo = "";

        try {
            request.setCharacterEncoding("UTF-8");
        termo = request.getParameter("termo");
            termo = URLEncoder.encode(termo, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(SearchMusicController.class.getName()).log(Level.SEVERE, null, ex);
        }

        String uri = "https://itunes.apple.com/search?term=" + termo + "&media=music";

        Music music = new Music();

        ArrayList<Music> mu = (ArrayList<Music>) MusicParser.parse(MusicParser.openURL(uri.replace(" ", "+")));
        this.getRequest().getSession().setAttribute("mu", mu);

        this.setReturnPage("home.jsp");

    }

}
