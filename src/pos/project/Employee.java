
package pos.project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Employee extends javax.swing.JPanel {

    public Employee() {
        initComponents();
       
        tb_load();
    }
    public void tb_load(){
  
  
      try {
          
          DefaultTableModel dt = (DefaultTableModel) tableMouseClick.getModel();
          dt.setRowCount(0);
          
          Statement s = db.mycon().createStatement();
          ResultSet rs = s.executeQuery(" SELECT * FROM employee");
          
          while (rs.next()) {              
              
              Vector v = new Vector();
              
              v.add(rs.getString(1));
              v.add(rs.getString(2));
              v.add(rs.getString(3));
              v.add(rs.getString(4));
              v.add(rs.getString (5));
              v.add(rs.getString (6));

              dt.addRow(v);    
          }
          
      } catch (SQLException e) {
          System.out.println(e);
      }
  
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        e_search = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        e_name = new javax.swing.JTextField();
        e_typ = new javax.swing.JTextField();
        deleteEmployee = new javax.swing.JButton();
        addEmployee = new javax.swing.JButton();
        searchEmployee = new javax.swing.JButton();
        updateEmployee = new javax.swing.JButton();
        e_ph = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        e_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        e_address = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMouseClick = new javax.swing.JTable();
        employeeSearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setText("Employee Information");

        e_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        e_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_searchActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Search ID:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39)
                        .addComponent(e_search, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e_search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 730, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Type:");

        e_name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        e_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_nameActionPerformed(evt);
            }
        });

        e_typ.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        e_typ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_typActionPerformed(evt);
            }
        });

        deleteEmployee.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        deleteEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/delete.png"))); // NOI18N
        deleteEmployee.setText("Delete");
        deleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeActionPerformed(evt);
            }
        });

        addEmployee.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/save.png"))); // NOI18N
        addEmployee.setText("Save");
        addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });

        searchEmployee.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        searchEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/search.png"))); // NOI18N
        searchEmployee.setText("Search");
        searchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmployeeActionPerformed(evt);
            }
        });

        updateEmployee.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        updateEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/update.png"))); // NOI18N
        updateEmployee.setText("Update");
        updateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmployeeActionPerformed(evt);
            }
        });

        e_ph.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        e_ph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_phActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Ph.Number:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Address:");

        e_email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Email:");

        e_address.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(addEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchEmployee)
                .addGap(18, 18, 18)
                .addComponent(updateEmployee)
                .addGap(18, 18, 18)
                .addComponent(deleteEmployee)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(e_name, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(e_ph, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                        .addComponent(e_typ)
                        .addComponent(e_email)
                        .addComponent(e_address, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e_name, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e_ph, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e_address, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e_email, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e_typ, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addEmployee)
                            .addComponent(searchEmployee))
                        .addGap(94, 94, 94))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateEmployee)
                            .addComponent(deleteEmployee))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 730, -1));

        tableMouseClick.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tableMouseClick.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Employee_Name", "Ph_Number", "Address", "Email ", "Type"
            }
        ));
        tableMouseClick.setRowHeight(25);
        tableMouseClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClickMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMouseClick);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 230, 670, 541));

        employeeSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        employeeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeSearchActionPerformed(evt);
            }
        });
        employeeSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                employeeSearchKeyReleased(evt);
            }
        });
        add(employeeSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1015, 106, 357, 39));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Search :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 110, 99, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void employeeSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeSearchKeyReleased
        String name=employeeSearch.getText();
        try {
            DefaultTableModel dt=(DefaultTableModel) tableMouseClick.getModel();
            dt.setRowCount(0);
            Statement s=db.mycon().createStatement();

            ResultSet rs=s.executeQuery("SELECT * FROM employee WHERE Employee_name LIKE '%"+name+"%' ");

            while (rs.next()){
                Vector v=new Vector();

                v.add(rs.getString (1));
                v.add(rs.getString (2));
                v.add(rs.getString (3));
                v.add(rs.getString (4));
                v.add(rs.getString (5));
                v.add(rs.getString (6));

                dt.addRow(v);

            }
        } catch (Exception e) {
            tb_load();
            e_name.setText("");
            e_ph.setText("");
            e_address.setText("");
            e_email.setText("");
            e_typ.setText("");
        }
    }//GEN-LAST:event_employeeSearchKeyReleased

    private void employeeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeSearchActionPerformed

    private void e_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e_searchActionPerformed

    private void tableMouseClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClickMouseClicked
        // mouse click and get data to textfield
        int r=tableMouseClick.getSelectedRow();

        String id=tableMouseClick.getValueAt(r, 0).toString();
        String name=tableMouseClick.getValueAt(r, 1).toString();
        String ph=tableMouseClick.getValueAt(r, 2).toString();
        String address=tableMouseClick.getValueAt(r, 3).toString();
        String mail=tableMouseClick.getValueAt(r, 4).toString();
        String typ=tableMouseClick.getValueAt(r, 5).toString();

        e_search.setText(id);
        e_name.setText(name);
        e_ph.setText(ph);
        e_address.setText(address);
        e_email.setText(mail);
        e_typ.setText(typ);
    }//GEN-LAST:event_tableMouseClickMouseClicked

    private void e_phActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_phActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e_phActionPerformed

    private void updateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeeActionPerformed
        // update btn code

        String name = e_name.getText();
        String ph = e_ph.getText();
        String address=e_address.getText();
        String mail=e_email.getText();
        String typ = e_typ.getText();
        String id = e_search.getText();

        try {

            Statement s = db.mycon().createStatement();
            s.executeUpdate(" UPDATE employee SET Employee_name ='"+name+"' ,Ph_number= '"+ph+"',Address='"+address+"',Email='"+mail+"',Type='"+typ+"' WHERE eid = '"+id+"' ");
            JOptionPane.showMessageDialog(null, "Data has been updated");
        } catch (Exception e) {
            System.out.println(e);
        }
        tb_load();
        e_name.setText("");
        e_ph.setText("");
        e_address.setText("");
        e_email.setText("");
        e_typ.setText("");
    }//GEN-LAST:event_updateEmployeeActionPerformed

    private void searchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmployeeActionPerformed
        // search btn code
        String search=e_search.getText();
        try{
            Statement s= db.mycon().createStatement();
            ResultSet rs=s.executeQuery("SELECT *FROM employee WHERE eid='"+search+"'");
            if(rs.next()){
                e_name.setText(rs.getString("Employee_name"));
                e_ph.setText(rs.getString("Ph_number"));
                e_address.setText(rs.getString("Address"));
                e_email.setText(rs.getString("Email"));
                e_typ.setText(rs.getString("Type"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_searchEmployeeActionPerformed

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        // insert Employee
        String name= e_name.getText();
        String ph= e_ph.getText();
        String address=e_address.getText();
        String mail=e_email.getText();
        String typ= e_typ.getText();
        if(name.equals("") || ph.equals("")|| address.equals("")|| mail.equals("")|| typ.equals("")){
            JOptionPane.showMessageDialog(null, "Fill up all the fields");
        }else if( ph.length()!=10 ){
            JOptionPane.showMessageDialog(null, "Invalid phone number. ");
        }else{
            try{
                Statement s=db.mycon().createStatement();
                s.executeUpdate("INSERT INTO employee (Employee_name,Ph_number,Address,Email,Type) VALUES ('"+name+"','"+ph+"','"+address+"','"+mail+"','"+typ+"')");
                JOptionPane.showMessageDialog(null, "Data has been saved");
            }catch (SQLException e){
                System.out.println(e);
            }
            tb_load();
        }
        e_name.setText("");
        e_ph.setText("");
        e_address.setText("");
        e_email.setText("");
        e_typ.setText("");
    }//GEN-LAST:event_addEmployeeActionPerformed

    private void deleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeActionPerformed
        //delete btn code

        String id = e_search.getText();
        try {

            Statement s = db.mycon().createStatement();
            s.executeUpdate("DELETE FROM employee WHERE eid = '"+id+"'");
            JOptionPane.showMessageDialog(null, "Data has been deleted");

        } catch (SQLException e) {
            System.out.println(e);
        }
        tb_load();
        e_name.setText("");
        e_ph.setText("");
        e_address.setText("");
        e_email.setText("");
        e_typ.setText("");
    }//GEN-LAST:event_deleteEmployeeActionPerformed

    private void e_typActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_typActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e_typActionPerformed

    private void e_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e_nameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployee;
    private javax.swing.JButton deleteEmployee;
    private javax.swing.JTextField e_address;
    private javax.swing.JTextField e_email;
    private javax.swing.JTextField e_name;
    private javax.swing.JTextField e_ph;
    private javax.swing.JTextField e_search;
    private javax.swing.JTextField e_typ;
    private javax.swing.JTextField employeeSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchEmployee;
    private javax.swing.JTable tableMouseClick;
    private javax.swing.JButton updateEmployee;
    // End of variables declaration//GEN-END:variables
}
