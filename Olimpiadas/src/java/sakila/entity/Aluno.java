package sakila.entity;
// Generated 09/12/2015 10:10:53 by Hibernate Tools 4.3.1



/**
 * Aluno generated by hbm2java
 */
public class Aluno  implements java.io.Serializable {

     private String nome;
     private String matricula;
     private String serie;
     private String login;
     private String senha;
     private String data;

    public Aluno() {
    }

	
    public Aluno(String matricula) {
        this.matricula = matricula;
    }
    public Aluno(String nome, String matricula, String serie, String login, String senha, String data) {
       this.nome = nome;
       this.matricula = matricula;
       this.serie = serie;
       this.login = login;
       this.senha = senha;
       this.data = data;
    }
   
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getSerie() {
        return this.serie;
    }
    
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getData() {
        return this.data;
    }
    
    public void setData(String data) {
        this.data = data;
    }




}


