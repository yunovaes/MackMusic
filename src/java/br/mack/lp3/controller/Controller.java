/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.lp3.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 41526740
 */
public interface Controller {
    
    public void init (HttpServletRequest request, HttpServletResponse response);
    
    public void execute();
    
    public String getReturnPage();
    
}
