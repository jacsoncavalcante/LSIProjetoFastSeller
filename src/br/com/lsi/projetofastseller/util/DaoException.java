/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.lsi.projetofastseller.util;

/**
 *
 * @author jacsoncavalcante
 */
public class DaoException extends Exception{
    
    public DaoException(String msg) {
        super(msg);
    }

    public DaoException(Exception e) {
        super(e);
    }

    public DaoException(String msg, Exception e) {
        super(msg, e);
    }
    
    
}
