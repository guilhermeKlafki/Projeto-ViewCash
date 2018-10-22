/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;


import controller.AlunoController;
import controller.UsuarioController;
import ferramentas.CaixaDeDialogo;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Usuario;


/**
 *
 * @author Windows
 */
public class UsuariosView extends javax.swing.JFrame {

    /**
     * Creates new form AlunosView
     */
    
    Usuario objUsuario;
    
    public UsuariosView() {
        initComponents();
        
        
        //Carregar os cursos existentes
        
        //Carregar os alunos existentes
        UsuarioController usuarioCon = new UsuarioController(null, jtbUsuario);
        usuarioCon.PreencheUsuarios();
        limparTela();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbUsuario = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lbllogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JFormattedTextField();
        txtSenha = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        btnInserir_usuario = new javax.swing.JButton();
        btnLimpar_usuario = new javax.swing.JButton();
        btnExcluir_usuario = new javax.swing.JButton();
        btnVoltar_usuarios = new javax.swing.JButton();
        btnAlterar_usuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título 1", "Título 2", "Título 3"
            }
        ));
        jtbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbUsuario);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Usuários Cadastrados:");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo.setText("Codigo:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome:");

        txtCodigo.setEditable(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        lbllogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbllogin.setText("Login:");

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSenha.setText("Senha:");

        btnInserir_usuario.setText("Inserir");
        btnInserir_usuario.setPreferredSize(new java.awt.Dimension(80, 30));
        btnInserir_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserir_usuarioActionPerformed(evt);
            }
        });

        btnLimpar_usuario.setText("Limpar");
        btnLimpar_usuario.setPreferredSize(new java.awt.Dimension(80, 30));
        btnLimpar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar_usuarioActionPerformed(evt);
            }
        });

        btnExcluir_usuario.setText("Excluir");
        btnExcluir_usuario.setPreferredSize(new java.awt.Dimension(80, 28));
        btnExcluir_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir_usuarioActionPerformed(evt);
            }
        });

        btnVoltar_usuarios.setText("Voltar");
        btnVoltar_usuarios.setPreferredSize(new java.awt.Dimension(80, 28));
        btnVoltar_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar_usuariosActionPerformed(evt);
            }
        });

        btnAlterar_usuario.setText("Alterar");
        btnAlterar_usuario.setPreferredSize(new java.awt.Dimension(80, 30));
        btnAlterar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar_usuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllogin)
                    .addComponent(lblSenha)
                    .addComponent(lblCodigo)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInserir_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(lbllogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(lblSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnInserir_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnVoltar_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro - Usuários");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnInserir_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserir_usuarioActionPerformed
        // TODO add your handling code here:
        if (verificarCampos() == false) {
            
            objUsuario = new Usuario();
            UsuarioController userCon = new UsuarioController(objUsuario, null);
        
            objUsuario.setLogin(txtLogin.getText());
            objUsuario.setNome(txtNome.getText());
            objUsuario.setSenha(txtSenha.getText());
            userCon.incluir(objUsuario);
            atualizaUsuario();                       
              
            JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso !!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        
            
       
        
        
        
    }//GEN-LAST:event_btnInserir_usuarioActionPerformed

    
     private void guardarDados() {
        try {
            objUsuario = new Usuario();
            objUsuario.setCodio(txtCodigo.getText());
            objUsuario.setNome(txtNome.getText());
            objUsuario.setSenha(txtSenha.getText());
            objUsuario.setLogin(txtLogin.getText());
            
        }catch(Exception ex){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Problemas no guardaDados: " + ex.getMessage());
        }
    }
    
    private void limparTela() {
        try {
            //LIMPAR OS CAMPOS DA TELA
            //LIBERAR O CAMPO MATRICULA

            txtCodigo.setText("");
            txtLogin.setText("");
            txtNome.setText("");
            txtSenha.setText("");
            // Não deixa o botão Alterar aparecer na tela
            btnAlterar_usuario.setVisible(false);
            btnExcluir_usuario.setVisible(false);
            btnInserir_usuario.setVisible(true);
        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage());
        }
    }

    
     private void preencheCampos() {
        try {
            txtSenha.setText(objUsuario.getSenha());
            txtNome.setText(objUsuario.getNome());
            txtLogin.setText(objUsuario.getLogin());
            txtCodigo.setText(objUsuario.getCodio());
            // Deixa o botão Alterar aparecer na tela
            btnAlterar_usuario.setVisible(true);
            btnExcluir_usuario.setVisible(true);
            btnInserir_usuario.setVisible(false);

        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage());
        }
    }
    
    private void jtbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbUsuarioMouseClicked
   
        //pega a linha selecionada
   int linhaSelecionada = jtbUsuario.getSelectedRow();
   // Primeira coluna da linha
   String coluna1 = jtbUsuario.getModel().getValueAt(linhaSelecionada, 0).toString();
 
   //basta agora chamar o método buscar, passando o COLUNA1 como parâmetro de consulta
  UsuarioController UsuarioCon = new UsuarioController(null, null);  
   objUsuario = UsuarioCon.buscar(coluna1);
   
   preencheCampos();
   
  

   //basta agora chamar o método buscar, passando o COLUNA1 como parâmetro de consulta
    }//GEN-LAST:event_jtbUsuarioMouseClicked

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnExcluir_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir_usuarioActionPerformed
        
        // (txtCodigo.getText().trim().equals(""))
           // JOptionPane.showMessageDialog(null, "Selecione um Cadastro na Tabela Para Excuir !", "Erro", JOptionPane.ERROR_MESSAGE);
            
        
            objUsuario = new Usuario();
            UsuarioController userCon = new UsuarioController(objUsuario, null);        
            objUsuario.setCodio(txtCodigo.getText());
            userCon.excluir(objUsuario);
            atualizaUsuario();
            limparTela();
        
       
        
        
    }//GEN-LAST:event_btnExcluir_usuarioActionPerformed

    public boolean verificarCampos() {
        if (txtNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Nome está em branco!", "Erro", JOptionPane.ERROR_MESSAGE);
            txtNome.requestFocus();
            return true;           
        }if (txtLogin.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Login está em branco!", "Erro", JOptionPane.ERROR_MESSAGE);
            txtLogin.requestFocus();
            return true;
        }if (txtSenha.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Senha está em branco!", "Erro", JOptionPane.ERROR_MESSAGE);
            txtSenha.requestFocus();
            return true;
        }
        return false;
    }
    
    
        /*
}else if(this.frm.getTxtNumAutoInfr().getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Número da Infração está em branco.", "Erro", JOptionPane.ERROR_MESSAGE);
            this.frm.getTxtNumAutoInfr().requestFocus();
            return false;  
}else if(this.frm.getTxtPlaca().getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Placa está em branco.", "Erro", JOptionPane.ERROR_MESSAGE);
            this.frm.getTxtPlaca().requestFocus();
            return false;
        
        */
  
    private void btnLimpar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar_usuarioActionPerformed
        limparTela();
    }//GEN-LAST:event_btnLimpar_usuarioActionPerformed

    private void btnVoltar_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar_usuariosActionPerformed
        dispose();
        
    }//GEN-LAST:event_btnVoltar_usuariosActionPerformed

    private void btnAlterar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar_usuarioActionPerformed
        
       /* Valida de o campo Codigo esta em Branco 
        if (txtCodigo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione um Cadastro na Tabela Para Alterar !", "Erro", JOptionPane.ERROR_MESSAGE);
            
        }*/
        if(verificarCampos() == false) {
                         
            objUsuario = new Usuario();
            UsuarioController userCon = new UsuarioController(objUsuario, null);
        
            objUsuario.setLogin(txtLogin.getText());
            objUsuario.setNome(txtNome.getText());
            objUsuario.setSenha(txtSenha.getText());
            objUsuario.setCodio(txtCodigo.getText());
            userCon.alterar(objUsuario);
            atualizaUsuario();
            limparTela();
        }
    }//GEN-LAST:event_btnAlterar_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuariosView().setVisible(true);
            }
        });
    }
    
    public void atualizaUsuario(){
        UsuarioController userCon = new UsuarioController(null, jtbUsuario);
        userCon.PreencheUsuarios();
    }
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar_usuario;
    private javax.swing.JButton btnExcluir_usuario;
    private javax.swing.JButton btnInserir_usuario;
    private javax.swing.JButton btnLimpar_usuario;
    private javax.swing.JButton btnVoltar_usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtbUsuario;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
