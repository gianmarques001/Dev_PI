/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author tigor
 */
public class Dados {
    private Usuario msUsuarios[]=new Usuario[50];
    private int conUsu = 0;
    
    public Dados(){
        Usuario mUsuario = new Usuario();
        msUsuarios[conUsu] = mUsuario;
        conUsu ++;
    }
    
    public boolean validarUsuario(String Usuario, String Senha){
        boolean aux = false;
        for (int i = 0; i < conUsu; i++){
            if (msUsuarios[i].getEmail().equals(Usuario) && msUsuarios[i].getSenha().equals(Senha)){
                return true;
            }
            
            
            }
            return false;
                
        }
    }
    

