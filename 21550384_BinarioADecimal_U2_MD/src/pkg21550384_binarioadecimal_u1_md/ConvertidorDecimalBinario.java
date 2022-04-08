/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21550384_binarioadecimal_u1_md;

/**
 *
 * @author chant
 */
public class ConvertidorDecimalBinario extends javax.swing.JFrame {

    /**
     * Creates new form ConvertidorDecimalBinario
     */
    public ConvertidorDecimalBinario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDecimal = new javax.swing.JTextField();
        btnConvertir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBinario = new javax.swing.JTextField();
        btnConvertidorBinario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 240, -1));

        btnConvertir.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel2.setText("Escribe un número decimal para convertirlo en binario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 320, 20));

        txtBinario.setEditable(false);
        txtBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBinarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtBinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 150, -1));

        btnConvertidorBinario.setText("Convertidor binario a decimal");
        btnConvertidorBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertidorBinarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnConvertidorBinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\chant\\Downloads\\W.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        // TODO add your handling code here:
        String sDecimal = txtDecimal.getText();
        Long lDecimal = Long.valueOf(sDecimal);
        String sBinario = Long.toBinaryString(lDecimal);
                txtBinario.setText(sBinario);
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void txtBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBinarioActionPerformed

    }//GEN-LAST:event_txtBinarioActionPerformed

    private void btnConvertidorBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertidorBinarioActionPerformed
        // TODO add your handling code here:
        ConvertidorBinarioDecimal cObjt = new ConvertidorBinarioDecimal();
        cObjt.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConvertidorBinarioActionPerformed

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
            java.util.logging.Logger.getLogger(ConvertidorDecimalBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConvertidorDecimalBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConvertidorDecimalBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvertidorDecimalBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConvertidorDecimalBinario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertidorBinario;
    private javax.swing.JButton btnConvertir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtBinario;
    private javax.swing.JTextField txtDecimal;
    // End of variables declaration//GEN-END:variables
}
