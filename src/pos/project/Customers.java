
package pos.project;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Customers extends javax.swing.JPanel {

    public Customers() {
        initComponents();       
        tb_load();
    }
    public void tb_load(){
      try {
          
          DefaultTableModel dt = (DefaultTableModel) tableMouseClic.getModel();
          dt.setRowCount(0);
          
          Statement s = db.mycon().createStatement();
          ResultSet rs = s.executeQuery(" SELECT * FROM customer");
          
          while (rs.next()) {              
              
              Vector v = new Vector();
              
              v.add(rs.getString(1));
              v.add(rs.getString(2));
              v.add(rs.getString(3));
              
              dt.addRow(v);    
          }
          
        }catch (SQLException e) {
          System.out.println(e);
        }
  
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        c_search = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c_name = new javax.swing.JTextField();
        c_ph = new javax.swing.JTextField();
        deleteCustomer = new javax.swing.JButton();
        addCustomer = new javax.swing.JButton();
        searchCustomer = new javax.swing.JButton();
        updateCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMouseClic = new javax.swing.JTable();
        customerSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        c_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_searchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setText("Customers Information");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Search ID:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c_search, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(203, 203, 203))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 710, 160));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Phone Number:");

        c_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nameActionPerformed(evt);
            }
        });

        c_ph.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c_ph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_phActionPerformed(evt);
            }
        });

        deleteCustomer.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        deleteCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/delete.png"))); // NOI18N
        deleteCustomer.setText("Delete");
        deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerActionPerformed(evt);
            }
        });

        addCustomer.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/save.png"))); // NOI18N
        addCustomer.setText("Save");
        addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerActionPerformed(evt);
            }
        });

        searchCustomer.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        searchCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/search.png"))); // NOI18N
        searchCustomer.setText("Search");
        searchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerActionPerformed(evt);
            }
        });

        updateCustomer.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        updateCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/update.png"))); // NOI18N
        updateCustomer.setText("Update");
        updateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c_ph, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_name, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addCustomer)
                .addGap(18, 18, 18)
                .addComponent(searchCustomer)
                .addGap(18, 18, 18)
                .addComponent(updateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteCustomer)
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_name, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_ph, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(addCustomer))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchCustomer)
                            .addComponent(updateCustomer)
                            .addComponent(deleteCustomer))))
                .addGap(66, 66, 66))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 710, 480));

        tableMouseClic.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tableMouseClic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Customer Name", "Ph. Number"
            }
        ));
        tableMouseClic.setRowHeight(25);
        tableMouseClic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMouseClic);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 659, 480));

        customerSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerSearchActionPerformed(evt);
            }
        });
        customerSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                customerSearchKeyReleased(evt);
            }
        });
        add(customerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, 420, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Search :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 99, 39));
    }// </editor-fold>//GEN-END:initComponents

    private void c_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_searchActionPerformed

    private void c_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nameActionPerformed

    private void c_phActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_phActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_phActionPerformed

    private void deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerActionPerformed
        //delete btn code

        String id = c_search.getText();
        try {

            Statement s = db.mycon().createStatement();
            s.executeUpdate("DELETE FROM customer WHERE cid = '"+id+"'");
            JOptionPane.showMessageDialog(null, "Data has been deleted");

        } catch (SQLException e) {
            System.out.println(e);
        }
        tb_load();
        c_search.setText("");
        c_name.setText("");
        c_ph.setText("");
        
    }//GEN-LAST:event_deleteCustomerActionPerformed

    private void addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerActionPerformed
        //insert code
        String name= c_name.getText();
        String ph= c_ph.getText();

        if(name.equals("") || ph.equals("")){
            JOptionPane.showMessageDialog(null, "Fill up all the fields");  
        }else if( ph.length()!=10 ){
            JOptionPane.showMessageDialog(null, "Invalid phone number. ");
        }else{
            try{
                Statement s=db.mycon().createStatement();
                s.executeUpdate("INSERT INTO customer (Customer_name,Ph_number) VALUES ('"+name+"','"+ph+"')");
                JOptionPane.showMessageDialog(null, "Data has been saved");
            }catch (SQLException e){
                System.out.println(e);
            }
            tb_load();
                    
        } 
        c_name.setText("");
        c_ph.setText("");
    }//GEN-LAST:event_addCustomerActionPerformed

    private void searchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerActionPerformed
        // search btn code
        String search=c_search.getText();
        int checkid=0;
        try{
            Statement s= db.mycon().createStatement();
            ResultSet rs=s.executeQuery("SELECT *FROM customer WHERE cid='"+search+"'");
            if(rs.next()){
                c_name.setText(rs.getString("Customer_name"));
                c_ph.setText(rs.getString("Ph_number"));
            }
            else if(checkid==0){
                JOptionPane.showMessageDialog(null, "Customer id does not exist");
                c_name.setText("");
                c_ph.setText("");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        tb_load();
        
    }//GEN-LAST:event_searchCustomerActionPerformed

    private void updateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomerActionPerformed
        // update btn code

        String name = c_name.getText();
        String ph = c_ph.getText();
        String id = c_search.getText();

        try {

            Statement s = db.mycon().createStatement();
            s.executeUpdate(" UPDATE customer SET Customer_name ='"+name+"' ,Ph_number= '"+ph+"' WHERE cid = '"+id+"' ");
            JOptionPane.showMessageDialog(null, "Data has been updated");
        } catch (Exception e) {
            System.out.println(e);
        }
        tb_load();
        c_name.setText("");
        c_ph.setText("");
    }//GEN-LAST:event_updateCustomerActionPerformed

    private void tableMouseClicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicMouseClicked
        // mouse click and get data to textfield
        int r=tableMouseClic.getSelectedRow();

        String id=tableMouseClic.getValueAt(r, 0).toString();
        String name=tableMouseClic.getValueAt(r, 1).toString();
        String ph=tableMouseClic.getValueAt(r, 2).toString();

        c_search.setText(id);
        c_name.setText(name);
        c_ph.setText(ph);
    }//GEN-LAST:event_tableMouseClicMouseClicked

    private void customerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerSearchActionPerformed

    private void customerSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerSearchKeyReleased

        String name=customerSearch.getText();
        try {
            DefaultTableModel dt=(DefaultTableModel) tableMouseClic.getModel();
            dt.setRowCount(0);
            Statement s=db.mycon().createStatement();

            ResultSet rs=s.executeQuery("SELECT * FROM customer WHERE customer_name LIKE '%"+name+"%' ");

            while (rs.next()){
                Vector v=new Vector();

                v.add(rs.getString (1));
                v.add(rs.getString (2));
                v.add(rs.getString (3));

                dt.addRow(v);

            }
        } catch (Exception e) {
            tb_load();
        }
    }//GEN-LAST:event_customerSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomer;
    private javax.swing.JTextField c_name;
    private javax.swing.JTextField c_ph;
    private javax.swing.JTextField c_search;
    private javax.swing.JTextField customerSearch;
    private javax.swing.JButton deleteCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchCustomer;
    private javax.swing.JTable tableMouseClic;
    private javax.swing.JButton updateCustomer;
    // End of variables declaration//GEN-END:variables
}
