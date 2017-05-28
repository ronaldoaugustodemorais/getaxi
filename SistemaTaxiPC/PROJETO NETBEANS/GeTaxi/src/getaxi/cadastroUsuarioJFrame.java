/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getaxi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldinho Augusto
 */
public class cadastroUsuarioJFrame extends javax.swing.JFrame {

    /**
     * Creates new form telaCliente
     */
    private int idUsuario;
    
    public cadastroUsuarioJFrame() {
        initComponents();
        if(idUsuario == 0)
        {
            idUsuario = 1;
        }
        txtIDUsuario.setText(""+idUsuario);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        iconPerfil = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblIDUsuario = new javax.swing.JLabel();
        lblRuaUsuario = new javax.swing.JLabel();
        lblCidadeUsuario = new javax.swing.JLabel();
        lblEstadoUsuario = new javax.swing.JLabel();
        lblTelefoneUsuario = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        txtNOME = new javax.swing.JTextField();
        txtIDUsuario = new javax.swing.JTextField();
        txtRuaUsuario = new javax.swing.JTextField();
        txtCidadeUsuario = new javax.swing.JTextField();
        txtEstadoUsuario = new javax.swing.JTextField();
        txtTelefoneUsuario = new javax.swing.JTextField();
        btnCadastrarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Motorista");
        setResizable(false);

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CADASTRAR USUÁRIO");

        lblCpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCpf.setText("CPF:");

        iconPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/iconPerfil.png"))); // NOI18N

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNome.setText("NOME:");

        lblIDUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIDUsuario.setText("ID");

        lblRuaUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRuaUsuario.setText("RUA:");

        lblCidadeUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCidadeUsuario.setText("CIDADE:");

        lblEstadoUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEstadoUsuario.setText("ESTADO:");

        lblTelefoneUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTelefoneUsuario.setText("TELEFONE:");

        txtCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        txtNOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOMEActionPerformed(evt);
            }
        });

        txtIDUsuario.setEditable(false);
        txtIDUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtRuaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaUsuarioActionPerformed(evt);
            }
        });

        txtCidadeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeUsuarioActionPerformed(evt);
            }
        });

        txtEstadoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoUsuarioActionPerformed(evt);
            }
        });

        btnCadastrarUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCadastrarUsuario.setText("CADASTRAR");
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconPerfil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(130, 130, 130)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRuaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCidadeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblEstadoUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEstadoUsuario))
                                    .addComponent(txtTelefoneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRuaUsuario)
                            .addComponent(lblCidadeUsuario)
                            .addComponent(lblTelefoneUsuario))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIDUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIDUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRuaUsuario)
                    .addComponent(txtRuaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidadeUsuario)
                    .addComponent(txtCidadeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstadoUsuario)
                    .addComponent(txtEstadoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneUsuario)
                    .addComponent(txtTelefoneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        // TODO add your handling code here:
        try
        {
            //realizar o carregamento do JDBC
            Class.forName("org.postgresql.Driver");
            //construindo a conexao com o SGDB PostgreSQL
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "senha123");
            JOptionPane.showMessageDialog(null,"CONEXAO REALIZADA!");
            //construcao da classe PreparedStatement para passagem de parametros
            PreparedStatement instrucao = conexao.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?,?,?,?)");
            
            instrucao.setInt(1, idUsuario);            
            instrucao.setString(2, txtCPF.getText());            
            instrucao.setString(3, txtNOME.getText());                        
            instrucao.setString(4, txtEstadoUsuario.getText());
            instrucao.setString(5, txtCidadeUsuario.getText());
            instrucao.setString(6, txtRuaUsuario.getText());
            instrucao.setString(7, txtTelefoneUsuario.getText());                        
            
            //executando a SQL parametrizada
            instrucao.executeUpdate();            
            
            if(txtNOME.getText() == "")
            {
                JOptionPane.showMessageDialog(null,"Favor digitar um nome valido");
            }
            if(txtCPF.getText() == "")
            {
                JOptionPane.showMessageDialog(null,"Favor digitar um documento de CPF valido");
            }            
            
            JOptionPane.showMessageDialog(null,"REGISTRO GRAVADO!");
            
            idUsuario++;
            txtNOME.setText("");
            txtCPF.setText("");                                                      
            txtEstadoUsuario.setText("");
            txtCidadeUsuario.setText("");
            txtRuaUsuario.setText("");
            txtTelefoneUsuario.setText("");                                    
            
        }catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "ERRO CLASSE: "+ e.getMessage());
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "ERRO SQL: "+ e.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void txtNOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOMEActionPerformed

    private void txtRuaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaUsuarioActionPerformed

    private void txtCidadeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeUsuarioActionPerformed

    private void txtEstadoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroUsuarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroUsuarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroUsuarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroUsuarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroUsuarioJFrame().setVisible(true);
            }
        });
    }
    
    /**
     * @param args the command line arguments
     */    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JLabel iconPerfil;
    private javax.swing.JLabel lblCidadeUsuario;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEstadoUsuario;
    private javax.swing.JLabel lblIDUsuario;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRuaUsuario;
    private javax.swing.JLabel lblTelefoneUsuario;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidadeUsuario;
    private javax.swing.JTextField txtEstadoUsuario;
    private javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtNOME;
    private javax.swing.JTextField txtRuaUsuario;
    private javax.swing.JTextField txtTelefoneUsuario;
    // End of variables declaration//GEN-END:variables
}
