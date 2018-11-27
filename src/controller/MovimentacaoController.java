/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Connection.ConnectionFactory;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Movimentacao;
import model.tpMovimentacao;


/**
 *
 * @author guilherme.klafki
 */
public class MovimentacaoController {
    
    
    Movimentacao objMovi;
    
    JTable jtbMovi = null;
    
    public MovimentacaoController(Movimentacao objMovi, JTable jtbMovi) {
        this.objMovi = objMovi;
        this.jtbMovi = jtbMovi;
    }
    
    
    public Movimentacao buscar(String coluna4)
    {
        try {
            ConnectionFactory.abreConexao();
            ResultSet rs = null;

            String SQL = "";                  
            SQL = " SELECT  cod_mov, m.cod_tpmov, m.cod_usu, m.cod_tppag, valor_mov, data_mov, des_rec ";
            SQL += " FROM  movimentacao m,tipo_movimentacao tm, tipo_pagamento tp, usuario u ";
            SQL += " WHERE m.cod_tpmov = tm.cod_tpmov AND m.cod_usu = u.cod_usu AND m.cod_tppag = tp.cod_tppag AND cod_mov = '" + coluna4 + "'";
            

            try{
                System.out.println("Vai Executar Conexão em buscar Movimentação");
                rs = ConnectionFactory.stmt.executeQuery(SQL);
                System.out.println("Executou Conexão em buscar Movimentação");

                objMovi = new Movimentacao();
                
                if(rs.next() == true)
                {
                    objMovi.setCodigo_movi(rs.getInt(1));
                    objMovi.setCodigo_tpmovi(rs.getInt(2));
                    objMovi.setCodigo_usu(rs.getInt(3));
                    objMovi.setCodigo_tppag(rs.getInt(4));
                    objMovi.setValor(rs.getString(5));
                    objMovi.setData(String.valueOf(rs.getDate(6)));
                    
                    objMovi.setRec_des(rs.getString(7));
                    
                    
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
        
        System.out.println ("Executou buscar Movimentação com sucesso");
        return objMovi;
    }
    
    public void PreencheTabelaMovi() {

        try{
            
        ConnectionFactory.abreConexao();
        
        Vector<String> cabecalhos = new Vector<String>();
        Vector dadosTabela = new Vector();
        cabecalhos.add("Codigo Movimentação");
        cabecalhos.add("Codigo Tipo Movimentaçao");
        cabecalhos.add("Codigo Usuário");
        cabecalhos.add("Codigo Tipo Pagamento");
        cabecalhos.add("Valor");
        cabecalhos.add("Data");
        cabecalhos.add("Despesa/Receita");
        
        ResultSet result = null;
        
        try {

            String SQL = "";
            SQL = " SELECT  cod_mov, m.cod_tpmov, m.cod_usu, m.cod_tppag, valor_mov, data_mov, des_rec ";
            SQL += " FROM  movimentacao m,tipo_movimentacao tm, tipo_pagamento tp, usuario u ";
            SQL += " WHERE m.cod_tpmov = tm.cod_tpmov AND m.cod_usu = u.cod_usu AND m.cod_tppag = tp.cod_tppag ";
            SQL += " ORDER BY cod_mov ";
            
            result = ConnectionFactory.stmt.executeQuery(SQL);

            while (result.next()) {
                Vector<Object> linha = new Vector<Object>();
                linha.add(result.getInt(1));
                linha.add(result.getInt(2));
                linha.add(result.getInt(3));
                linha.add(result.getInt(4));
                linha.add(result.getInt(5));
                linha.add(result.getString(6));
                linha.add(result.getString(7));
                dadosTabela.add(linha);
            }
            
        } catch (SQLException e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        jtbMovi.setModel(new DefaultTableModel(dadosTabela, cabecalhos) {

            @Override
            public boolean isCellEditable(int row, int column) {
              return false;
            }
            // permite seleção de apenas uma linha da tabela
        });


        // permite seleção de apenas uma linha da tabela
        jtbMovi.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < 3; i++) {
            column = jtbMovi.getColumnModel().getColumn(i);
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
        
        jtbMovi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

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
    
    public boolean incluir(Movimentacao objMovi){
        
        ConnectionFactory.abreConexao();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try {
            
            stmt = con.prepareStatement("INSERT INTO movimentacao (cod_tpmov, cod_usu, cod_tppag, valor_mov, data_mov, des_rec)VALUES(?,?,?,?,?,?)");
            stmt.setInt(1, objMovi.getCodigo_tpmovi());
            stmt.setInt(2, objMovi.getCodigo_usu());
            stmt.setInt(3, objMovi.getCodigo_tppag());
            stmt.setInt(4, (Integer.parseInt(objMovi.getValor())));
            stmt.setDate(5, Date.valueOf(objMovi.getData()));
            stmt.setString(6, objMovi.getRec_des());
            
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    
    }
    
    public boolean alterar(Movimentacao objMovi){
        
        ConnectionFactory.abreConexao();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try {
            
            stmt = con.prepareStatement("UPDATE movimentacao SET cod_tpmov=?, cod_usu=?, cod_tppag=?, valor_mov=?, data_mov=?, des_rec=? WHERE cod_mov=?");
            stmt.setInt(1, objMovi.getCodigo_tpmovi());
            stmt.setInt(2, objMovi.getCodigo_usu());
            stmt.setInt(3, objMovi.getCodigo_tppag());
            stmt.setInt(4, Integer.valueOf(objMovi.getValor()));            
            stmt.setDate(5, Date.valueOf(objMovi.getData()));
            stmt.setString(6, objMovi.getRec_des());
            stmt.setInt(7, objMovi.getCodigo_movi());
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }       
        
    }
    
    
    public boolean excluir(Movimentacao objMovi){
        
        ConnectionFactory.abreConexao();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM movimentacao WHERE cod_mov=?");
            stmt.setInt(1, Integer.valueOf(objMovi.getCodigo_movi()));
            
                        
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
