/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


public class Produto {

    private int id;
    private String nomeProduto;
    private int qtdProduto;
    private long precoProduto;
    private String categoriaProduto;

    public Produto() {
    }

    public Produto(int id, String nome, long preco, int qtd, String categoria) {
        this.id = id;
        this.nomeProduto = nome;
        this.precoProduto = preco;
        this.qtdProduto = qtd;
        this.categoriaProduto = categoria;
    }
    public Produto(String nome, long preco, int qtd, String categoria) {
        this.nomeProduto = nome;
        this.precoProduto = preco;
        this.qtdProduto = qtd;
        this.categoriaProduto = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(long precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nomeProduto + ", Preço" + this.precoProduto + ", Qtd: " + this.qtdProduto + ", Categoria: " + this.categoriaProduto;
    }

}
