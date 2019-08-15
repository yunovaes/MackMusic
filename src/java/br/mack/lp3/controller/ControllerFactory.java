package br.mack.lp3.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 41526740
 */
public class ControllerFactory {
    
    public static Controller getInstanceByName (String name) {
        Controller instance = null;
        
            String className = "br.mack.lp3.controller.impl." + name + "Controller";
        try {
            instance = (Controller) Class.forName(className).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ControllerFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return instance;
    }
}
