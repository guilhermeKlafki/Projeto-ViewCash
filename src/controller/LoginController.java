/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Connection.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;

/**
 *
 * @author lucas.pandolfo
 */
public class LoginController {
    
    public Usuario Login(String usuario, String senha){
        
        //INÍCIO CONEXÃO COM O BANCO DE DADOS
        System.out.println("Vai abrir a conexão com o banco de dados");
        ConnectionFactory.abreConexao();
        
        //Criando um usuario
        Usuario user = null;
        //Resultado do banco.
        ResultSet rs = null;

           StringBuilder sql = new StringBuilder();
           sql.append(" SELECT login, nome");
           sql.append(" FROM usuarios");
           sql.append(" WHERE login = '" + usuario + "' ");
           sql.append(" AND senha = '" + senha + "'");
     
        try {
            System.out.println("Vai Executar Conexão em buscar area (Consulta no banco)");
            rs = ConnectionFactory.stmt.executeQuery(sql.toString());
            System.out.println("Executou Conexão em buscar area");
            
            //IF porque so tem 1 registro se fosse mais seria WHILE
            if (rs.next() == true) {
             user = new Usuario();
             user.setLogin(rs.getString("login"));
             user.setNome(rs.getString("nome"));
            }
            
        } catch (SQLException ex) {
            System.out.println("ERRO de SQL: " + ex.getMessage().toString());
            return user;
            
        }finally{
            Connection con = ConnectionFactory.getConnection();
            System.out.println("Vai fechar a conexão com o banco de dados");
            ConnectionFactory.closeConnection(con);
        }
        
        return user;
        
    }
    
}
