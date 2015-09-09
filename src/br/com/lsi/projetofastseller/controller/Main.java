/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.projetofastseller.controller;

import br.com.lsi.projetofastseller.model.Produto;
import br.com.lsi.projetofastseller.model.Venda;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
      Venda v = new Venda();
      Produto p = new Produto();
      Produto p2 = new Produto();
      p.setCodigo(0001);
      p.setNome("Camisa");
      p.setPreco(10.0);
      p.setDisponibilidade(true);
      p.setTipo("Roupa");
      v.adicionarProdutos(p);
      p2.setCodigo(0002);
      p2.setNome("Calca");
      p2.setPreco(22.0);
      v.adicionarProdutos(p2);
      v.realizarVenda();
      
      
          
      }
    
}
