
package pos.project;

public class Homepg extends javax.swing.JPanel {

    public Homepg() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\JUBISHA\\Desktop\\guluz logo.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setPreferredSize(new java.awt.Dimension(600, 600));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -20, -1, 864));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("                              WELCOME BACK \n        LETS TAKE A STEP TOWARDS OUR GOAL\n\n     \"Success comes to those who dare to dream and \n                          take calculated risks. \n      Every setback is an opportunity to learn and grow\n                                   stronger.\" ");
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 600, 290));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
