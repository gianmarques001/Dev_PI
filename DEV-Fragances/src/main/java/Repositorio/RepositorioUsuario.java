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



public class RepositorioUsuario implements iRepositorioUsuario{
    
    List<Usuario> listarUsuarios = new ArrayList<Usuario>();
    
    
    
    
    @Override
    
    public boolean salvarUsuario(Usuario usuario){
        
        try {listarUsuarios.add(usuario);
            
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    @Override
    public boolean deletarUsuario(String id){
        return false;
    }
    
    public List<Usuario> listarUsuario(){
        return null;
    }
    
    public boolean alterarUsuario(Usuario usuario){
    
        return false;
    }
    
    
    
    
}
