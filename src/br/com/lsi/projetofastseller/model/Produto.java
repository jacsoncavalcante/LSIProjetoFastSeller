/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.projetofastseller.model;

/**
 *
 * @author Aluno
 */
public class Produto {
 
    int codigo;
    String nome;
    String tipo;
    Double preco;
    boolean disponibilidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }


    public void CadastrarProduto (Produto produto){
      this.codigo = produto.getCodigo();
      this.nome = produto.getNome();
      this.tipo = produto.getTipo();
      this.preco = produto.getPreco();
      this.disponibilidade = produto.disponibilidade;
    
    }
    

    
    
    
}
