/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SERVIDOR-PC
 */
public  class ConexaoBD {
    
     Connection conn = null;
    
     public Connection conectaBD(){
        
        try {
            String url = "jdbc:mysql://localhost:3306/projeto_gondula?user=root&password=mnd0266";
            conn = DriverManager.getConnection(url);
            
            
        } catch (SQLException erro) {
            JOptionPane.showInputDialog(null,"não conectou",erro.getMessage());
        }
       
        System.out.println("conectou");
        
        return conn;     
    }
    
    
   public void closeBD(){
       
       this.conn = null;
       
   }
    
}
