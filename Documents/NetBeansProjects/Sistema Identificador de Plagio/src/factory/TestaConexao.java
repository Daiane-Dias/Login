/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Pereira
 */
public class TestaConexao {
    public static void main(String[] args)throws SQLException{
        Connection connection = new ConnectionFactory().getConnection();
        System.println("Conexao Aberta!");
        connection.close();
    }
}
