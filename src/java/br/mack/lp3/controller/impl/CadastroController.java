/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.lp3.controller.impl;

import br.mack.lp3.controller.AbstractController;
import br.mack.lp3.persistence.UserLP3DAO;
import br.mack.lp3.persistence.entities.UserLP3;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 41526740
 */
public class CadastroController extends AbstractController {

    UserLP3DAO userLP3DAO = lookupUserLP3DAOBean();

    @Override
    public void execute() {
        String name = this.getRequest().getParameter("name");
        String email = this.getRequest().getParameter("email");
        String senha = this.getRequest().getParameter("senha");
        String confSenha = this.getRequest().getParameter("confSenha");

        if (senha.equals(confSenha))  {
            HttpSession sessao = this.getRequest().getSession();
            sessao.setAttribute("name", name);
            sessao.setAttribute("email", email);
            sessao.setAttribute("senha", senha);

            UserLP3 user = new UserLP3();
            user.setName(name);
            user.setEmail(email);
            user.setSenha(senha);

            userLP3DAO.create(user);

            sessao.setAttribute("id", user.getId_userlp3());

            this.setReturnPage("profile.jsp");
        } else {
            this.setReturnPage("erro.jsp");
        }
    }

    private UserLP3DAO lookupUserLP3DAOBean() {
        try {
            Context c = new InitialContext();
            return (UserLP3DAO) c.lookup("java:global/JavaLp3/UserLP3DAO!br.mack.lp3.persistence.UserLP3DAO");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
