/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;


public class Produtos {
    
  
    ArrayList<Produto> produtos;
    public Produtos(){
        this.produtos = new ArrayList<Produto>();
    }
    
    public void salvarProduto(Produto produto){
        produtos.add(produto);
        System.out.println("Produto salvo");
    }
     
   public void mostrarProdutos(){
       for (Produto produto : produtos) {
           System.out.println("models.Produtos.mostrarProdutos()");
       }
   }
}
