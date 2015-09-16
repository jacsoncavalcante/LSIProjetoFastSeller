/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.lsi.projetofastseller.util;

import br.com.lsi.projetofastseller.dao.ClienteDao;
import br.com.lsi.projetofastseller.dao.JDBCClienteDao;

/**
 *
 * @author jacsoncavalcante
 */
public class DaoFactory {
    
    public static ClienteDao createClienteDao() {
        return new JDBCClienteDao();
    }
}

    

