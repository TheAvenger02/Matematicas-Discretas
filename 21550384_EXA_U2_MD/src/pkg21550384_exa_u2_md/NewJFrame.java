
package pkg21550384_exa_u2_md;

public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLargo = new javax.swing.JTextField();
        txtAncho = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblConstrucción = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingrese el largo de su construcción:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese el ancho de su construcción:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        txtLargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLargoActionPerformed(evt);
            }
        });
        txtLargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLargoKeyTyped(evt);
            }
        });
        getContentPane().add(txtLargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 60, -1));

        txtAncho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnchoKeyTyped(evt);
            }
        });
        getContentPane().add(txtAncho, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 70, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("A su construcción le restan:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 160, 20));

        txtResultado.setEditable(false);
        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 230, -1));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        lblConstrucción.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblConstrucción, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 100, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg21550384_exa_u2_md/8869.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLargoActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Obtenemos los datos
        String sLargo = txtLargo.getText();
        String sAncho = txtAncho.getText();
        //Convertimos los datos a entero
        int iLargo = Integer.parseInt(sLargo);
        int iAncho = Integer.parseInt(sAncho);
        //Multiplicamos Largo x Ancho
        int iM = iLargo*iAncho;
        int iR = 500-iM;
        // Evaluamos si es menor o igual al terreno
        if(iM<=500){
        lblConstrucción.setText(String.valueOf(iR));
        // Evaluamos según sea la construcción del terreno
        if(iR<=20){
            txtResultado.setText("Deplorable");    
        }
        else if(iR>=20 && iR<=30){
            txtResultado.setText("Poco óptimo"); 
        }
        else if(iR>=30 && iR<=50){
            txtResultado.setText("Insuficiente"); 
        }
        else if(iR>=50 && iR<=70){
            txtResultado.setText("Óptimo"); 
        }
        else if(iR>=70 && iR<=100){
            txtResultado.setText("Sobrado"); 
        }
        else if(iR>100){
            txtResultado.setText("Imposible"); 
        }
        }
        // Es mayor al terreno
        else{
            txtResultado.setText("ERROR");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtLargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLargoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLargoKeyTyped

    private void txtAnchoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnchoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnchoKeyTyped

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblConstrucción;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtLargo;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
