/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql*;
import java.sql.PreparedStatement;
/**
 *
 * @author Daiane Dias 
 */
public class UsuarioDAO {
    private Connection connection; 
    Long ord;
    String login;
    String senha;
    String matricula;
    Boolean docente;
    Boolean discente;
    String nome;
    String disciplina;
    String setor;
    
   public UsuarioDAO() {
       this.connection = new ConnectionFactory().getConnection();
  
}
   public void adiciona(Usuario usuario){
       String sql = "INSERT INTO usuario(login,senha,matricula,docente,discente,nome,disciplina,setor) VALUES (,,,,,,,)";
            try{
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1,usuario.getLogin());
                stmt.setString(2,usuario.getSenha());
                stmt.setString(3, usuario.getMatricula());
                stmt.setString(4, usuario.getNome());
                stmt.setString(5,usuario.getDisciplina());
                stmt.setString(6,usuario.getSetor());
                stmt.execute();
                stmt.close();
                 }
                    catch(SQLException u){
                        throw new  RuntimeException(u);
                    }
       }
}
