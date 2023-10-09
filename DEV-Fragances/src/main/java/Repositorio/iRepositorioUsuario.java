/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorio;

import java.util.*;
import models.Usuario;

/**
 *
 * @author tigor
 */
public interface iRepositorioUsuario {
    
    public boolean salvarUsuario(Usuario usuario);
    public boolean deletarUsuario(String id);
    public List<Usuario> listarUsuario();
    public boolean alterarUsuario(Usuario usuario);


    
}
