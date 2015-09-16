/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.lsi.projetofastseller.dao;

import br.com.lsi.projetofastseller.model.Cliente;
import br.com.lsi.projetofastseller.util.ConnectionFactory;
import br.com.lsi.projetofastseller.util.DaoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jacsoncavalcante
 */
public class JDBCClienteDao extends ClienteDao{
    
    private Connection con;
    private int idCliente;
    private String insertCliente;
    
    
    public void inserir(Cliente c) throws DaoException {

        con = ConnectionFactory.getConnection();

        try {
            
            String sql = "INSERT INTO Cliente (codigo,nome,cpf,status) VALUES (?,?,?,?)";

            PreparedStatement st = con.prepareStatement(insertCliente,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            st = con.prepareStatement(sql);
            
            st.setInt(1, c.getCodigo());
            st.setString(2, c.getNome());
            st.setInt(3, c.getCpf());
            st.setBoolean(4, c.isStatus());
            
            st.executeUpdate();

            st.close();
            con.close();
            System.out.println("CLIENTE INSERIDO COM SUCESSO!!!");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new DaoException("Erro ao inserir registro");
        }

    }  
    
    
}
