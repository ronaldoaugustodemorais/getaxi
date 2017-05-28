/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getaxi;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldinho Augusto
 */
public class cadastroMotoristaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form telaCliente
     */
    private int idMotorista;
    
    public cadastroMotoristaJFrame() {
        initComponents();
        if(idMotorista == 0)
        {
            idMotorista = 1;
        }
        txtIDMotorista.setText(""+idMotorista);
        txtIDVeiculo.setText(""+idMotorista);
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
        lblPlaca = new javax.swing.JLabel();
        lblIDMotorista = new javax.swing.JLabel();
        lblCNHMotorista = new javax.swing.JLabel();
        lblNascimentoMotorista = new javax.swing.JLabel();
        lblDataAdmissaoMotorista = new javax.swing.JLabel();
        lblRuaMotorista = new javax.swing.JLabel();
        lblCidadeMotorista = new javax.swing.JLabel();
        lblEstadoMotorista = new javax.swing.JLabel();
        lblTelefoneMotorista = new javax.swing.JLabel();
        lblIconTaxi = new javax.swing.JLabel();
        lblTitleVeiculo = new javax.swing.JLabel();
        lblIDVeiculo = new javax.swing.JLabel();
        lblMarcaVeiculo = new javax.swing.JLabel();
        lblAnoVeiculo = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        txtNOME = new javax.swing.JTextField();
        txtPLACA = new javax.swing.JTextField();
        txtIDMotorista = new javax.swing.JTextField();
        txtCNHMotorista = new javax.swing.JTextField();
        txtNascimentoMotorista = new javax.swing.JTextField();
        txtDataAdmissaoMotorista = new javax.swing.JTextField();
        txtRuaMotorista = new javax.swing.JTextField();
        txtCidadeMotorista = new javax.swing.JTextField();
        txtEstadoMotorista = new javax.swing.JTextField();
        txtTelefoneMotorista = new javax.swing.JTextField();
        txtIDVeiculo = new javax.swing.JTextField();
        txtMarcaVeiculo = new javax.swing.JTextField();
        txtAnoVeiculo = new javax.swing.JTextField();
        btnCadastrarMotorista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Motorista");
        setResizable(false);

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CADASTRAR MOTORISTA");

        lblCpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCpf.setText("CPF:");

        iconPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/iconPerfil.png"))); // NOI18N

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNome.setText("NOME:");

        lblPlaca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPlaca.setText("PLACA:");

        lblIDMotorista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIDMotorista.setText("ID");

        lblCNHMotorista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCNHMotorista.setText("C.N.H:");

        lblNascimentoMotorista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNascimentoMotorista.setText("DATA DE NASCIMENTO:");

        lblDataAdmissaoMotorista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDataAdmissaoMotorista.setText("DATA DE ADMISSÃO:");

        lblRuaMotorista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRuaMotorista.setText("RUA:");

        lblCidadeMotorista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCidadeMotorista.setText("CIDADE:");

        lblEstadoMotorista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEstadoMotorista.setText("ESTADO:");

        lblTelefoneMotorista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTelefoneMotorista.setText("TELEFONE:");

        lblIconTaxi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/iconTaxi.png"))); // NOI18N

        lblTitleVeiculo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTitleVeiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleVeiculo.setText("CADASTRAR VEÍCULO");

        lblIDVeiculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIDVeiculo.setText("ID:");

        lblMarcaVeiculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMarcaVeiculo.setText("MARCA:");

        lblAnoVeiculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAnoVeiculo.setText("ANO:");

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

        txtPLACA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPLACA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPLACAActionPerformed(evt);
            }
        });

        txtIDMotorista.setEditable(false);
        txtIDMotorista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtIDVeiculo.setEditable(false);
        txtIDVeiculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnCadastrarMotorista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCadastrarMotorista.setText("CADASTRAR");
        btnCadastrarMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarMotoristaActionPerformed(evt);
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
                            .addComponent(lblNascimentoMotorista)
                            .addComponent(lblDataAdmissaoMotorista)
                            .addComponent(lblCNHMotorista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCNHMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDataAdmissaoMotorista, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(txtNascimentoMotorista))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrarMotorista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRuaMotorista)
                                    .addComponent(lblCidadeMotorista)
                                    .addComponent(lblTelefoneMotorista))
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRuaMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtTelefoneMotorista, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(txtCidadeMotorista))
                                        .addGap(18, 18, 18)
                                        .addComponent(lblEstadoMotorista)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEstadoMotorista))))
                            .addComponent(lblNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconPerfil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIconTaxi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitleVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIDMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(130, 130, 130)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDVeiculo)
                            .addComponent(lblMarcaVeiculo)
                            .addComponent(lblPlaca))
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMarcaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(lblAnoVeiculo)
                                .addGap(39, 39, 39)
                                .addComponent(txtAnoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPLACA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(lblIDMotorista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIDMotorista, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
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
                    .addComponent(lblCNHMotorista)
                    .addComponent(txtCNHMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNascimentoMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNascimentoMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataAdmissaoMotorista)
                    .addComponent(txtDataAdmissaoMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRuaMotorista)
                    .addComponent(txtRuaMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidadeMotorista)
                    .addComponent(txtCidadeMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstadoMotorista)
                    .addComponent(txtEstadoMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneMotorista)
                    .addComponent(txtTelefoneMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblIconTaxi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblTitleVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIDVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(lblIDVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarcaVeiculo)
                    .addComponent(txtMarcaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnoVeiculo)
                    .addComponent(txtAnoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(txtPLACA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnCadastrarMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void btnCadastrarMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarMotoristaActionPerformed
        // TODO add your handling code here:
        try
        {
            //realizar o carregamento do JDBC
            Class.forName("org.postgresql.Driver");
            //construindo a conexao com o SGDB PostgreSQL
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "senha123");
            JOptionPane.showMessageDialog(null,"CONEXAO REALIZADA!");
            //construcao da classe PreparedStatement para passagem de parametros
            PreparedStatement instrucao = conexao.prepareStatement("INSERT INTO motorista VALUES(?,?,?,?,?,?,?,?,?,?)");
            
            instrucao.setInt(1, idMotorista);            
            instrucao.setString(2, txtNOME.getText());
            instrucao.setString(3, txtCNHMotorista.getText());
            instrucao.setString(4, txtCPF.getText());
            instrucao.setInt(5, Integer.parseInt(txtDataAdmissaoMotorista.getText()));
            instrucao.setInt(6, Integer.parseInt(txtNascimentoMotorista.getText()));
            instrucao.setString(7, txtEstadoMotorista.getText());
            instrucao.setString(8, txtCidadeMotorista.getText());
            instrucao.setString(9, txtRuaMotorista.getText());
            instrucao.setString(10, txtTelefoneMotorista.getText());
            
            PreparedStatement instrucaoV = conexao.prepareStatement("INSERT INTO veiculo VALUES(?,?,?,?,?)");
            
            instrucaoV.setInt(1, idMotorista);
            instrucaoV.setInt(2, Integer.parseInt(txtAnoVeiculo.getText()));
            instrucaoV.setString(3, txtMarcaVeiculo.getText());
            instrucaoV.setString(4, txtPLACA.getText());
            instrucaoV.setInt(5, idMotorista);
            
            //executando a SQL parametrizada
            instrucao.executeUpdate();
            instrucaoV.executeUpdate();
            
            if(txtNOME.getText() == "")
            {
                JOptionPane.showMessageDialog(null,"Favor digitar um nome valido");
            }
            if(txtCPF.getText() == "")
            {
                JOptionPane.showMessageDialog(null,"Favor digitar um documento de CPF valido");
            }
            if(txtPLACA.getText() == "")
            {
                JOptionPane.showMessageDialog(null,"Favor digitar a placa do seu veiculo");
            }
            
            JOptionPane.showMessageDialog(null,"REGISTRO GRAVADO!");
            
            idMotorista++;
            txtNOME.setText("");
            txtCPF.setText("");                                  
            txtCNHMotorista.setText("");
            txtDataAdmissaoMotorista.setText("");
            txtNascimentoMotorista.setText("");
            txtEstadoMotorista.setText("");
            txtCidadeMotorista.setText("");
            txtRuaMotorista.setText("");
            txtTelefoneMotorista.setText("");                        
            txtAnoVeiculo.setText("");
            txtMarcaVeiculo.setText("");
            txtPLACA.setText("");
            
        }catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "ERRO CLASSE: "+ e.getMessage());
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "ERRO SQL: "+ e.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarMotoristaActionPerformed

    private void txtNOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOMEActionPerformed

    private void txtPLACAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPLACAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPLACAActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroMotoristaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroMotoristaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroMotoristaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroMotoristaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroMotoristaJFrame().setVisible(true);
            }
        });
    }
    
    /**
     * @param args the command line arguments
     */    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarMotorista;
    private javax.swing.JLabel iconPerfil;
    private javax.swing.JLabel lblAnoVeiculo;
    private javax.swing.JLabel lblCNHMotorista;
    private javax.swing.JLabel lblCidadeMotorista;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataAdmissaoMotorista;
    private javax.swing.JLabel lblEstadoMotorista;
    private javax.swing.JLabel lblIDMotorista;
    private javax.swing.JLabel lblIDVeiculo;
    private javax.swing.JLabel lblIconTaxi;
    private javax.swing.JLabel lblMarcaVeiculo;
    private javax.swing.JLabel lblNascimentoMotorista;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblRuaMotorista;
    private javax.swing.JLabel lblTelefoneMotorista;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitleVeiculo;
    private javax.swing.JTextField txtAnoVeiculo;
    private javax.swing.JTextField txtCNHMotorista;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidadeMotorista;
    private javax.swing.JTextField txtDataAdmissaoMotorista;
    private javax.swing.JTextField txtEstadoMotorista;
    private javax.swing.JTextField txtIDMotorista;
    private javax.swing.JTextField txtIDVeiculo;
    private javax.swing.JTextField txtMarcaVeiculo;
    private javax.swing.JTextField txtNOME;
    private javax.swing.JTextField txtNascimentoMotorista;
    private javax.swing.JTextField txtPLACA;
    private javax.swing.JTextField txtRuaMotorista;
    private javax.swing.JTextField txtTelefoneMotorista;
    // End of variables declaration//GEN-END:variables
}
