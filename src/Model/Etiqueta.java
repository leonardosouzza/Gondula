/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Etiqueta {
    
     
 private int id;
 private String cod_produto;
 private String desc_produto;
 private double preco_venda;
 private String nome_empresa;    
    
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(String cod_produto) {
        this.cod_produto = cod_produto;
    }

    public String getDesc_produto() {
        return desc_produto;
    }

    public void setDesc_produto(String desc_produto) {
        this.desc_produto = desc_produto;
    }

    public double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }
    

    

    
}
