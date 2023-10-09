
package com.mycompany.projetoperfumaria;

import Repositorio.RepositorioUsuario;
import models.Usuario;
import telas.TelaInicio;
import telas.TelaCadastrarUsuario;

public class ProjetoPerfumaria {

    public static void main(String[] args) {
        
        TelaInicio iniciar = new TelaInicio();
        
        iniciar.setVisible(true);
        
        Usuario usuario = new Usuario();
        
        
        
        boolean salvo;
        
        usuario.setCpf("49782348131");
        usuario.setNome("Igor");
        usuario.setPerfil("Administrador");
        usuario.setSenha("837947239423");
        usuario.setId("1");
        
        
        RepositorioUsuario rp = new RepositorioUsuario();
        
        salvo = rp.salvarUsuario(usuario);
        
        if(salvo){
        
            System.out.println(usuario.getNome() + "Salvo com sucesso");
        }
        
        else{
            System.out.println("calaboca");
        
    }
        
     
    }
    
}
