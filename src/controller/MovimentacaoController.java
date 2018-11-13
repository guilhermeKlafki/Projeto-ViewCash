/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Connection.ConnectionFactory;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Movimentacao;


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
            SQL = " SELECT  cod_mov, cod_tpmov, cod_usu, cod_tppag, valor_mov, data_mov, des_rec ";
            SQL += " FROM  movimentacao m,tipo_movimentacao tm, tipo_pagamento tp, usuario u ";
            SQL += " WHARE m.cod_tpmovi = tm.cod_tpmovi AND m.cod_usu = u.cod_usu ADN m.cod_tppag = tp.cod_tppag ";
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
    
}
