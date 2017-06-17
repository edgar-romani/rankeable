/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.modelo.Usuario;
import br.ufpr.rankeable.jdbc.MysqlConnectionFactory;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class JdbcUsuarioDao {

    private Connection connection;
     

    public JdbcUsuarioDao() {
        connection = (new MysqlConnectionFactory()).getConnection();
    }

    public boolean existeUsuario(Usuario usuario) throws SQLException {
              String sql = "select * from usuarios where nome = ? and senha = ? ";        
       
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            
            ResultSet rs = stmt.executeQuery();
             // Se existir registr
            if (rs.next()){  
                
                return true;                 
                 // Existe o usuario  
             } else {
                 return false;
                 // Nao existe o usuario  
             }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }       
     
    }   
    
}
//if(userName.equals(request.getParameter("user"))
//&& passwrd.equals(request.getParameter("pass"))){