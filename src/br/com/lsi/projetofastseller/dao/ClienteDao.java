/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.lsi.projetofastseller.dao;

import br.com.lsi.projetofastseller.model.Cliente;
import br.com.lsi.projetofastseller.util.DaoException;
import java.util.List;

/**
 *
 * @author jacsoncavalcante
 */
public interface ClienteDao {
     public void inserir(Cliente c) throws DaoException;

    public void editar(Cliente c) throws DaoException;

    public void remover(int id) throws DaoException;

    public List<Cliente> listarCliente() throws DaoException;
   
    public List<Cliente> listarClientesPorNome(String nome) throws DaoException;

    public Cliente getPorId(int id) throws DaoException;

    
}
