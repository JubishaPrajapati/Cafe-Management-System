
package pos.project;

import java.awt.BorderLayout;
import java.util.HashMap;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

public class Reports extends javax.swing.JPanel {

    public Reports() {
        initComponents();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        para_inid = new javax.swing.JTextField();
        viewAllBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        queryChartBtn = new javax.swing.JButton();
        panelChart = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1473, 781));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Search By Invoice No:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 32, -1, 43));

        para_inid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        para_inid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                para_inidActionPerformed(evt);
            }
        });
        para_inid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                para_inidKeyReleased(evt);
            }
        });
        jPanel2.add(para_inid, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 34, 306, 43));

        viewAllBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        viewAllBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/view all.png"))); // NOI18N
        viewAllBtn.setText("View All Sales");
        viewAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllBtnActionPerformed(evt);
            }
        });
        jPanel2.add(viewAllBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 50, 220, 45));

        viewBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        viewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/view.png"))); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        jPanel2.add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 95, -1, 45));

        queryChartBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        queryChartBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/project/img/view all.png"))); // NOI18N
        queryChartBtn.setText("Sales Graph");
        queryChartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryChartBtnActionPerformed(evt);
            }
        });
        jPanel2.add(queryChartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 50, -1, -1));

        panelChart.setBackground(new java.awt.Color(204, 51, 0));
        panelChart.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelChartAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        panelChart.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1433, Short.MAX_VALUE)
                    .addComponent(panelChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelChart, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void para_inidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_para_inidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_para_inidActionPerformed

    private void para_inidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_para_inidKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_para_inidKeyReleased

    private void viewAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllBtnActionPerformed
        // view all report
        ReportView r = new ReportView("src\\reports\\inidreport.jasper");
            r.setVisible(true);
    }//GEN-LAST:event_viewAllBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // invo_para ireport parameter
        
        HashMap para = new HashMap();
        
        para.put("invo_para", para_inid.getText());
        
        ReportView r =new ReportView("src\\reports\\reportsearch.jasper", para);
        r.setVisible(true);
        
    }//GEN-LAST:event_viewBtnActionPerformed

    private void panelChartAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelChartAncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_panelChartAncestorAdded

    private void queryChartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryChartBtnActionPerformed
        // TODO add your handling code here:
        try {
            String query= "SELECT Date, Total_Bill from sales";
            JDBCCategoryDataset dataset= new JDBCCategoryDataset(db.mycon(),query);
            JFreeChart chart= ChartFactory.createLineChart("Query Chart", "Date", "Total_Bill", dataset, PlotOrientation.VERTICAL, false, true, true);
            BarRenderer renderer=null;
            CategoryPlot plot=null;
            renderer =new BarRenderer();
            ChartPanel panel=new ChartPanel(chart);
            panelChart.removeAll();
            panelChart.add(panel,BorderLayout.CENTER);
            panelChart.validate();
            
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_queryChartBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelChart;
    private javax.swing.JTextField para_inid;
    private javax.swing.JButton queryChartBtn;
    private javax.swing.JButton viewAllBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
