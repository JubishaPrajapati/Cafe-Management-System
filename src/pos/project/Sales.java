
package pos.project;

import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Sales extends javax.swing.JPanel {

    public Sales() {
        initComponents();
        dataload();
    }
    public void dataload(){
  
      try {
          
          DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
          dt.setRowCount(0);
          
          Statement s = db.mycon().createStatement();
          ResultSet rs =  s.executeQuery("SELECT * FROM sales");
          
          while (rs.next()) {              
           
           Vector v = new Vector();    
            v.add(rs.getString(1));
            v.add(rs.getString(2));
            v.add(rs.getString(3));
            v.add(rs.getString(4));
            v.add(rs.getString(5));
            v.add(rs.getString(6));
            v.add(rs.getString(7));
            v.add(rs.getString(8));
            v.add(rs.getString(9));
            
            dt.addRow(v);   
          }
      } catch (SQLException e) {
          System.out.println(e);
      } 
  }  
    
    
    public void search_para(){
        String c_Name = cus_name.getText();
        String sta = cus_status.getSelectedItem().toString();
 
     try {
        
         DefaultTableModel dt =  (DefaultTableModel) jTable1.getModel();
         dt.setRowCount(0);
       
         Statement s = db.mycon().createStatement();         
         
         if(sta=="All"){
             ResultSet rs = s.executeQuery("SELECT * FROM sales WHERE Customer_Name LIKE '%"+c_Name+"%'");
             
             while (rs.next()) {             
             
             Vector v =new Vector();
             v.add(rs.getString(1));
             v.add(rs.getString(2));
             v.add(rs.getString(3));
             v.add(rs.getString(4));
             v.add(rs.getString(5));
             v.add(rs.getString(6));
             v.add(rs.getString(7));
             v.add(rs.getString(8));
             v.add(rs.getString(9));
             
             dt.addRow(v);   
         }
         }else{
             ResultSet rs = s.executeQuery("SELECT * FROM sales WHERE Customer_Name LIKE '%"+c_Name+"%' AND Status LIKE '"+sta+"%'");
             while (rs.next()) {             
             
             Vector v =new Vector();
             v.add(rs.getString(1));
             v.add(rs.getString(2));
             v.add(rs.getString(3));
             v.add(rs.getString(4));
             v.add(rs.getString(5));
             v.add(rs.getString(6));
             v.add(rs.getString(7));
             v.add(rs.getString(8));
             v.add(rs.getString(9));
             
             dt.addRow(v);   
         }
         }
         
         
     } catch (SQLException e) {
         System.out.println(e);
         dataload();
     } 
 } 
    public void search_by_date(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String jdStr = sdf.format(startdate.getDate());
        String jd1Str = sdf.format(enddate.getDate());

        try {
            Statement stmt =  db.mycon().createStatement();
            String sql = "SELECT * FROM sales WHERE Date >= '" + jdStr + "' AND Date <= '" + jd1Str + "'";
            ResultSet rs = stmt.executeQuery(sql);

    // Assuming `table` is a JTable
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
         System.out.println(e);
         dataload();
//    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        edate = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cus_status = new javax.swing.JComboBox<>();
        searchBtn = new javax.swing.JButton();
        startdate = new com.toedter.calendar.JDateChooser();
        enddate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cus_name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        blcupdate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        statusupdate = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        s_search = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1473, 781));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SaleID", "INID", "CID", "Date", "Customer_Name", "Total Qty", "Total Bill", "Status", "Balance"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 227, 1430, 510));

        edate.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Status :");

        cus_status.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        cus_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UnPaid", "Partial", "Paid", "All" }));
        cus_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_statusActionPerformed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("From:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("To:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setText("Customer Name :");

        cus_name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        cus_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_nameActionPerformed(evt);
            }
        });
        cus_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cus_nameKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout edateLayout = new javax.swing.GroupLayout(edate);
        edate.setLayout(edateLayout);
        edateLayout.setHorizontalGroup(
            edateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edateLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(edateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchBtn)
                    .addGroup(edateLayout.createSequentialGroup()
                        .addGroup(edateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(edateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(edateLayout.createSequentialGroup()
                                .addComponent(cus_status, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(edateLayout.createSequentialGroup()
                                .addComponent(cus_name, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(edateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enddate, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        edateLayout.setVerticalGroup(
            edateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edateLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(edateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(edateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cus_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(edateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enddate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(edateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cus_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(searchBtn)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(edate, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 15, 840, 190));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/refresh.png"))); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 750, -1, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        blcupdate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        blcupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blcupdateActionPerformed(evt);
            }
        });
        blcupdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                blcupdateKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Status Update:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setText("Blc Update:");

        statusupdate.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        statusupdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UnPaid", "Partial", "Paid", "All" }));
        statusupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusupdateActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("id:");

        s_search.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        s_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_searchActionPerformed(evt);
            }
        });
        s_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                s_searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(blcupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(updateBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s_search, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(s_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(statusupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blcupdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 570, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void cus_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_statusActionPerformed
        search_para();
    }//GEN-LAST:event_cus_statusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dataload();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        search_by_date();
       
    }//GEN-LAST:event_searchBtnActionPerformed

    private void s_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_searchActionPerformed

    private void s_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s_searchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_s_searchKeyReleased

    private void cus_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cus_nameActionPerformed

    private void cus_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cus_nameKeyReleased
        // TODO add your handling code here:
        search_para();
    }//GEN-LAST:event_cus_nameKeyReleased

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        
        String id =s_search.getText();
        String status = statusupdate.getSelectedItem().toString();
        String balance =blcupdate.getText();

        try {

            Statement s = db.mycon().createStatement();
            s.executeUpdate(" UPDATE sales SET Status ='"+status+"' ,Balance= '"+balance+"' WHERE saleid = '"+id+"' ");
            JOptionPane.showMessageDialog(null, "Data has been updated");
        } catch (Exception e) {
            System.out.println(e);
        }
        dataload();
        s_search.setText("");
     
        blcupdate.setText("");
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void blcupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blcupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blcupdateActionPerformed

    private void blcupdateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_blcupdateKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_blcupdateKeyReleased

    private void statusupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusupdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField blcupdate;
    private javax.swing.JTextField cus_name;
    private javax.swing.JComboBox<String> cus_status;
    private javax.swing.JPanel edate;
    private com.toedter.calendar.JDateChooser enddate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField s_search;
    private javax.swing.JButton searchBtn;
    private com.toedter.calendar.JDateChooser startdate;
    private javax.swing.JComboBox<String> statusupdate;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
