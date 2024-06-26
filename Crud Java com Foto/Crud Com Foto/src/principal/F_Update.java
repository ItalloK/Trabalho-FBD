/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package principal;

import Conexao.Conexao;
import java.awt.Image;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static principal.F_Registro.lblFoto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import Conexao.Global;

/**
 *
 * @author itall
 */
public class F_Update extends javax.swing.JDialog {

    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private FileInputStream fis;
    private int tamanho;//variavel global para armazenar tamanho da imagem. ( em bytes )

    /**
     * Creates new form Formulario
     */
    public F_Update(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

        setClean();
    }

    public void setClean() {
        this.txtNome.setText("");
        this.txtSenha.setText("");
        this.txtUsuario.setText("");
        this.txtEndereco.setText("");

        this.lblError.setText("");
        //this.lblid.setText(Funciones.extraerIDMAX());
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
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblFoto = new javax.swing.JLabel();
        btnCarregarFoto = new javax.swing.JButton();
        lblErroFoto = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(718, 550));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ATUALIZAR INFORMAÇÕES");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        txtNome.setToolTipText("NOME COMPLETO");

        txtUsuario.setToolTipText("EMAIL");

        btnRegistrar.setBackground(new java.awt.Color(0, 102, 255));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("SALVAR ALTERAÇÕES");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setFocusable(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblid.setText("ID");
        lblid.setToolTipText("ID DO USUÁRIO");

        jLabel7.setText("Digite a Data de Nascimento:");

        jLabel8.setText("Digite o Email:");

        jLabel9.setText("Digite o Nome Completo:");

        try {
            txtSenha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSenha.setToolTipText("DATA DE NASCIMENTO");

        jLabel12.setText("Digite o Endereço:");

        txtEndereco.setToolTipText("ENDEREÇO");

        jLabel10.setText("Digite o Telefone:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setToolTipText("TELEFONE");

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FotoPadrao.png"))); // NOI18N
        lblFoto.setToolTipText("FOTO DE PERFIL");
        lblFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCarregarFoto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCarregarFoto.setForeground(new java.awt.Color(51, 153, 255));
        btnCarregarFoto.setText("Carregar Foto");
        btnCarregarFoto.setToolTipText("CARREGAR FOTO");
        btnCarregarFoto.setFocusPainted(false);
        btnCarregarFoto.setFocusable(false);
        btnCarregarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarFotoActionPerformed(evt);
            }
        });

        lblErroFoto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblErroFoto.setForeground(new java.awt.Color(255, 0, 0));

        jLabel13.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblid))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(txtNome)
                            .addComponent(txtUsuario)
                            .addComponent(txtSenha)
                            .addComponent(txtEndereco)
                            .addComponent(txtTelefone)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCarregarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblErroFoto)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblError)
                        .addGap(0, 0, 0)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblid)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarregarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblErroFoto)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private static Connection conection = null;

    public Connection getConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conection = DriverManager.getConnection("jdbc:mysql://localhost/", "root", Global.SenhaBD);

            Statement statement = conection.createStatement();
            conection = DriverManager.getConnection("jdbc:mysql://localhost/crud_javaphoto", "root", Global.SenhaBD);
            return conection;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (this.txtNome.getText().length() == 0 || this.txtSenha.getText().length() == 0
                || this.txtUsuario.getText().length() == 0 || this.txtEndereco.getText().length() == 0
                ) {
            this.lblError.setText("*TODOS OS CAMPOS SÃO OBRIGATÓRIOS*");
        }else if(fis == null){
            this.lblErroFoto.setText("*VOCÊ TAMBEM DEVE ALTERAR A FOTO*");
        } else {
            String update = "UPDATE usuarios SET Nome = ? ,Email = ?, Idade = ?, Endereco = ?, Telefone = ?, Foto = ? WHERE id = ?";
            try {
                con = getConexao();
                pst = con.prepareStatement(update);
                pst.setString(1, this.txtNome.getText());
                pst.setString(2, this.txtUsuario.getText());
                pst.setString(3, this.txtSenha.getText());
                pst.setString(4, this.txtEndereco.getText());
                pst.setString(5, this.txtTelefone.getText());
                pst.setBlob(6, fis, tamanho);
                pst.setString(7, this.lblid.getText());
                int confirma = pst.executeUpdate();

                if (confirma == 1) {
                    setClean();
                    Funciones.setListar("");
                    this.dispose();
                    JOptionPane.showMessageDialog(this, "Dados Atualizados com Sucesso.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao Atualizar dados do Usuario.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCarregarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarFotoActionPerformed
        carregarfoto();
    }//GEN-LAST:event_btnCarregarFotoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void carregarfoto() {
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Selecionar Arquivo");
        jfc.setFileFilter(new FileNameExtensionFilter("Arquivo de Imagens (*.PNG,*.JPG,*.JPEG)", "png", "jpg", "jpeg"));
        int resultado = jfc.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(jfc.getSelectedFile());
                tamanho = (int) jfc.getSelectedFile().length();
                Image foto = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
                lblFoto.setIcon(new ImageIcon(foto));
                lblFoto.updateUI();
            } catch (Exception e) {
                System.out.println(e);
            }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(F_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                F_Update dialog = new F_Update(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregarFoto;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErroFoto;
    private javax.swing.JLabel lblError;
    public static javax.swing.JLabel lblFoto;
    public static javax.swing.JLabel lblid;
    public static javax.swing.JTextField txtEndereco;
    public static javax.swing.JTextField txtNome;
    public static javax.swing.JFormattedTextField txtSenha;
    public static javax.swing.JFormattedTextField txtTelefone;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
