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
import model.tpPagamento;

/**
 *
 * @author jonasdhein
 */
public class tpPagamentoController {
    
    tpPagamento objTpPagamento;
    
    JTable jtbTpPag = null;
    
    public tpPagamentoController(tpPagamento objTpPagamento, JTable jtbTpPag) {
        this.objTpPagamento = objTpPagamento;
        this.jtbTpPag = jtbTpPag;
    }
    
    
    
    public tpPagamento buscarTpPag(String coluna1)
    {
        try {
            ConnectionFactory.abreConexao();
            ResultSet rs = null;

            String SQL = "";
            SQL = " SELECT cod_tppag, nom_tppag ";
            SQL += " FROM tp_pagamento ";
            SQL += " WHERE cod_tppag = '" + coluna1 + "'";

            try{
                System.out.println("Vai Executar Conexão em buscar Tipo de Pagamento");
                rs = ConnectionFactory.stmt.executeQuery(SQL);
                System.out.println("Executou Conexão em buscar Tipo de pagamento");

                objTpPagamento = new tpPagamento();
                
                if(rs.next() == true)
                {
                    objTpPagamento.setCodio(String.valueOf(rs.getInt(1)));
                    objTpPagamento.setNome(rs.getString(2));
                                       
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
        
        System.out.println ("Executou buscar Tipo de Pagamento com sucesso");
        return objTpPagamento;
    }
    
    
    
    
    
    
    
    
    public void PreencheUsuariosTpPag() {

        try{
            
        ConnectionFactory.abreConexao();
        
        Vector<String> cabecalhos = new Vector<String>();
        Vector dadosTabela = new Vector();
        cabecalhos.add("Codigo");
        cabecalhos.add("Nome");
               
        ResultSet result = null;
        
        try {

            String SQL = "";
            SQL = " SELECT cod_tppag, nom_tppag ";
            SQL += " FROM tipo_pagamento ";           
            SQL += " ORDER BY nom_tppag ";
            
            result = ConnectionFactory.stmt.executeQuery(SQL);

            while (result.next()) {
                Vector<Object> linha = new Vector<Object>();
                linha.add(result.getInt(1));
                linha.add(result.getString(2));
                dadosTabela.add(linha);
            }
            
        } catch (SQLException e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        jtbTpPag.setModel(new DefaultTableModel(dadosTabela, cabecalhos) {

            @Override
            public boolean isCellEditable(int row, int column) {
              return false;
            }
            // permite seleção de apenas uma linha da tabela
        });


        // permite seleção de apenas uma linha da tabela
        jtbTpPag.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < 3; i++) {
            column = jtbTpPag.getColumnModel().getColumn(i);
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
        
        jtbTpPag.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

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
    
  
    
        
        public boolean incluir(tpPagamento objTpPagamento){
        
        ConnectionFactory.abreConexao();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try {
            
            stmt = con.prepareStatement("INSERT INTO tipo_pagamento (nom_tppag)VALUES(?)");
            stmt.setString(1, objTpPagamento.getNome());
                        
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    
    }
        
         public boolean alterar(tpPagamento objTpPagamento){
        
        ConnectionFactory.abreConexao();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try {
            
            stmt = con.prepareStatement("UPDATE tipo_pagamento SET nom_tppag=? WHERE cod_tppag=?");
            stmt.setString(1, objTpPagamento.getNome());
            stmt.setInt(2, Integer.valueOf(objTpPagamento.getCodio()));
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
        
        public boolean excluir(tpPagamento objTpPagamento){
        
        ConnectionFactory.abreConexao();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM tipo_pagamento WHERE cod_cod_tppag=?");
            stmt.setInt(1, Integer.valueOf(objTpPagamento.getCodio()));
            
                        
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