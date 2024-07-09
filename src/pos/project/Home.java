package pos.project;

import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Home extends javax.swing.JFrame {

    JpanelLoader jpload = new JpanelLoader();

    public Home() {
        try {
            UIManager.setLookAndFeel(new com.jtattoo.plaf.mint.MintLookAndFeel());
        } catch (Exception e) {
        }
        initComponents();
        this.setExtendedState(Home.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home_bnt_grp = new javax.swing.ButtonGroup();
        panel_load = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        customerBtn = new javax.swing.JToggleButton();
        foodItemsBtn = new javax.swing.JToggleButton();
        employeeBtn = new javax.swing.JToggleButton();
        logoutBtn = new javax.swing.JToggleButton();
        billsBtn = new javax.swing.JToggleButton();
        salesBtn = new javax.swing.JToggleButton();
        reportsBtn = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_load.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\JUBISHA\\Desktop\\guluz logo.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setPreferredSize(new java.awt.Dimension(600, 600));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("                           WELCOME BACK \n        LETS TAKE A STEP TOWARDS OUR GOAL\n\n     \"Success comes to those who dare to dream and \n                          take calculated risks. \n      Every setback is an opportunity to learn and grow\n                                   stronger.\" \n       ");
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout panel_loadLayout = new javax.swing.GroupLayout(panel_load);
        panel_load.setLayout(panel_loadLayout);
        panel_loadLayout.setHorizontalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loadLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        panel_loadLayout.setVerticalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loadLayout.createSequentialGroup()
                .addGroup(panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_loadLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_loadLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        getContentPane().add(panel_load, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 1490, 810));

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/home.png"))); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        home_bnt_grp.add(customerBtn);
        customerBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        customerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/cus.png"))); // NOI18N
        customerBtn.setText("Customers");
        customerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerBtnActionPerformed(evt);
            }
        });

        home_bnt_grp.add(foodItemsBtn);
        foodItemsBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        foodItemsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/food.png"))); // NOI18N
        foodItemsBtn.setText("Food Items");
        foodItemsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodItemsBtnActionPerformed(evt);
            }
        });

        home_bnt_grp.add(employeeBtn);
        employeeBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        employeeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/employee.png"))); // NOI18N
        employeeBtn.setText("Employee");
        employeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeBtnActionPerformed(evt);
            }
        });

        home_bnt_grp.add(logoutBtn);
        logoutBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/logout.png"))); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        home_bnt_grp.add(billsBtn);
        billsBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        billsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/bill.png"))); // NOI18N
        billsBtn.setText("Bills");
        billsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billsBtnActionPerformed(evt);
            }
        });

        home_bnt_grp.add(salesBtn);
        salesBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        salesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/saless.png"))); // NOI18N
        salesBtn.setText("Sales");
        salesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesBtnActionPerformed(evt);
            }
        });

        home_bnt_grp.add(reportsBtn);
        reportsBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        reportsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/report.png"))); // NOI18N
        reportsBtn.setText("Reports");
        reportsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(customerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(foodItemsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(employeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(37, 37, 37)
                .addComponent(customerBtn)
                .addGap(35, 35, 35)
                .addComponent(foodItemsBtn)
                .addGap(39, 39, 39)
                .addComponent(employeeBtn)
                .addGap(40, 40, 40)
                .addComponent(billsBtn)
                .addGap(38, 38, 38)
                .addComponent(salesBtn)
                .addGap(36, 36, 36)
                .addComponent(reportsBtn)
                .addGap(35, 35, 35)
                .addComponent(logoutBtn)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 370, 810));

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("GULUZ CAFE ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 195, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("WELCOME TO \"GULUZ\" CAFE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1790, 0, -1, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1880, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerBtnActionPerformed
        // customer load
        Customers cus = new Customers();
        jpload.jPanelLoader(panel_load, cus);

    }//GEN-LAST:event_customerBtnActionPerformed

    private void reportsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsBtnActionPerformed
        //report btn 
        Reports rp = new Reports();
        jpload.jPanelLoader(panel_load, rp);
        
    }//GEN-LAST:event_reportsBtnActionPerformed

    private void employeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeBtnActionPerformed
        //employee button
        Employee emp = new Employee();
        jpload.jPanelLoader(panel_load, emp);

    }//GEN-LAST:event_employeeBtnActionPerformed

    private void foodItemsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodItemsBtnActionPerformed
        //product button
        Product pro = new Product();
        jpload.jPanelLoader(panel_load, pro);
    }//GEN-LAST:event_foodItemsBtnActionPerformed

    private void billsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billsBtnActionPerformed
        //sale button
        Bills sl = new Bills();
        jpload.jPanelLoader(panel_load, sl);
    }//GEN-LAST:event_billsBtnActionPerformed

    private void salesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesBtnActionPerformed
        //invoice button
        Sales inv = new Sales();
        jpload.jPanelLoader(panel_load, inv);
    }//GEN-LAST:event_salesBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Homepg home = new Homepg();
        jpload.jPanelLoader(panel_load, home);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton billsBtn;
    private javax.swing.JToggleButton customerBtn;
    private javax.swing.JToggleButton employeeBtn;
    private javax.swing.JToggleButton foodItemsBtn;
    private javax.swing.ButtonGroup home_bnt_grp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton logoutBtn;
    private javax.swing.JPanel panel_load;
    private javax.swing.JToggleButton reportsBtn;
    private javax.swing.JToggleButton salesBtn;
    // End of variables declaration//GEN-END:variables
}
