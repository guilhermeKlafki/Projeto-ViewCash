/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controller.tpMovimentacaoController;
import ferramentas.CaixaDeDialogo;
import javax.swing.JOptionPane;
import model.tpMovimentacao;

/**
 *
 * @author Guilherme Klafki
 */
public class TipoMovimentacaoView extends javax.swing.JFrame {

    tpMovimentacao objTpMovimentacao;
    
    /**
     * Creates new form TipoMovimentacaoView
     */
    public TipoMovimentacaoView() {
        initComponents();
        tpMovimentacaoController tpmoviCon = new tpMovimentacaoController(null, jtbTpMovi);
        tpmoviCon.PreencheTabelaTpMovi();
        limparTelaTpMovi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome_tpMovi = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao_tpMovi = new javax.swing.JTextArea();
        lblCodigo_tpMovi = new javax.swing.JLabel();
        txtCodigo_tpMovi = new javax.swing.JTextField();
        btnInserir_tpMovi = new javax.swing.JButton();
        btnLimpar_tpMovi = new javax.swing.JButton();
        btnExcluir_tpMovi = new javax.swing.JButton();
        btnVoltar_tpMovi = new javax.swing.JButton();
        btnAlterar_tpMovi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTpMovi = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome do Tipo de Movimentação:");

        txtNome_tpMovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome_tpMoviActionPerformed(evt);
            }
        });

        lblDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDescricao.setText("Descrição:");

        txtDescricao_tpMovi.setColumns(20);
        txtDescricao_tpMovi.setRows(5);
        jScrollPane2.setViewportView(txtDescricao_tpMovi);

        lblCodigo_tpMovi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo_tpMovi.setText("Codigo:");

        txtCodigo_tpMovi.setEditable(false);
        txtCodigo_tpMovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo_tpMoviActionPerformed(evt);
            }
        });

        btnInserir_tpMovi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/inserir.png"))); // NOI18N
        btnInserir_tpMovi.setText("Inserir");
        btnInserir_tpMovi.setPreferredSize(new java.awt.Dimension(80, 30));
        btnInserir_tpMovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserir_tpMoviActionPerformed(evt);
            }
        });

        btnLimpar_tpMovi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/limpar.png"))); // NOI18N
        btnLimpar_tpMovi.setText("Limpar");
        btnLimpar_tpMovi.setPreferredSize(new java.awt.Dimension(80, 30));
        btnLimpar_tpMovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar_tpMoviActionPerformed(evt);
            }
        });

        btnExcluir_tpMovi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        btnExcluir_tpMovi.setText("Excluir");
        btnExcluir_tpMovi.setPreferredSize(new java.awt.Dimension(80, 28));
        btnExcluir_tpMovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir_tpMoviActionPerformed(evt);
            }
        });

        btnVoltar_tpMovi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/voltar.png"))); // NOI18N
        btnVoltar_tpMovi.setText("Voltar");
        btnVoltar_tpMovi.setPreferredSize(new java.awt.Dimension(80, 28));
        btnVoltar_tpMovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar_tpMoviActionPerformed(evt);
            }
        });

        btnAlterar_tpMovi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/alterar.png"))); // NOI18N
        btnAlterar_tpMovi.setText("Alterar");
        btnAlterar_tpMovi.setPreferredSize(new java.awt.Dimension(80, 30));
        btnAlterar_tpMovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar_tpMoviActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNome_tpMovi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(txtCodigo_tpMovi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodigo_tpMovi, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInserir_tpMovi, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(btnAlterar_tpMovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir_tpMovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar_tpMovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar_tpMovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCodigo_tpMovi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo_tpMovi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome_tpMovi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnInserir_tpMovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar_tpMovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir_tpMovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar_tpMovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnVoltar_tpMovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtbTpMovi.setModel(new javax.swing.table.DefaultTableModel(
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
        jtbTpMovi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbTpMoviMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbTpMovi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(102, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro - Tipo de Movimentação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNome_tpMoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome_tpMoviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome_tpMoviActionPerformed

    private void txtCodigo_tpMoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo_tpMoviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo_tpMoviActionPerformed

    public boolean verificarCamposTpMovi() {
        if (txtNome_tpMovi.getText().trim().equals("")) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Campo Nome está em branco!", "Erro", 'e');
            //JOptionPane.showMessageDialog(null, "Campo Nome está em branco!", "Erro", JOptionPane.ERROR_MESSAGE);
            txtNome_tpMovi.requestFocus();
            return false;           
        }if (txtDescricao_tpMovi.getText().trim().equals("")) {
            Boolean wRetorno = CaixaDeDialogo.obterinstancia().pedirConfirmacao("Campo descrição está em branco. Incluir mesmo assim?" , "Atenção", 'p');
            txtDescricao_tpMovi.requestFocus();
            return wRetorno;
        }
        return true;
    }
    
    public void atualizaTpMovimentacao(){
        tpMovimentacaoController tpmoviCon = new tpMovimentacaoController(null, jtbTpMovi);
        tpmoviCon.PreencheTabelaTpMovi();
    }
    
    private void limparTelaTpMovi() {
        try {
            //LIMPAR OS CAMPOS DA TELA
            //LIBERAR O CAMPO MATRICULA

            txtCodigo_tpMovi.setText("");
            txtNome_tpMovi.setText("");
            txtDescricao_tpMovi.setText("");
            
            // Não deixa o botão Alterar aparecer na tela
            btnAlterar_tpMovi.setVisible(false);
            btnExcluir_tpMovi.setVisible(false);
            btnInserir_tpMovi.setVisible(true);
        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage());
        }
    }
    
    private void preencheCamposTpMovi() {
        try {
            // atulização 18:44
            
            txtNome_tpMovi.setText(objTpMovimentacao.getNome());
            txtCodigo_tpMovi.setText(objTpMovimentacao.getCodigo());
            txtDescricao_tpMovi.setText(objTpMovimentacao.getDescricao());
            // Deixa o botão Alterar aparecer na tela
            btnAlterar_tpMovi.setVisible(true);
            btnExcluir_tpMovi.setVisible(true);
            btnInserir_tpMovi.setVisible(false);

        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage());
        }
    }
    
    
    
    private void btnInserir_tpMoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserir_tpMoviActionPerformed
        // TODO add your handling code here:
        if (verificarCamposTpMovi()== true) {

            objTpMovimentacao = new tpMovimentacao();
            tpMovimentacaoController tpmoviCon = new tpMovimentacaoController(null, jtbTpMovi);

            objTpMovimentacao.setNome(txtNome_tpMovi.getText());
            objTpMovimentacao.setDescricao(txtDescricao_tpMovi.getText());
            
            tpmoviCon.incluir(objTpMovimentacao);
            atualizaTpMovimentacao();

            JOptionPane.showMessageDialog(null, "Tipo de Movimentação inserido com sucesso !!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnInserir_tpMoviActionPerformed

    private void btnLimpar_tpMoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar_tpMoviActionPerformed
        limparTelaTpMovi();
    }//GEN-LAST:event_btnLimpar_tpMoviActionPerformed

    private void btnExcluir_tpMoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir_tpMoviActionPerformed

        objTpMovimentacao = new tpMovimentacao();
        tpMovimentacaoController tpmoviCon = new tpMovimentacaoController(objTpMovimentacao, null);
        objTpMovimentacao.setCodigo(txtCodigo_tpMovi.getText());
        tpmoviCon.excluir(objTpMovimentacao);
        atualizaTpMovimentacao();
        limparTelaTpMovi();

    }//GEN-LAST:event_btnExcluir_tpMoviActionPerformed

    private void btnVoltar_tpMoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar_tpMoviActionPerformed
        dispose();

    }//GEN-LAST:event_btnVoltar_tpMoviActionPerformed

    private void btnAlterar_tpMoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar_tpMoviActionPerformed

       if(verificarCamposTpMovi()== false) {

            objTpMovimentacao = new tpMovimentacao();
             tpMovimentacaoController tpmoviCon = new tpMovimentacaoController(objTpMovimentacao, null);

            
            objTpMovimentacao.setNome(txtNome_tpMovi.getText());            
            objTpMovimentacao.setCodigo(txtCodigo_tpMovi.getText());
            objTpMovimentacao.setDescricao(txtDescricao_tpMovi.getText());
            tpmoviCon.alterar(objTpMovimentacao);
            atualizaTpMovimentacao();
            limparTelaTpMovi();
        }
    }//GEN-LAST:event_btnAlterar_tpMoviActionPerformed

    private void jtbTpMoviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTpMoviMouseClicked
        // TODO add your handling code here:
        //pega a linha selecionada
   int linhaSelecionada = jtbTpMovi.getSelectedRow();
   // Primeira coluna da linha
   String coluna3 = jtbTpMovi.getModel().getValueAt(linhaSelecionada, 0).toString();
 
   //basta agora chamar o método buscar, passando o COLUNA1 como parâmetro de consulta
  tpMovimentacaoController tpmoviCon = new tpMovimentacaoController(null, null);  
   objTpMovimentacao = tpmoviCon.buscar(coluna3);
   
   preencheCamposTpMovi();

        
    }//GEN-LAST:event_jtbTpMoviMouseClicked

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
            java.util.logging.Logger.getLogger(TipoMovimentacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoMovimentacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoMovimentacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoMovimentacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoMovimentacaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar_tpMovi;
    private javax.swing.JButton btnExcluir_tpMovi;
    private javax.swing.JButton btnInserir_tpMovi;
    private javax.swing.JButton btnLimpar_tpMovi;
    private javax.swing.JButton btnVoltar_tpMovi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable jtbTpMovi;
    private javax.swing.JLabel lblCodigo_tpMovi;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JTextField txtCodigo_tpMovi;
    private javax.swing.JTextArea txtDescricao_tpMovi;
    private javax.swing.JTextField txtNome_tpMovi;
    // End of variables declaration//GEN-END:variables
}
