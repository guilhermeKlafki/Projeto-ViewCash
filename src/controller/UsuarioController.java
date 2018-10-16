/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Aluno;
import model.Usuario;

/**
 *
 * @author jonasdhein
 */
public class UsuarioController {
    
    Usuario objUsuario;
    
    JTable jtbUsuarios = null;
    
    public UsuarioController(Usuario objUsuario, JTable jtbUsuarios) {
        this.objUsuario = objUsuario;
        this.jtbUsuarios = jtbUsuarios;
    }
    
    
    
    public Usuario buscar(String coluna1)
    {
        try {
            ConnectionFactory.abreConexao();
            ResultSet rs = null;

            String SQL = "";
            SQL = " SELECT cod_usu, nom_usu, login, senha ";
            SQL += " FROM usuario ";
            SQL += " WHERE cod_usu = '" + coluna1 + "'";

            try{
                System.out.println("Vai Executar Conexão em buscar Usuarios");
                rs = ConnectionFactory.stmt.executeQuery(SQL);
                System.out.println("Executou Conexão em buscar Usuarios");

                objUsuario = new Usuario();
                
                if(rs.next() == true)
                {
                    objUsuario.setCodio(String.valueOf(rs.getInt(1)));
                    objUsuario.setNome(rs.getString(2));
                    objUsuario.setLogin(rs.getString(3));
                    objUsuario.setSenha(rs.getString(4));
                    
                }
                
               
            }

            catch (SQLException ex )
            {
                System.out.println("ERRO de SQL: " + ex.getMessage().toString());
                return null;
            }

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage().toString());
            return null;
        }
        
        System.out.println ("Executou buscar usuarios com sucesso");
        return objUsuario;
    }
    
    
    
    
    
    
    
    
    public void PreencheUsuarios() {

        try{
            
        ConnectionFactory.abreConexao();
        
        Vector<String> cabecalhos = new Vector<String>();
        Vector dadosTabela = new Vector();
        cabecalhos.add("Codigo");
        cabecalhos.add("Nome");
        cabecalhos.add("login");
        cabecalhos.add("Senha");
        
        ResultSet result = null;
        
        try {

            String SQL = "";
            SQL = " SELECT u.cod_usu, u.nom_usu, u.login, u.senha ";
            SQL += " FROM usuario u";           
            SQL += " ORDER BY u.nom_usu ";
            
            result = ConnectionFactory.stmt.executeQuery(SQL);

            while (result.next()) {
                Vector<Object> linha = new Vector<Object>();
                linha.add(result.getInt(1));
                linha.add(result.getString(2));
                linha.add(result.getString(3));
                linha.add(result.getString(4));
                dadosTabela.add(linha);
            }
            
        } catch (SQLException e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        jtbUsuarios.setModel(new DefaultTableModel(dadosTabela, cabecalhos) {

            @Override
            public boolean isCellEditable(int row, int column) {
              return false;
            }
            // permite seleção de apenas uma linha da tabela
        });


        // permite seleção de apenas uma linha da tabela
        jtbUsuarios.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < 3; i++) {
            column = jtbUsuarios.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(80);
                    break;
                case 1:
                    column.setPreferredWidth(150);
                    break;
                case 2:
                    column.setPreferredWidth(150);
                    break;
            }
        }
        
        jtbUsuarios.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected,
                        hasFocus, row, column);
                if (row % 2 == 0) {
                    setBackground(Color.LIGHT_GRAY);
                } else {
                    setBackground(Color.WHITE);
                }
                return this;
            }
        });
        //return (true);
        
        
        }catch(Exception ex){
            System.out.println("Erro: " + ex.getMessage().toString());
        }
    }
    
  
    
        
        public boolean incluir(Usuario objUsuario){
        
        ConnectionFactory.abreConexao();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try {
            
            stmt = con.prepareStatement("INSERT INTO usuario (login, nom_usu, senha)VALUES(?,?,?)");
            stmt.setString(1, objUsuario.getLogin());
            stmt.setString(2, objUsuario.getNome());
            stmt.setString(3, objUsuario.getSenha());
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    
    }
        
         public boolean alterar(Usuario objUsuario){
        
        ConnectionFactory.abreConexao();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try {
            
            stmt = con.prepareStatement("UPDATE usuario SET login=?, nom_usu=?, senha=? WHERE cod_usu=?");
            stmt.setString(1, objUsuario.getLogin());
            stmt.setString(2, objUsuario.getNome());
            stmt.setString(3, objUsuario.getSenha());
            stmt.setInt(4, Integer.valueOf(objUsuario.getCodio()));
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
        
        public boolean excluir(Usuario objUsuário){
        
        ConnectionFactory.abreConexao();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM usuario WHERE cod_usu=?");
            stmt.setInt(1, Integer.valueOf(objUsuario.getCodio()));
            
                        
            stmt.executeUpdate();
            
            return true;
            
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
        
                      


}