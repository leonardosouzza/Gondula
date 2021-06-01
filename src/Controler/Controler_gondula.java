/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Conexao.CRUD;
import java.util.List;
import Model.Etiqueta;
import java.util.ArrayList;

/**
 *
 * @author SERVIDOR-PC
 */
public class Controler_gondula {
    
    CRUD crud = new CRUD();
    
    
    public boolean cadastrar_prod(Etiqueta etiqueta){
      
        boolean cadastro = crud.cadastrar_prod(etiqueta);
         
        return cadastro;  
    }
    
    
     public List<Etiqueta> buscar_prod(){
         
         List<Etiqueta> etiquetas = crud.busca_prod();
         
            return etiquetas;
     }
    
}
