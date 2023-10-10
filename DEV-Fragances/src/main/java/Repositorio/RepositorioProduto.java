/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import java.util.ArrayList;
import models.Produto;

/**
 *
 * @author tigor
 */
public class RepositorioProduto {
    
    private ArrayList<Produto> user = new ArrayList<>();
    
    public boolean salvar (Produto s){
        if (s != null){
            user.add(s);
            return true;
        }else{
        return false;
    }
        
    }
    
    public ArrayList<Produto> retornarTodos(){
        return user;
    }
    
}
