/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetofastseller.facede;

import br.com.lsi.projetofastseller.dao.ClienteDao;
import br.com.lsi.projetofastseller.model.Cliente;
import br.com.lsi.projetofastseller.util.DaoException;
import br.com.lsi.projetofastseller.util.DaoFactory;
import java.util.List;

/**
 *
 * @author jacsoncavalcante
 */
public class ImplFacade implements IFacade{
    
    private ClienteDao clienteDao;
    

    public ImplFacade() {

        clienteDao = DaoFactory.createClienteDao();
        
    }
    //---------------------------------------------------------------------//
     public void inserirCliente(Cliente cliente) throws Exception {

        try {
            this.clienteDao.inserir(cliente);

        } catch (DaoException ex) {
            throw new Exception(ex.getMessage());

        }

    }

    public void editarAluno(Cliente cliente) throws Exception {

        try {

            this.clienteDao.editar(cliente);
        } catch (DaoException ex) {
            throw new Exception(ex.getMessage());

        }

    }

    public void removerAluno(int id) throws Exception {

        try {

            this.clienteDao.remover(id);
        } catch (DaoException ex) {
            throw new Exception(ex.getMessage());

        }
    }

    public List<Cliente> listarCliente() throws Exception {

        try {

            return clienteDao.listarCliente();
        } catch (DaoException ex) {
            ex.printStackTrace();
            throw new Exception(ex.getMessage());

        }
    }

    public Cliente buscarCliente(int id) throws Exception {

        try {

            return this.clienteDao.getPorId(id);
        } catch (DaoException ex) {
            throw new Exception(ex.getMessage());

        }
    }

    public List<Cliente> buscarClientePorNome(String nome) throws Exception {
        return this.clienteDao.listarClientePorNome(nome);

}
}
