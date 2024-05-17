/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author itall
 */
public class Crud extends javax.swing.JFrame {

    /**
     * Creates new form Crud
     */
    public Crud() {
        initComponents();

        Funciones.setListar("");

        jPopupMenu1.add(menu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        btn_novo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_fechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDeletarTudo = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        btnEditar.setBackground(new java.awt.Color(153, 93, 224));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(153, 93, 224));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "EMAIL", "IDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setAltoHead(30);
        tabla.setColorBackgoundHead(new java.awt.Color(153, 93, 224));
        tabla.setComponentPopupMenu(jPopupMenu1);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);

        btn_novo.setBackground(new java.awt.Color(153, 93, 224));
        btn_novo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_novo.setForeground(new java.awt.Color(255, 255, 255));
        btn_novo.setText("NOVO");
        btn_novo.setToolTipText("REGISTRAR USUARIO");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 93, 224));

        btn_fechar.setBackground(new java.awt.Color(153, 93, 224));
        btn_fechar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_fechar.setForeground(new java.awt.Color(255, 255, 255));
        btn_fechar.setText("X");
        btn_fechar.setBorderPainted(false);
        btn_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fecharActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CRUD - Atividade Ceuma ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btn_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        btnDeletarTudo.setBackground(new java.awt.Color(153, 93, 224));
        btnDeletarTudo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeletarTudo.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletarTudo.setText("DELETAR TUDO");
        btnDeletarTudo.setToolTipText("REGISTRAR USUARIO");
        btnDeletarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarTudoActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletarTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeletarTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBuscar))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fecharActionPerformed
        this.dispose(); // Fecha o Programa
    }//GEN-LAST:event_btn_fecharActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        Formulario_Registro f = new Formulario_Registro(this, true);
        f.setVisible(true);
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila = tabla.getSelectedRow();

        Formulario_Update f = new Formulario_Update(this, true);
        f.txtNome.setText(tabla.getValueAt(fila, 1).toString());
        f.txtUsuario.setText(tabla.getValueAt(fila, 2).toString());
        f.txtSenha.setText(tabla.getValueAt(fila, 3).toString());
        f.lblid.setText(tabla.getValueAt(fila, 0).toString());
        f.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int fila = tabla.getSelectedRow();

        Sentencias s = new Sentencias();
        s.setId(tabla.getValueAt(fila, 0).toString());

        if (JOptionPane.showConfirmDialog(this, "Deletar Registro?", "",
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            if (Funciones.isDelete(s)) {
                Funciones.setListar("");
                JOptionPane.showMessageDialog(this, "Usuario Deletado com Sucesso.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao Deletar Usuario.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnDeletarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarTudoActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deletar todos os Registro?", "",
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            if (Funciones.isTruncate()) {
                Funciones.setListar("");
                JOptionPane.showMessageDialog(this, "Registros deletados com Sucesso.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao Deletar Registros.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeletarTudoActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        Funciones.setListar(this.txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletarTudo;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btn_fechar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    public static rojerusan.RSTableMetro tabla;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
