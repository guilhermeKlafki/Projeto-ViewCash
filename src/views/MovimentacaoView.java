/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controller.MovimentacaoController;
import controller.tpMovimentacaoController;
import ferramentas.CaixaDeDialogo;
import ferramentas.*;
import javax.swing.JOptionPane;
import model.Movimentacao;

/**
 *
 * @author Guilherme Klafki
 */
public class MovimentacaoView extends javax.swing.JFrame {

    Movimentacao objMovi;
    
    /**
     * Creates new form MovimentacaoView
     */
    Combos cbTpMovi;
    Combos cbTppag;
    Combos cbCombo;
    
    public MovimentacaoView() {
        initComponents();
        MovimentacaoController moviCon = new MovimentacaoController(null, jtbMovi);
        moviCon.PreencheTabelaMovi();
        limparTelaMovi();
        
        try {
            //carregar os alunos existentes
            atualizaMovimentacao();
            
            ferramentas.Formatacao.colocaMascara(teste_data, "##/##/####");

            //carregar os cursos existentes
            cbTpMovi = new Combos(jComboBoxTipoMovimentacao);
            cbTpMovi.PreencheCombo("SELECT cod_tpmov, nom_tpmov FROM tipo_movimentacao ORDER BY nom_tpmov");
            
            cbTppag = new Combos(jComboBoxTipoPagamento);
            cbTppag.PreencheCombo("SELECT cod_tppag, nom_tppag FROM tipo_pagamento ORDER BY nom_tppag");
            
            limparTelaMovi();

        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("ERRO:" + ex.getMessage());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        lblMovimentacao = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lvltpPagamento = new javax.swing.JLabel();
        jComboBoxTipoPagamento = new javax.swing.JComboBox<>();
        radioDespesa = new javax.swing.JRadioButton();
        radioReceita = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblTPmovimetacao = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        jComboBoxTipoMovimentacao = new javax.swing.JComboBox<>();
        btnInserir_movi = new javax.swing.JButton();
        btnLimpar_movi = new javax.swing.JButton();
        btnExcluir_movi = new javax.swing.JButton();
        btnVoltar_movi = new javax.swing.JButton();
        btnAlterar_movi = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        teste_data = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbMovi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 1000));

        lblMovimentacao.setBackground(new java.awt.Color(204, 204, 204));
        lblMovimentacao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMovimentacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMovimentacao.setText("Cadastro de Movimentação");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lvltpPagamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lvltpPagamento.setText("Tipo de Pagamento:");

        jComboBoxTipoPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(radioDespesa);
        radioDespesa.setText("Despesa");
        radioDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDespesaActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioReceita);
        radioReceita.setText("Receita");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Selecione a opção de entrada da movimentação:");

        lblData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblData.setText("Data:");

        lblTPmovimetacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTPmovimetacao.setText("Tipo de Movimetação:");

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblValor.setText("Valor:");

        jComboBoxTipoMovimentacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTipoMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoMovimentacaoActionPerformed(evt);
            }
        });

        btnInserir_movi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/inserir.png"))); // NOI18N
        btnInserir_movi.setText("Inserir");
        btnInserir_movi.setPreferredSize(new java.awt.Dimension(80, 30));
        btnInserir_movi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserir_moviActionPerformed(evt);
            }
        });

        btnLimpar_movi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/limpar.png"))); // NOI18N
        btnLimpar_movi.setText("Limpar");
        btnLimpar_movi.setPreferredSize(new java.awt.Dimension(80, 30));
        btnLimpar_movi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar_moviActionPerformed(evt);
            }
        });

        btnExcluir_movi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        btnExcluir_movi.setText("Excluir");
        btnExcluir_movi.setPreferredSize(new java.awt.Dimension(80, 28));
        btnExcluir_movi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir_moviActionPerformed(evt);
            }
        });

        btnVoltar_movi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/voltar.png"))); // NOI18N
        btnVoltar_movi.setText("Voltar");
        btnVoltar_movi.setPreferredSize(new java.awt.Dimension(80, 28));
        btnVoltar_movi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar_moviActionPerformed(evt);
            }
        });

        btnAlterar_movi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/alterar.png"))); // NOI18N
        btnAlterar_movi.setText("Alterar");
        btnAlterar_movi.setPreferredSize(new java.awt.Dimension(80, 30));
        btnAlterar_movi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar_moviActionPerformed(evt);
            }
        });

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo:");

        txtCodigo.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTPmovimetacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblData)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(radioDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(radioReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lvltpPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxTipoMovimentacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValor)
                                .addGap(210, 210, 210)
                                .addComponent(teste_data, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 453, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInserir_movi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar_movi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir_movi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar_movi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar_movi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnInserir_movi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar_movi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir_movi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar_movi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnVoltar_movi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioDespesa)
                            .addComponent(radioReceita))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTPmovimetacao)
                            .addComponent(jComboBoxTipoMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lvltpPagamento)
                            .addComponent(jComboBoxTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValor)
                            .addComponent(teste_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtbMovi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbMovi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbMoviMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbMovi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMovimentacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDespesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDespesaActionPerformed

    private void jComboBoxTipoMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoMovimentacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoMovimentacaoActionPerformed

    public boolean verificarCamposTpMovi() {
        
         if(radioDespesa.isSelected() == false && radioReceita.isSelected() == false){
               CaixaDeDialogo.obterinstancia().exibirMensagem("Selecione: Receita ou Despesa!", "Erro", 'e');
               return false;
            }
        
        if (txtData.getText().trim().equals("")) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Campo Data está em branco!", "Erro", 'e');
            txtData.requestFocus();            
            return false; 
            
        }if (txtValor.getText().trim().equals("")) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Campo Valor está em branco!", "Erro", 'e');
            txtValor.requestFocus();            
            return false;
        }
        return true;
    }
    
     public void atualizaMovimentacao(){
        MovimentacaoController moviCon = new MovimentacaoController(null, jtbMovi);
        moviCon.PreencheTabelaMovi();
        
    }
     
     private void limparTelaMovi() {
        try {
            //LIMPAR OS CAMPOS DA TELA
            
            
           buttonGroup1.clearSelection();
           //cbTpMovi.SetaComboBox("");
           //cbTppag.SetaComboBox("");
           txtData.setText("");
           txtValor.setText("");
          
            
            // Não deixa o botão Alterar aparecer na tela
            btnAlterar_movi.setVisible(false);
            btnExcluir_movi.setVisible(false);
            btnInserir_movi.setVisible(true);
        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage());
        }
    }
     
     private void preencheCamposMovi() {
        try {
            // atulização 18:44
            
            cbTpMovi.SetaComboBox(String.valueOf(objMovi.getCodigo_tpmovi()));
            cbTppag.SetaComboBox(String.valueOf(objMovi.getCodigo_tppag()));
            //.setText(objTpMovimentacao.getNome());
            
            //AJUSTA A DATA PARA DIA-MES-ANO PARA MOSRAR NOS CAMPOS
            String dataFormatada = Formatacao.ajustaDataDMA(objMovi.getData());
            objMovi.setData(dataFormatada);
            
            txtData.setText(dataFormatada);
            txtValor.setText(String.valueOf(objMovi.getValor()));
            
            if(objMovi.getRec_des().equals("D")){
                radioDespesa.setSelected(true);
            }else{
                radioReceita.setSelected(true);
            }
                        
           txtCodigo.setText(String.valueOf(objMovi.getCodigo_movi()));
           
            
            // Deixa o botão Alterar aparecer na tela
            btnAlterar_movi.setVisible(true);
            btnExcluir_movi.setVisible(true);
            btnInserir_movi.setVisible(false);
            
            

        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage());
        }
    }
     
    
    private void btnInserir_moviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserir_moviActionPerformed
        // TODO add your handling code here:
       if (verificarCamposTpMovi()== true) {           
    

            objMovi = new Movimentacao();
            MovimentacaoController moviCon = new MovimentacaoController(null, jtbMovi);
            try {
                if(radioDespesa.isSelected()){
                    objMovi.setRec_des("D");
                }
                 else{
                    objMovi.setRec_des("R");
                    }
                
                //RECUPERANDO O CODIGO DO CURSO DO JCOMBOBOX
            Combos c1 = (Combos) jComboBoxTipoMovimentacao.getSelectedItem();
            String codigoCursoTpMovi = c1.getCodigo();
            objMovi.setCodigo_tpmovi(Integer.parseInt(codigoCursoTpMovi));
            
            //RECUPERANDO O CODIGO DO CURSO DO JCOMBOBOX
            Combos c2 = (Combos) jComboBoxTipoPagamento.getSelectedItem();
            String codigoCursoTpPag = c2.getCodigo();
            objMovi.setCodigo_tppag(Integer.parseInt(codigoCursoTpPag));
            // Tem que pegar o codigo do usuáio ao logar -
            objMovi.setCodigo_usu(Integer.parseInt(LoginView.user.getCodio()));
         
            //objMovi.setCodigo_tpmovi(Integer.parseInt(cbTpMovi.getCodigo()));
            //objMovi.setCodigo_tppag(Integer.parseInt(cbTpMovi.getCodigo()));
            
            //AJUSTA A DATA PARA ANO-MES-DIA PARA GRAVAR NO BANCO
            String dataFormatada = Formatacao.ajustaDataAMD(txtData.getText());
            objMovi.setData(dataFormatada);
                       
            objMovi.setValor(txtValor.getText());
            

            moviCon.incluir(objMovi);
            atualizaMovimentacao();

            JOptionPane.showMessageDialog(null, "Movimentação inserido com sucesso !!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (Exception ex) {
                CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage());
            }
            
            
            
        }
        
    }//GEN-LAST:event_btnInserir_moviActionPerformed

    private void btnLimpar_moviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar_moviActionPerformed
       limparTelaMovi();
    }//GEN-LAST:event_btnLimpar_moviActionPerformed

    private void btnExcluir_moviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir_moviActionPerformed
        
        objMovi = new Movimentacao();
        MovimentacaoController moviCon = new MovimentacaoController(objMovi, null);
        objMovi.setCodigo_movi(Integer.parseInt(txtCodigo.getText()));
        moviCon.excluir(objMovi);
        atualizaMovimentacao();
        limparTelaMovi();
        
    }//GEN-LAST:event_btnExcluir_moviActionPerformed

    private void btnVoltar_moviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar_moviActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltar_moviActionPerformed

    private void btnAlterar_moviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar_moviActionPerformed
        
        if (verificarCamposTpMovi()== true) {           
    

            objMovi = new Movimentacao();
            MovimentacaoController moviCon = new MovimentacaoController(null, jtbMovi);
            try{
                if(radioDespesa.isSelected()){
                    objMovi.setRec_des("D");
                }
                 else{
                    objMovi.setRec_des("R");
                    }
                
                //RECUPERANDO O CODIGO DO CURSO DO JCOMBOBOX
            Combos c1 = (Combos) jComboBoxTipoMovimentacao.getSelectedItem();
            String codigoCursoTpMovi = c1.getCodigo();
            objMovi.setCodigo_tpmovi(Integer.parseInt(codigoCursoTpMovi));
            
            //RECUPERANDO O CODIGO DO CURSO DO JCOMBOBOX
            Combos c2 = (Combos) jComboBoxTipoPagamento.getSelectedItem();
            String codigoCursoTpPag = c2.getCodigo();
            objMovi.setCodigo_tppag(Integer.parseInt(codigoCursoTpPag));
            // Tem que pegar o codigo do usuáio ao logar -
            objMovi.setCodigo_usu(Integer.parseInt(LoginView.user.getCodio()));
         
            //objMovi.setCodigo_tpmovi(Integer.parseInt(cbTpMovi.getCodigo()));
            //objMovi.setCodigo_tppag(Integer.parseInt(cbTpMovi.getCodigo()));
            
            //AJUSTA A DATA PARA ANO-MES-DIA PARA GRAVAR NO BANCO
            String dataFormatada = Formatacao.ajustaDataAMD(txtData.getText());
            objMovi.setData(dataFormatada);
                       
            objMovi.setValor(txtValor.getText());
            objMovi.setCodigo_movi(Integer.parseInt(txtCodigo.getText()));
            

            moviCon.alterar(objMovi);
            atualizaMovimentacao();
         
            
            
            JOptionPane.showMessageDialog(null, "Movimentação alterada com sucesso !!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (Exception ex) {
                CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage());
            }
            
            
        }
        
    }//GEN-LAST:event_btnAlterar_moviActionPerformed

    private void jtbMoviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbMoviMouseClicked
        // TODO add your handling code here:
        
        //pega a linha selecionada
   int linhaSelecionada = jtbMovi.getSelectedRow();
   // Primeira coluna da linha
   String coluna4 = jtbMovi.getModel().getValueAt(linhaSelecionada, 0).toString();
 
   //basta agora chamar o método buscar, passando o COLUNA1 como parâmetro de consulta
  MovimentacaoController moviCon = new MovimentacaoController(null, null);  
   objMovi = moviCon.buscar(coluna4);
   
   preencheCamposMovi();
        
        
        
        
    }//GEN-LAST:event_jtbMoviMouseClicked

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MovimentacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovimentacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovimentacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovimentacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovimentacaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar_movi;
    private javax.swing.JButton btnExcluir_movi;
    private javax.swing.JButton btnInserir_movi;
    private javax.swing.JButton btnLimpar_movi;
    private javax.swing.JButton btnVoltar_movi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> jComboBoxTipoMovimentacao;
    private javax.swing.JComboBox<String> jComboBoxTipoPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtbMovi;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblMovimentacao;
    private javax.swing.JLabel lblTPmovimetacao;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lvltpPagamento;
    private javax.swing.JRadioButton radioDespesa;
    private javax.swing.JRadioButton radioReceita;
    private javax.swing.JFormattedTextField teste_data;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
