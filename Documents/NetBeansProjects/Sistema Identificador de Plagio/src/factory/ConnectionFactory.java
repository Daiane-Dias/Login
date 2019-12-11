/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;

import java.sql.DriveManager;

import java.sql.SQLException;
/*
 *Na linha 20 e onde posso mudar o caminho do Banco de Dados
 * @author Daiane Dias
 */
public class ConnectionFactory {
    public Connection getConnection(){
        try{
            return DriveManager.getConnection("jdbc:mysql://localhost/projetojava","nome-usuario","senha-usuario");
            
        } 
        catch(SQLException excecao){
            throw new RuntimeException (excecao);
        }
    }
    
}
