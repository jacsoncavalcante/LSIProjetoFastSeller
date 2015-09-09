/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.projetofastseller.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Venda {
    
    List <Produto> produtos = new ArrayList<Produto>();
    double valordosProdutos;
    double desconto;
    double valorTotal;
    Cliente cliente;
    boolean status;
    Vendedor vendedor;
    Date data;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> Produtos) {
        this.produtos = Produtos;
    }

    public double getValordosProdutos() {
        return valordosProdutos;
    }

    public void setValordosProdutos(double valordosProdutos) {
        this.valordosProdutos = valordosProdutos;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public void adicionarProdutos(Produto produto){
        
        this.produtos.add(produto);
    
    }
    
    public void realizarVenda(){
        System.out.println("*******Itens*******");
        for (Produto produto : produtos) {
            System.out.println(produto.codigo+"  "+produto.nome);
            this.valordosProdutos = this.valordosProdutos + produto.getPreco();
        }
        
        this.valorTotal = this.valordosProdutos;
        System.out.println("*******************");
        System.out.println("Valor da venda foi");
        System.out.println(this.valorTotal);
        
    }
    
}
