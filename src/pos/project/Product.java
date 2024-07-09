
package pos.project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Product extends javax.swing.JPanel {

    public Product() {
        initComponents();
        tb_load();
    }
    public void tb_load(){
  
  
      try {
          
          DefaultTableModel dt = (DefaultTableModel) tableMouseClick.getModel();
          dt.setRowCount(0);
          
          Statement s = db.mycon().createStatement();
          ResultSet rs = s.executeQuery(" SELECT * FROM product");
          
          while (rs.next()) {              
              
              Vector v = new Vector();
              
              v.add(rs.getString(1));
              v.add(rs.getString(2));
              v.add(rs.getString(3));
              v.add(rs.getString(4));
              v.add(rs.getString(5));
              
              dt.addRow(v);    
          }
          
      } catch (SQLException e) {
          System.out.println(e);
      }
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p_name = new javax.swing.JTextField();
        p_price = new javax.swing.JTextField();
        deleteProduct = new javax.swing.JButton();
        addProduct = new javax.swing.JButton();
        searchProduct = new javax.swing.JButton();
        updateProduct = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        p_category = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        p_qty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMouseClick = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        p_search = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productSearch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1473, 781));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Items Name:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Price:");

        p_name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        p_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_nameActionPerformed(evt);
            }
        });

        p_price.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        p_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_priceActionPerformed(evt);
            }
        });

        deleteProduct.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        deleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/delete.png"))); // NOI18N
        deleteProduct.setText("Delete");
        deleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductActionPerformed(evt);
            }
        });

        addProduct.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/save.png"))); // NOI18N
        addProduct.setText("Save");
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });

        searchProduct.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        searchProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/search.png"))); // NOI18N
        searchProduct.setText("Search");
        searchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductActionPerformed(evt);
            }
        });

        updateProduct.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        updateProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/update.png"))); // NOI18N
        updateProduct.setText("Update");
        updateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProductActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Category:");

        p_category.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        p_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_categoryActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Quantity:");

        p_qty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        p_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_qtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addProduct)
                        .addGap(18, 18, 18)
                        .addComponent(searchProduct)
                        .addGap(18, 18, 18)
                        .addComponent(updateProduct)
                        .addGap(18, 18, 18)
                        .addComponent(deleteProduct)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p_name, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                            .addComponent(p_category)
                            .addComponent(p_price)
                            .addComponent(p_qty))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_name, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_price, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_category, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProduct)
                    .addComponent(searchProduct)
                    .addComponent(updateProduct)
                    .addComponent(deleteProduct))
                .addGap(89, 89, 89))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 710, 550));

        tableMouseClick.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tableMouseClick.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Product_Name", "Price", "Category", "Quantity"
            }
        ));
        tableMouseClick.setRowHeight(25);
        tableMouseClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClickMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMouseClick);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 680, 550));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        p_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_searchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setText("Product Information");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Search ID:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel4)
                .addGap(55, 55, 55)
                .addComponent(p_search, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 710, 160));

        productSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        productSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productSearchActionPerformed(evt);
            }
        });
        productSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productSearchKeyReleased(evt);
            }
        });
        add(productSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 110, 350, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Search :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, 99, 39));
    }// </editor-fold>//GEN-END:initComponents

    private void p_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_nameActionPerformed

    private void p_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_priceActionPerformed

    private void p_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_searchActionPerformed

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed
        //insert code
        
        String name= p_name.getText();
        String price= p_price.getText();
        String category= p_category.getText();
        String qty= p_qty.getText();
        if(name.equals("") || price.equals("")|| category.equals("")|| qty.equals("")){
            JOptionPane.showMessageDialog(null, "Fill up all the fields");
        }else{

        try{
            Statement s=db.mycon().createStatement();
            s.executeUpdate("INSERT INTO product (Product_name,Price,Category,Quantity) VALUES ('"+name+"','"+price+"','"+category+"','"+qty+"')");
            JOptionPane.showMessageDialog(null, "Data has been saved");
        }catch (SQLException e){
            System.out.println(e);
        }
        tb_load();
        }
        p_name.setText("");
        p_price.setText("");
        p_category.setText("");
        p_qty.setText("");
    }//GEN-LAST:event_addProductActionPerformed

    private void p_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_categoryActionPerformed

    private void p_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_qtyActionPerformed

    private void productSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productSearchActionPerformed

    private void searchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductActionPerformed
        // search btn code
        String search=p_search.getText();
        try{
            Statement s= db.mycon().createStatement();
            ResultSet rs=s.executeQuery("SELECT *FROM product WHERE pid='"+search+"'");
            if(rs.next()){
                p_name.setText(rs.getString("Product_name"));
                p_price.setText(rs.getString("Price"));
                p_category.setText(rs.getString("Category"));
                p_qty.setText(rs.getString("Quantity"));
                
            }
        }catch(SQLException e){
            System.out.println(e);      
        }
        tb_load();
    }//GEN-LAST:event_searchProductActionPerformed

    private void updateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProductActionPerformed
         // update btn code
        
        String name= p_name.getText();
        String price= p_price.getText();
        String category= p_category.getText();
        String qty= p_qty.getText();
        String id = p_search.getText();
        
        try {

            Statement s = db.mycon().createStatement();
            s.executeUpdate(" UPDATE product SET Product_name ='"+name+"' ,Price= '"+price+"',Category= '"+category+"',Quantity= '"+qty+"' WHERE pid = '"+id+"' ");
            JOptionPane.showMessageDialog(null, "Data has been updated");
        } catch (Exception e) {
            System.out.println(e);
        }
        tb_load();
        p_name.setText("");
        p_price.setText("");
        p_category.setText("");
        p_qty.setText("");
    }//GEN-LAST:event_updateProductActionPerformed

    private void deleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductActionPerformed
        //delete btn code

        String id = p_search.getText();
        try {

            Statement s = db.mycon().createStatement();
            s.executeUpdate("DELETE FROM product WHERE pid = '"+id+"'");
            JOptionPane.showMessageDialog(null, "Data has been deleted");

        } catch (SQLException e) {
            System.out.println(e);
        }
        tb_load();
        p_name.setText("");
        p_price.setText("");
        p_category.setText("");
        p_qty.setText("");
    }//GEN-LAST:event_deleteProductActionPerformed

    private void productSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productSearchKeyReleased
        String name=productSearch.getText();
        try {
            DefaultTableModel dt=(DefaultTableModel) tableMouseClick.getModel();
            dt.setRowCount(0);
            Statement s=db.mycon().createStatement();
            
            ResultSet rs=s.executeQuery("SELECT * FROM product WHERE Product_name LIKE '%"+name+"%' ");
            
            while (rs.next()){
                Vector v=new Vector();
                
                v.add(rs.getString (1));
                v.add(rs.getString (2));
                v.add(rs.getString (3));
                v.add(rs.getString (4));
                v.add(rs.getString (5));
                
                dt.addRow(v);
                
            }
        } catch (Exception e) {
            tb_load();
        }
    }//GEN-LAST:event_productSearchKeyReleased

    private void tableMouseClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClickMouseClicked
        int r = tableMouseClick.getSelectedRow();
       
       String id  = tableMouseClick.getValueAt(r, 0).toString();
       String name  = tableMouseClick.getValueAt(r, 1).toString();
       String price  = tableMouseClick.getValueAt(r, 2).toString();
       String category = tableMouseClick.getValueAt(r, 3).toString();
       String qty  = tableMouseClick.getValueAt(r, 4).toString();
       
       
        p_search.setText(id);
        p_name.setText(name);  
        p_price.setText(price);
        p_category.setText(category);
        p_qty.setText(qty);
    }//GEN-LAST:event_tableMouseClickMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProduct;
    private javax.swing.JButton deleteProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField p_category;
    private javax.swing.JTextField p_name;
    private javax.swing.JTextField p_price;
    private javax.swing.JTextField p_qty;
    private javax.swing.JTextField p_search;
    private javax.swing.JTextField productSearch;
    private javax.swing.JButton searchProduct;
    private javax.swing.JTable tableMouseClick;
    private javax.swing.JButton updateProduct;
    // End of variables declaration//GEN-END:variables
}
