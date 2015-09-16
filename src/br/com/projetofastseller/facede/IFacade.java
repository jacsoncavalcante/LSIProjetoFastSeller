/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetofastseller.facede;

import br.com.lsi.projetofastseller.model.Cliente;
import java.util.List;

/**
 *
 * @author jacsoncavalcante
 */
public interface IFacade {
    
     public void inserirCliente(Cliente c) throws Exception;
    
    public void editarCliente(Cliente c) throws Exception;

    public void removerCliente(int id) throws Exception;

    public List<Cliente> listarCliente() throws Exception;
    
    public Cliente buscarCliente(int id) throws Exception;
    
    public List<Cliente> buscarClientePorNome(String nome) throws Exception;
    
}
