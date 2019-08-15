/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.lp3.controller.impl;

import br.mack.lp3.controller.AbstractController;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 41526740
 */
public class LogoutController extends AbstractController {  
    
    @Override
    public void execute() {
    
        HttpSession sessao = this.getRequest().getSession();
        
        sessao.invalidate();
        
        this.setReturnPage("index.jsp");
        
    }

}
