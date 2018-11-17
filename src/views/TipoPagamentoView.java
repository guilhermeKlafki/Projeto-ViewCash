/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controller.tpPagamentoController;
import ferramentas.CaixaDeDialogo;
import javax.swing.JOptionPane;
import model.tpPagamento;

/**
 *
 * @author Guilherme Klafki
 */
public class TipoPagamentoView extends javax.swing.JFrame {

    tpPagamento objTpPagamento; 
    
    /**
     * Creates new form TipoPagamentoView
     */
    public TipoPagamentoView() {
        initComponents();
        tpPagamentoController tppagCon = new tpPagamentoController(null, jtbTpPag);
        tppagCon.PreencheTabelaTpPag();
        limparTelaTpPag();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        txtMatricula = new javax.swing.JFormattedTextField();
        lblData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcbCursos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbAlunos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblTipoPagamento = new javax.swing.JLabel();
        txtNome_TpPagamento = new javax.swing.JTextField();
        btnInserir_tpPag = new javax.swing.JButton();
        btnLimpar_tpPag = new javax.swing.JButton();
        btnExcluir_tpPag = new javax.swing.JButton();
        btnVoltar_tpPag = new javax.swing.JButton();
        btnAlterar_tpPag = new javax.swing.JButton();
        lblCodigo_tpPag = new javax.swing.JLabel();
        txtCodigo_tpPag = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbTpPag = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("Lista dos alunos já cadastrados");

        lblMatricula.setText("Matrícula");

        btnIncluir.setText("INCLUIR");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        lblData.setText("Data");

        jLabel1.setText("Nome");

        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jLabel2.setText("E-mail");

        btnDeletar.setText("DELETAR");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        jLabel3.setText("Curso");

        jcbCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCursosActionPerformed(evt);
            }
        });

        jtbAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título 1", "Título 2", "Título 3"
            }
        ));
        jtbAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbAlunos);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTipoPagamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTipoPagamento.setText(" Nome do Tipo de Pagamento:");

        btnInserir_tpPag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/inserir.png"))); // NOI18N
        btnInserir_tpPag.setText("Inserir");
        btnInserir_tpPag.setPreferredSize(new java.awt.Dimension(80, 30));
        btnInserir_tpPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserir_tpPagActionPerformed(evt);
            }
        });

        btnLimpar_tpPag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/limpar.png"))); // NOI18N
        btnLimpar_tpPag.setText("Limpar");
        btnLimpar_tpPag.setPreferredSize(new java.awt.Dimension(80, 30));
        btnLimpar_tpPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar_tpPagActionPerformed(evt);
            }
        });

        btnExcluir_tpPag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        btnExcluir_tpPag.setText("Excluir");
        btnExcluir_tpPag.setPreferredSize(new java.awt.Dimension(80, 28));
        btnExcluir_tpPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir_tpPagActionPerformed(evt);
            }
        });

        btnVoltar_tpPag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/voltar.png"))); // NOI18N
        btnVoltar_tpPag.setText("Voltar");
        btnVoltar_tpPag.setPreferredSize(new java.awt.Dimension(80, 28));
        btnVoltar_tpPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar_tpPagActionPerformed(evt);
            }
        });

        btnAlterar_tpPag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/alterar.png"))); // NOI18N
        btnAlterar_tpPag.setText("Alterar");
        btnAlterar_tpPag.setPreferredSize(new java.awt.Dimension(80, 30));
        btnAlterar_tpPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar_tpPagActionPerformed(evt);
            }
        });

        lblCodigo_tpPag.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo_tpPag.setText("Codigo:");

        txtCodigo_tpPag.setEditable(false);
        txtCodigo_tpPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo_tpPagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoPagamento)
                    .addComponent(txtNome_TpPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo_tpPag, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo_tpPag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInserir_tpPag, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(btnAlterar_tpPag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir_tpPag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar_tpPag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar_tpPag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnInserir_tpPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar_tpPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir_tpPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar_tpPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblCodigo_tpPag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo_tpPag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTipoPagamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome_TpPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar_tpPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtbTpPag.setModel(new javax.swing.table.DefaultTableModel(
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
        jtbTpPag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbTpPagMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtbTpPag);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cadastro de Tipo de Pagamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
     
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void jcbCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCursosActionPerformed

    private void jtbAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbAlunosMouseClicked
        
    }//GEN-LAST:event_jtbAlunosMouseClicked

    private void btnInserir_tpPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserir_tpPagActionPerformed
        // TODO add your handling code here:
        if (verificarCamposTpPag() == false) {

            objTpPagamento = new tpPagamento();
            tpPagamentoController tppagCon = new tpPagamentoController(null, jtbTpPag);

            objTpPagamento.setNome(txtNome_TpPagamento.getText());
            
            tppagCon.incluir(objTpPagamento);
            atualizaTpPagamento();
            limparTelaTpPag();

            JOptionPane.showMessageDialog(null, "Tipo de Pagamento inserido com sucesso !!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnInserir_tpPagActionPerformed

    private void btnLimpar_tpPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar_tpPagActionPerformed
        limparTelaTpPag();
    }//GEN-LAST:event_btnLimpar_tpPagActionPerformed

    private void btnExcluir_tpPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir_tpPagActionPerformed

        // (txtCodigo.getText().trim().equals(""))
        // JOptionPane.showMessageDialog(null, "Selecione um Cadastro na Tabela Para Excuir !", "Erro", JOptionPane.ERROR_MESSAGE);

        objTpPagamento = new tpPagamento();
        tpPagamentoController tppagCon = new tpPagamentoController(objTpPagamento, null);
        objTpPagamento.setCodigo(txtCodigo_tpPag.getText());
        tppagCon.excluir(objTpPagamento);
        atualizaTpPagamento();
        limparTelaTpPag();
    }//GEN-LAST:event_btnExcluir_tpPagActionPerformed

    private void btnVoltar_tpPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar_tpPagActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltar_tpPagActionPerformed

    private void btnAlterar_tpPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar_tpPagActionPerformed

       
        if(verificarCamposTpPag() == false) {

            objTpPagamento = new tpPagamento();
             tpPagamentoController tppagCon = new tpPagamentoController(objTpPagamento, null);

            
            objTpPagamento.setNome(txtNome_TpPagamento.getText());            
            objTpPagamento.setCodigo(txtCodigo_tpPag.getText());
            tppagCon.alterar(objTpPagamento);
            atualizaTpPagamento();
            limparTelaTpPag();
        }
    }//GEN-LAST:event_btnAlterar_tpPagActionPerformed

    private void txtCodigo_tpPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo_tpPagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo_tpPagActionPerformed

    private void jtbTpPagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTpPagMouseClicked
        
        //pega a linha selecionada
   int linhaSelecionada = jtbTpPag.getSelectedRow();
   // Primeira coluna da linha
   String coluna2 = jtbTpPag.getModel().getValueAt(linhaSelecionada, 0).toString();
 
   //basta agora chamar o método buscar, passando o COLUNA1 como parâmetro de consulta
  tpPagamentoController tppagCon = new tpPagamentoController(null, null);  
   objTpPagamento = tppagCon.buscarTpPag(coluna2);
   
   preencheCamposTpPag();
        
        
    }//GEN-LAST:event_jtbTpPagMouseClicked

    public boolean verificarCamposTpPag() {
        if (txtNome_TpPagamento.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Nome está em branco!", "Erro", JOptionPane.ERROR_MESSAGE);
            txtNome_TpPagamento.requestFocus();
            return true;           
        }
        return false;
    }
    
    public void atualizaTpPagamento(){
        tpPagamentoController tppagCon = new tpPagamentoController(null, jtbTpPag);
        tppagCon.PreencheTabelaTpPag();
    }
    
    private void limparTelaTpPag() {
        try {
            //LIMPAR OS CAMPOS DA TELA
            //LIBERAR O CAMPO MATRICULA

            txtCodigo_tpPag.setText("");
            txtNome_TpPagamento.setText("");
            
            // Não deixa o botão Alterar aparecer na tela
            btnAlterar_tpPag.setVisible(false);
            btnExcluir_tpPag.setVisible(false);
            btnInserir_tpPag.setVisible(true);
        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage());
        }
    }
    
     private void preencheCamposTpPag() {
        try {
            // atulização 18:44
            
            txtNome_TpPagamento.setText(objTpPagamento.getNome());
            txtCodigo_tpPag.setText(objTpPagamento.getCodigo());
            // Deixa o botão Alterar aparecer na tela
            btnAlterar_tpPag.setVisible(true);
            btnExcluir_tpPag.setVisible(true);
            btnInserir_tpPag.setVisible(false);

        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage());
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(TipoPagamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoPagamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoPagamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoPagamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoPagamentoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAlterar_tpPag;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnExcluir_tpPag;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnInserir_tpPag;
    private javax.swing.JButton btnLimpar_tpPag;
    private javax.swing.JButton btnVoltar_tpPag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcbCursos;
    private javax.swing.JTable jtbAlunos;
    private javax.swing.JTable jtbTpPag;
    private javax.swing.JLabel lblCodigo_tpPag;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblTipoPagamento;
    private javax.swing.JTextField txtCodigo_tpPag;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome_TpPagamento;
    // End of variables declaration//GEN-END:variables
}
