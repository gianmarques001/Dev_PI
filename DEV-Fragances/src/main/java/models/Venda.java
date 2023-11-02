/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.*;

/**
 *
 * @author User
 */
public class Venda {
    private String data;
    private int numero;
    
    private ArrayList<ItemVenda> itensVenda;
    
    private Usuario usuario;
    
    public Venda(){
        this.itensVenda = new ArrayList<ItemVenda>();
        this.usuario = new Usuario();
        
        
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the itensVenda
     */
    public ArrayList<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    /**
     * @param itensVenda the itensVenda to set
     */
    public void setItensVenda(ArrayList<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public float getValorTotal(){
        float retorno = 0;
        for (int i = 0; i < this.itensVenda.size(); i++){
            float valor = (this.itensVenda.get(i).getQtd()* this.itensVenda.get(i).getPreco());
            retorno = retorno + valor;
            
        }
        
        return retorno;
    }
    
}
