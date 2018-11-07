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
import model.tpMovimentacao;

/**
 *
 * @author jonasdhein
 */
public class tpMovimentacaoController {
    
    tpMovimentacao objTpMovimentacao;
    
    JTable jtbTpMovi = null;
    
    public tpMovimentacaoController(tpMovimentacao objTpMovimentacao, JTable jtbTpMovi) {
        this.objTpMovimentacao = objTpMovimentacao;
        this.jtbTpMovi = jtbTpMovi;
    }
    
    
    
    public tpMovimentacao buscar(String coluna3)
    {
        try {
            ConnectionFactory.abreConexao();
            ResultSet rs = null;

            String SQL = "";
            SQL = " SELECT cod_tpmov, nom_tpmov, des_tpmov";
            SQL += " FROM tipo_movimentacao ";
            SQL += " WHERE cod_tpmov = '" + coluna3 + "'";

            try{
                System.out.println("Vai Executar Conexão em buscar Tipo Movimentação");
                rs = ConnectionFactory.stmt.executeQuery(SQL);
                System.out.println("Executou Conexão em buscar Tipo Movimentação");

                objTpMovimentacao = new tpMovimentacao();
                
                if(rs.next() == true)
                {
                    objTpMovimentacao.setCodigo(String.valueOf(rs.getInt(1)));
                    objTpMovimentacao.setNome(rs.getString(2));
                    objTpMovimentacao.setDescricao(rs.getString(3));
                    
                    
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
        return objTpMovimentacao;
    }
    
    
    
    public ResultSet buscarRelatorio()
    {
        ResultSet rs = null;
        try {
            ConnectionFactory.abreConexao();
            
            String SQL = "";
            SQL = " SELECT * from tipo_movimentacao ";

            try{
                System.out.println("Vai Executar Conexão em buscar visitante");
                rs = ConnectionFactory.stmt.executeQuery(SQL);
            }

            catch (SQLException ex )
            {
                System.out.println("ERRO de SQL: " + ex.getMessage().toString());
                return rs;
            }

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage().toString());
            return rs;
        }
        
        System.out.println ("Executou buscar visitante com sucesso");
        return rs;
    }
    
    
    
    
    public void PreencheTabelaTpMovi() {

        try{
            
        ConnectionFactory.abreConexao();
        
        Vector<String> cabecalhos = new Vector<String>();
        Vector dadosTabela = new Vector();
        cabecalhos.add("Codigo");
        cabecalhos.add("Nome");
        cabecalhos.add("Descrição");
        
        
        ResultSet result = null;
        
        try {

            String SQL = "";
            SQL = " SELECT cod_tpmov, nom_tpmov, des_tpmov ";
            SQL += " FROM tipo_movimentacao ";           
            SQL += " ORDER BY nom_tpmov ";
            
            result = ConnectionFactory.stmt.executeQuery(SQL);

            while (result.next()) {
                Vector<Object> linha = new Vector<Object>();
                linha.add(result.getInt(1));
                linha.add(result.getString(2));
                linha.add(result.getString(3));
                dadosTabela.add(linha);
            }
            
        } catch (SQLException e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        jtbTpMovi.setModel(new DefaultTableModel(dadosTabela, cabecalhos) {

            @Override
            public boolean isCellEditable(int row, int column) {
              return false;
            }
            // permite seleção de apenas uma linha da tabela
        });


        // permite seleção de apenas uma linha da tabela
        jtbTpMovi.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < 3; i++) {
            column = jtbTpMovi.getColumnModel().getColumn(i);
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
        
        jtbTpMovi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

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
    
  
    
        
        public boolean incluir(tpMovimentacao objTpMovimentacao){
        
        ConnectionFactory.abreConexao();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try {
            
            stmt = con.prepareStatement("INSERT INTO tipo_movimentacao (nom_tpmov, des_tpmov)VALUES(?,?)");
            stmt.setString(1, objTpMovimentacao.getNome());
            stmt.setString(2, objTpMovimentacao.getDescricao());
            
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    
    }
        
         public boolean alterar(tpMovimentacao objTpMovimentacao){
        
        ConnectionFactory.abreConexao();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try {
            
            stmt = con.prepareStatement("UPDATE tipo_movimentacao SET nom_tpmov=?, des_tpmov=? WHERE cod_tpmov=?");
            stmt.setString(1, objTpMovimentacao.getNome());
            stmt.setString(2, objTpMovimentacao.getDescricao());
            stmt.setInt(3, Integer.valueOf(objTpMovimentacao.getCodigo()));
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
        
        public boolean excluir(tpMovimentacao objTpMovimentacao){
        
        ConnectionFactory.abreConexao();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM tipo_movimentacao WHERE cod_tpmov=?");
            stmt.setInt(1, Integer.valueOf(objTpMovimentacao.getCodigo()));
            
                        
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