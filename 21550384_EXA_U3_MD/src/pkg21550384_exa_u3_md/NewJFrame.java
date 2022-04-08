package pkg21550384_exa_u3_md;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class NewJFrame extends javax.swing.JFrame {
    // Global Variables
    public static String sNombreFormulario = "", sEstadoEncuesta = "", sRespuesta1 = "", sRespuesta2 = "", sPreferencias = "", sDálmata = "", sChihuahuenio = "", sPastor = "";
    
    public NewJFrame() {
        initComponents();
        
        // Creamos un arreglo con los estados para mostrarlo en el Combo Box
        String[] arrayEstado = new String[]{"Selecciona el Estado", "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas",  "Cihuahua", "CDMX", "Coahuila", "Colima", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas"};
        cbEstado.setModel(new DefaultComboBoxModel(arrayEstado));
        
        // Creamos grupo de botones para seleccionar la respuesta
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(rbVerdadero);
        grupo1.add(rbFalso);
        
        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(rbCanidae);
        grupo2.add(jRadioButton4);
    }
    
        // Método para validar si es que se seleccionó o no el checkbox con las preferencias uno a uno.
    private String validarVacío(String sVal) {

        if (sVal.equals("")) {
            return "";
        } else {
            return sVal + "\n";
        }
    }
    
    
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        rbVerdadero = new javax.swing.JRadioButton();
        rbFalso = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        rbCanidae = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnResultado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Encuesta de Perritos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 150, 20));

        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 190, 20));

        cb1.setText("Dálmata");
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        cb2.setText("Chihuahueño");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        cb3.setText("Pastor alemán");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });
        getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("Elige la raza de perros que te gusten:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, 20));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 210, -1));

        rbVerdadero.setText("Verdadero");
        rbVerdadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVerdaderoActionPerformed(evt);
            }
        });
        getContentPane().add(rbVerdadero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        rbFalso.setText("Falso");
        rbFalso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFalsoActionPerformed(evt);
            }
        });
        getContentPane().add(rbFalso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel4.setText("El Husky Siberiano es una de las razas de perro que sueltan más pelo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 350, -1));

        jLabel5.setText("Estado:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jRadioButton4.setText("Acanthaceae");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        rbCanidae.setText("Canidae");
        rbCanidae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCanidaeActionPerformed(evt);
            }
        });
        getContentPane().add(rbCanidae, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel6.setText("Escribe tu nombre:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel7.setText("La familia de los perros es:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        btnResultado.setText("Resultado");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
        // Vemos si está seleccionado
        if (cb1.isSelected()) {
            sDálmata = "Dálmata";
        } else {
            sDálmata = "";
        }
    }//GEN-LAST:event_cb1ActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        // TODO add your handling code here:
        
        // Obteniendo el nombre del formulario
        String sNombre = txtNombre.getText();
        sNombreFormulario = validarVacío(sNombre);

        // Validamos la raza de perros que le gustan
        String sPreferencia = sDálmata + " " + sChihuahuenio + " " + sPastor;
        sPreferencias = sPreferencia;
        
        // Nos lleva a la otra pantalla
        NewJFrame1 pO = new NewJFrame1();
        pO.setVisible(rootPaneCheckingEnabled);
        // Cierra la ventana anterior
        dispose();
        
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
        // Vemos si está seleccionado
        if (cb2.isSelected()) {
            sChihuahuenio = "Chihuahueño";
        } else {
            sChihuahuenio = "";
        }
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
        // Vemos si está seleccionado
        if (cb3.isSelected()) {
            sPastor = "Pastor alemán";
        } else {
            sPastor = "";
        }
    }//GEN-LAST:event_cb3ActionPerformed

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        // TODO add your handling code here:
        // Convertimos el Estado que seleccionó a texto
        String sEstado = cbEstado.getSelectedItem().toString();
        if (!sEstado.equals("Selecciona Estado")) {
            sEstadoEncuesta = sEstado;
        }
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void rbCanidaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCanidaeActionPerformed
        // TODO add your handling code here:
        // Respuesta correcta
        if (rbCanidae.isEnabled()) {
            sRespuesta1 = "Respuesta correcta";
        }
        
    }//GEN-LAST:event_rbCanidaeActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        // Respuesta incorrecta
        if (jRadioButton4.isEnabled()) {
            sRespuesta1 = "Respuesta incorrecta";
        }
        
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void rbVerdaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVerdaderoActionPerformed
        // TODO add your handling code here:
        // Respuesta correcta
        if (rbVerdadero.isEnabled()) {
            sRespuesta2 = "Respuesta correcta";
        }
    }//GEN-LAST:event_rbVerdaderoActionPerformed

    private void rbFalsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFalsoActionPerformed
        // TODO add your handling code here:
        // Respuesta incorrecta
        if (rbFalso.isEnabled()) {
            sRespuesta2 = "Respuesta incorrecta";
        }
        
    }//GEN-LAST:event_rbFalsoActionPerformed

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
    private javax.swing.JButton btnResultado;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton rbCanidae;
    private javax.swing.JRadioButton rbFalso;
    private javax.swing.JRadioButton rbVerdadero;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
