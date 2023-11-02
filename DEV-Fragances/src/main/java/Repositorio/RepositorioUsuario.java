/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import java.util.*;

import models.Usuario;
/**
 * list<>
 *
 * @author tigor
 */



public class RepositorioUsuario{
    
    private ArrayList<Usuario> user = new ArrayList<>();
    
    public boolean salvar (Usuario s){
        if (s != null){
            user.add(s);
            return true;
        }else{
        return false;
    }
        
    }
    
    public ArrayList<Usuario> retornarTodos(){
        return user;
    }

    
}
