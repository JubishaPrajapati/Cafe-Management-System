
package pos.project;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame {
    
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    

    public Login() {
        try {
            UIManager.setLookAndFeel(new com.jtattoo.plaf.mint.MintLookAndFeel());
        } catch (Exception e) {
        }
        initComponents();
        setLocationRelativeTo(null);
//        setResizable(false);

        con= db.mycon();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpass = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        changepwBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 160, 60));

        jpass.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassActionPerformed(evt);
            }
        });
        getContentPane().add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 360, 60));

        loginBtn.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 170, -1));

        jname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnameActionPerformed(evt);
            }
        });
        getContentPane().add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 360, 60));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setText("User Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        changepwBtn.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        changepwBtn.setText("Change Password");
        changepwBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepwBtnActionPerformed(evt);
            }
        });
        getContentPane().add(changepwBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 310, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\JUBISHA\\Desktop\\bgggg-transformed.jpeg")); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1200, 800));
        jLabel4.setMinimumSize(new java.awt.Dimension(1200, 800));
        jLabel4.setPreferredSize(new java.awt.Dimension(1200, 900));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnameActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        
        String un=jname.getText();
        String ps=jpass.getText();
        
        if(un.equals("") || ps.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Fill up all the fields. ");
        }else{
        try{
            String sql="SELECT * FROM admin WHERE User_Name=? AND Password=?";
            pst=con.prepareCall(sql);
            
            pst.setString(1,un);  //username
            pst.setString(2,ps);    //password
            
            rs=pst.executeQuery();
            if(rs.next()) {
                
                new Home().setVisible(true);
                new Login().disable();  //setvisible false
            }else{
                JOptionPane.showMessageDialog(rootPane,"Your login failed.");
            }
            
        }catch(Exception e){
        }  
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void jpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassActionPerformed

    private void changepwBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepwBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Changepw().setVisible(true);
    }//GEN-LAST:event_changepwBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changepwBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jname;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JButton loginBtn;
    // End of variables declaration//GEN-END:variables
}
