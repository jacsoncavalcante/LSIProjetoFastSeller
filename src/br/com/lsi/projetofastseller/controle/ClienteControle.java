/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.lsi.projetofastseller.controle;

import br.com.lsi.projetofastseller.model.Cliente;
import br.com.lsi.projetofastseller.util.DaoFactory;
import br.com.projetofastseller.facede.IFacade;
import java.util.List;

/**
 *
 * @author jacsoncavalcante
 */
public class ClienteControle {
     private IFacade fachada = DaoFactory.createImplFacade();

    public void SalvarCliente(Cliente cliente) throws Exception {
        fachada.inserirCliente(cliente);
    }
    
    public void RemoverAluno(int id) throws Exception {
        fachada.removerCliente(id);
    }
    
     public List<Cliente> listarCliente() throws Exception {
         return fachada.listarCliente();
         
     }

    public void EditarCliente(Cliente cliente) throws Exception {
        fachada.editarCliente(cliente);
    }
    
    public Cliente ProcurarCliente(int id) throws Exception {
        return fachada.buscarCliente(id);

    }


    
}
