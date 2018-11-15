/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.utils;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe
 */
public class SistemaUtils {

    private static ResourceBundle getConfig() {

        ResourceBundle bundle = ResourceBundle.getBundle("br.fatec.resources.Config");
        return bundle;
    }

    public String getConfigProperty(String key) {
        return getConfig().getString(key);
    }

    public String getMessageProperty(String key) {

        String text;
        try {
            text = getMessage().getString(key);
        } catch (MissingResourceException e) {
            text = String.format("%s não econtrado.", key);
            Logger.getLogger(SistemaUtils.class.getName()).log(Level.SEVERE, null, e);
        }
        return text;
    }

    private static ResourceBundle getMessage() {

        ResourceBundle bundle = ResourceBundle.getBundle("br.fatec.resources.Message");
        return bundle;
    }
}
