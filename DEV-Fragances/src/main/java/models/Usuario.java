package models;

/**
 *
 * @author tigor
 */
public class Usuario {

    private String id;
    private String nome;
    private String cpf;
    protected String email;
    private String perfil;
    protected String senha;

    public Usuario(String id, String nome, String cpf, String email, String perfil, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.perfil = perfil;
        this.senha = senha;
    }
    
    

    public Usuario(){}
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the perfil
     */
    public String getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

}
