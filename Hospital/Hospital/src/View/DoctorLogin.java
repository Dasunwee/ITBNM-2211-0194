/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LoginController;
import javax.swing.JOptionPane;

/**
 *
 * @author dasun_weerawardhna
 */
public class DoctorLogin extends javax.swing.JFrame {

    /**
     * Creates new form DoctorLogin
     */
    public DoctorLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DLUser = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        DCreatBtn = new javax.swing.JButton();
        DCBtn = new javax.swing.JButton();
        DLPassword = new javax.swing.JPasswordField();
        DLBtn = new javax.swing.JButton();
        RLoginLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DFPTF = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("User Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 116, 31));

        DLUser.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(DLUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 370, 40));

        Password.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Password.setText("Password :");
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 116, 50));

        DCreatBtn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        DCreatBtn.setText("Create New");
        DCreatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DCreatBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DCreatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 264, -1));

        DCBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DCBtn.setText("Clear");
        DCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DCBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DCBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 121, 40));

        DLPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DLPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(DLPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 370, 40));

        DLBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DLBtn.setText("Login");
        DLBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DLBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DLBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 99, 40));

        RLoginLbl.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        RLoginLbl.setText("Reception Login");
        RLoginLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RLoginLblMouseClicked(evt);
            }
        });
        jPanel2.add(RLoginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, 156, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setText("Doctor's login page");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        DFPTF.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        DFPTF.setText("Forget Password");
        DFPTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DFPTFMouseClicked(evt);
            }
        });
        jPanel2.add(DFPTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 670, 157, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/doclogin.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DLPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DLPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DLPasswordActionPerformed

    private void DCreatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DCreatBtnActionPerformed
        // TODO add your handling code here:
        AddDoctor add = new AddDoctor();
        add.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_DCreatBtnActionPerformed

    private void DCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DCBtnActionPerformed
        // TODO add your handling code here:
        LoginController.DoctorLogin(DLUser.getText(), DLPassword.getText());
    }//GEN-LAST:event_DCBtnActionPerformed

    private void RLoginLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RLoginLblMouseClicked
        // TODO add your handling code here:
        ReceptionLogin login = new ReceptionLogin();
        login.setVisible(true);
        super.dispose();
         
    }//GEN-LAST:event_RLoginLblMouseClicked

    private void DLBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DLBtnActionPerformed
        // TODO add your handling code here:
        LoginController.DoctorLogin(DLUser.getText(), DLPassword.getText());
        
    }//GEN-LAST:event_DLBtnActionPerformed

    private void DFPTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DFPTFMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Contact: Dasun weerawardhana  ", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_DFPTFMouseClicked

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
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DCBtn;
    private javax.swing.JButton DCreatBtn;
    private javax.swing.JLabel DFPTF;
    private javax.swing.JButton DLBtn;
    private javax.swing.JPasswordField DLPassword;
    private javax.swing.JTextField DLUser;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel RLoginLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    void SetVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
