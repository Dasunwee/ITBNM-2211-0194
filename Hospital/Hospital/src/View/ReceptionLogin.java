
package View;

import Controller.LoginController;
import javax.swing.JOptionPane;

/**
 *
 * @author dasun_weerawardhana
 */
public class ReceptionLogin extends javax.swing.JFrame {

    /**
     * Creates new form homepage
     */
    public ReceptionLogin() {
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
        RLUser = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        RCreatBtn = new javax.swing.JButton();
        RCBtn = new javax.swing.JButton();
        RLPassword = new javax.swing.JPasswordField();
        RLBtn = new javax.swing.JButton();
        DLoginLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RFPTF = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("User Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 150, 31));

        RLUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(RLUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 360, 31));

        Password.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Password.setText("Password :");
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 150, 50));

        RCreatBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RCreatBtn.setText("Create New");
        RCreatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCreatBtnActionPerformed(evt);
            }
        });
        jPanel2.add(RCreatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 610, 160, -1));

        RCBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RCBtn.setText("Clear all");
        RCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCBtnActionPerformed(evt);
            }
        });
        jPanel2.add(RCBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 121, 33));

        RLPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RLPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RLPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(RLPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 360, 30));

        RLBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RLBtn.setText("Login");
        RLBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RLBtnActionPerformed(evt);
            }
        });
        jPanel2.add(RLBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 140, 33));

        DLoginLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DLoginLbl.setText("Doctor Login");
        DLoginLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DLoginLblMouseClicked(evt);
            }
        });
        jPanel2.add(DLoginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, 120, 26));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Reception's login");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        RFPTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RFPTF.setText("Forget Password");
        RFPTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RFPTFMouseClicked(evt);
            }
        });
        jPanel2.add(RFPTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 670, 150, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/receptionloggin.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RLPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RLPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RLPasswordActionPerformed

    private void RCreatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCreatBtnActionPerformed
        // TODO add your handling code here:
        AddReception add = new AddReception();
        add.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_RCreatBtnActionPerformed

    private void RLBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RLBtnActionPerformed
        // TODO add your handling code here:
        LoginController.ReceptionLogin(RLUser.getText(), RLPassword.getText());
        
        /*ReceptionHome login = new ReceptionHome();
        login.setVisible(true);
        super.dispose();*/
    }//GEN-LAST:event_RLBtnActionPerformed

    private void DLoginLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DLoginLblMouseClicked
        // TODO add your handling code here:
        DoctorLogin login = new DoctorLogin();
        login.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_DLoginLblMouseClicked

    private void RFPTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RFPTFMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Contact dasun_weerawardhana ", "Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_RFPTFMouseClicked

    private void RCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RCBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ReceptionLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DLoginLbl;
    private javax.swing.JLabel Password;
    private javax.swing.JButton RCBtn;
    private javax.swing.JButton RCreatBtn;
    private javax.swing.JLabel RFPTF;
    private javax.swing.JButton RLBtn;
    private javax.swing.JPasswordField RLPassword;
    private javax.swing.JTextField RLUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
