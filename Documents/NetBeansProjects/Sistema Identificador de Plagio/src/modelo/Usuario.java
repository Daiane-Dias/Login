/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Daiane Dias 
 */
public class Usuario {
    Long ord;//variavel para contagem de registros
    String login;
    String senha;
    String matricula;
    Boolean docente;
    Boolean discente;
    String nome;
    String disciplina;
    String setor;
    
    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login = login;
    }
  
     public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    
     public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
     public String getDisciplina(){
        return disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    
   public String getSetor(){
        return setor;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }
     
}