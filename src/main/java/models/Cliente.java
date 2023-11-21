package models;

/**
 *
 * @author tigor
 */
public class Cliente {

    private int idCliente;
    private String nome;
    protected String email;


    public Cliente(int id, String nome, String email) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
    }
    
      public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    

    public Cliente(){}

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 


}
