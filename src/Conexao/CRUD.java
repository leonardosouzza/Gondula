/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import Model.Etiqueta;


public class CRUD {
    
ConexaoBD bd = new ConexaoBD();
Etiqueta etiqueta = new Etiqueta();
    
    private String INSERIR = "insert into projeto_gondula.etiqueta (cod_produto,desc_produto,preco_venda,nome_empresa) values (?,?,?,?)";
    public Boolean cadastrar_prod(Etiqueta etiqueta){
    
    
        PreparedStatement preparedStatement = null; //responsavel por traduzir a string para sql
        try { 
        //inica a conexao + valores e execute
        preparedStatement = bd.conectaBD().prepareStatement(INSERIR); 
        
        preparedStatement.setString(1,etiqueta.getCod_produto());
        preparedStatement.setString(2, etiqueta.getDesc_produto());
        preparedStatement.setDouble(3, etiqueta.getPreco_venda());
        preparedStatement.setString(4, etiqueta.getNome_empresa());
        
        preparedStatement.executeUpdate();
        
        return true;
       
    } catch (SQLException ex) {
        bd.closeBD();
        preparedStatement = null;
       
    }finally{
            bd.closeBD();
            preparedStatement = null;}

        /* 
        iserir uma query 
        chame a conexao
        execute 
        */
        return false;
    }
    
    private String SELECT = "SELECT cod_produto,desc_produto,preco_venda,nome_empresa from etiqueta";
    public List<Etiqueta> busca_prod(){
        
             
        List<Etiqueta> etiquetas = new ArrayList<>();
        
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
   
         
    try {
        preparedStatement = bd.conectaBD().prepareStatement(SELECT);
       
        rs = preparedStatement.executeQuery();
       
        while(rs.next()){
            
           Etiqueta etiqueta = new Etiqueta();
            
           etiqueta.setCod_produto(rs.getString(1));
           etiqueta.setDesc_produto(rs.getString(2));
           etiqueta.setPreco_venda(rs.getDouble(3));
           etiqueta.setNome_empresa(rs.getString(4));
           
           etiquetas.add(etiqueta);
           
        }
        
        
    return etiquetas;
    
    } catch (SQLException ex) {
         preparedStatement = null; 
         rs = null;
         bd.closeBD();
       
    }finally{
        preparedStatement = null;
        rs = null;
        bd.closeBD();
        
    }
       
        return null;
        
        
    }
            
            
    
        
        
   
            
        

        
    
  
    
    
}
