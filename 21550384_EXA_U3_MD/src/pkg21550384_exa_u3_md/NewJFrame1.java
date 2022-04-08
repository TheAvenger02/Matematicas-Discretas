package pkg21550384_exa_u3_md;

import static pkg21550384_exa_u3_md.NewJFrame.sEstadoEncuesta;
import static pkg21550384_exa_u3_md.NewJFrame.sNombreFormulario;
import static pkg21550384_exa_u3_md.NewJFrame.sPreferencias;
import static pkg21550384_exa_u3_md.NewJFrame.sRespuesta1;
import static pkg21550384_exa_u3_md.NewJFrame.sRespuesta2;


public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
        initComponents();
        
        lblNombre.setText("Nombre: \n"+ sNombreFormulario);
        lblEstado.setText("Estado: \n"+ sEstadoEncuesta);
        lblTO.setText(sRespuesta1);
        lblCI.setText(sRespuesta2);
        lblPreferencias.setText("Raza de perros que te gustan: \n" + sPreferencias);

    }

    // Se me fue la onda para imprimir en el lbl las cosas de la encuesta, sorry.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        lblPreferencias = new javax.swing.JLabel();
        lblTO = new javax.swing.JLabel();
        lblCI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Tus resultados son:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, 20));

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));
        getContentPane().add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 20));
        getContentPane().add(lblPreferencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 380, 20));
        getContentPane().add(lblTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 380, 20));
        getContentPane().add(lblCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 380, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Cerrar
        System.exit(0);
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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCI;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPreferencias;
    private javax.swing.JLabel lblTO;
    // End of variables declaration//GEN-END:variables
}
