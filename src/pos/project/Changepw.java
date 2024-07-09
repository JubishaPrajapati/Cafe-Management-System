
package pos.project;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Changepw extends javax.swing.JFrame {

    public Changepw() {
        try {
            UIManager.setLookAndFeel(new com.jtattoo.plaf.mint.MintLookAndFeel());
        } catch (Exception e) {
        }
        initComponents();
//        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        changepwBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        usertext = new javax.swing.JTextField();
        oldpasstext = new javax.swing.JPasswordField();
        newpasstext = new javax.swing.JPasswordField();
        confirmpasstext = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Change Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setText("User_Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setText("Old Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel4.setText("New Password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel5.setText("Confirm Password:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        changepwBtn.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        changepwBtn.setText("Change Password");
        changepwBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepwBtnActionPerformed(evt);
            }
        });
        getContentPane().add(changepwBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, 310, 40));

        cancelBtn.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 640, 150, 40));

        usertext.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(usertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 410, 40));

        oldpasstext.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(oldpasstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 410, 40));

        newpasstext.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(newpasstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 410, 40));

        confirmpasstext.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(confirmpasstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 410, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\JUBISHA\\Desktop\\bgggg-transformed.jpeg")); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(1200, 900));
        jLabel7.setMinimumSize(new java.awt.Dimension(1200, 900));
        jLabel7.setPreferredSize(new java.awt.Dimension(1200, 900));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changepwBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepwBtnActionPerformed
        // change pw code
        String username=usertext.getText();
        String oldpass=oldpasstext.getText();
        String newpass=newpasstext.getText();
        String confirmpass=confirmpasstext.getText();
        
        if(username.equals("") || oldpass.equals("") || newpass.equals("") || confirmpass.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Fill up all the fields. ");
        } else if(!newpass.equals(confirmpass)){
            JOptionPane.showMessageDialog(rootPane, "New password and confirm password donot match.Please enter again ");
        
        }else{
         try {
            Statement s=db.mycon().createStatement();
            ResultSet rs=s.executeQuery("SELECT * FROM admin WHERE User_Name='"+username+"'");
            if(rs.next()){
                String dbPassword = rs.getString("password");
                if (!dbPassword.equals(oldpass)) {
                    JOptionPane.showMessageDialog(rootPane, "Incorrect old password. Please try again.");
                }else{ //update pw
                s.executeUpdate("UPDATE admin set password='"+newpass+"' WHERE User_Name='"+username+"' ");
                JOptionPane.showMessageDialog(null, "Your Password has been changed successfully.");
                this.setVisible(false);
                new Login().setVisible(true);
                }
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "User not found.");
            }  
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_changepwBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Changepw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Changepw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Changepw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Changepw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Changepw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton changepwBtn;
    private javax.swing.JPasswordField confirmpasstext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField newpasstext;
    private javax.swing.JPasswordField oldpasstext;
    private javax.swing.JTextField usertext;
    // End of variables declaration//GEN-END:variables
}
