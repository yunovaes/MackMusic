/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.lp3.persistence.entities;

import java.io.Serializable;

/**
 *
 * @author 115417
 */
public class Music implements Serializable {

    public String name, author, country;

    public Music() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Music(String name, String author, String country) {
        this.name = name;
        this.author = author;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Music{" + "name=" + name + ", author=" + author + ", country=" + country + '}';
    }

}
