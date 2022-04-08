package pkg21550384_practicapreexamen_u3_md;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Pizzería extends javax.swing.JFrame {
    
    int iPrecioMasa = 0, iIngrediente = 0, iPrecioTamanio = 0;;

    public Pizzería() {
        initComponents();
        
        String[] arrayTamanio = new String[]{"Selecciona el tamaño", "Grande", "Mediana", "Chica"};
        cbTamanio.setModel(new DefaultComboBoxModel(arrayTamanio));
        
        String[] arrayMasa = new String[]{"Selecciona la masa", "Original", "Italiana", "Al sartén", "Orilla de queso"};
        cbMasa.setModel(new DefaultComboBoxModel(arrayMasa));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbSalami = new javax.swing.JCheckBox();
        cbPepperoni = new javax.swing.JCheckBox();
        cbJamón = new javax.swing.JCheckBox();
        cbQueso = new javax.swing.JCheckBox();
        cbSalchicha = new javax.swing.JCheckBox();
        cbPiña = new javax.swing.JCheckBox();
        cbCereza = new javax.swing.JCheckBox();
        btnTotal = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        cbTamanio = new javax.swing.JComboBox<>();
        cbMasa = new javax.swing.JComboBox<>();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Orsinis Pizzería ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Elige los ingredientes:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        cbSalami.setForeground(new java.awt.Color(0, 0, 0));
        cbSalami.setText("Salami");
        cbSalami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalamiActionPerformed(evt);
            }
        });
        getContentPane().add(cbSalami, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        cbPepperoni.setForeground(new java.awt.Color(0, 0, 0));
        cbPepperoni.setText("Pepperoni");
        cbPepperoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPepperoniActionPerformed(evt);
            }
        });
        getContentPane().add(cbPepperoni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        cbJamón.setForeground(new java.awt.Color(0, 0, 0));
        cbJamón.setText("Jamón");
        cbJamón.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJamónActionPerformed(evt);
            }
        });
        getContentPane().add(cbJamón, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        cbQueso.setForeground(new java.awt.Color(0, 0, 0));
        cbQueso.setText("Queso");
        cbQueso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQuesoActionPerformed(evt);
            }
        });
        getContentPane().add(cbQueso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        cbSalchicha.setForeground(new java.awt.Color(0, 0, 0));
        cbSalchicha.setText("Salchicha");
        cbSalchicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalchichaActionPerformed(evt);
            }
        });
        getContentPane().add(cbSalchicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        cbPiña.setForeground(new java.awt.Color(0, 0, 0));
        cbPiña.setText("Piña");
        cbPiña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPiñaActionPerformed(evt);
            }
        });
        getContentPane().add(cbPiña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        cbCereza.setForeground(new java.awt.Color(0, 0, 0));
        cbCereza.setText("Cereza");
        cbCereza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCerezaActionPerformed(evt);
            }
        });
        getContentPane().add(cbCereza, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        btnTotal.setForeground(new java.awt.Color(0, 0, 0));
        btnTotal.setText("Total");
        btnTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });
        getContentPane().add(btnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 130, -1));

        lblTotal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 180, 20));

        cbTamanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTamanioActionPerformed(evt);
            }
        });
        getContentPane().add(cbTamanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, -1));

        cbMasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMasaActionPerformed(evt);
            }
        });
        getContentPane().add(cbMasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 170, -1));

        btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrar.setText("Borrar total");
        btnBorrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg21550384_practicapreexamen_u3_md/12.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // TODO add your handling code here:
        int iTotal = iPrecioTamanio + iPrecioMasa + iIngrediente;
        String sTotal = Integer.toString(iTotal);
        lblTotal.setText("El precio total es de: $" + sTotal);
    }//GEN-LAST:event_btnTotalActionPerformed

    private void cbTamanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTamanioActionPerformed
        // TODO add your handling code here:
        String sTamanio = cbTamanio.getSelectedItem().toString();
        switch (sTamanio) {
            case "Grande":
                iPrecioTamanio = 80;
                break;
            case "Mediana":
                iPrecioTamanio = 70;
                break;
            case "Chica":
                iPrecioTamanio = 60;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Selecciona un tamaño para continuar.", "Error de selección", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cbTamanioActionPerformed

    private void cbMasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMasaActionPerformed
        // TODO add your handling code here:
        String sMasa = cbMasa.getSelectedItem().toString();
        switch (sMasa) {
            case "Original":
                   iPrecioMasa = 0;
                break;
            case "Italiana":
                   iPrecioMasa = 10;
                break;
            case "Al sartén":
                    iPrecioMasa = 20;
                break;
            case "Orilla de queso":
                    iPrecioMasa = 30;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Selecciona una masa para continuar.", "Error de selección", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cbMasaActionPerformed

    private void cbPepperoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPepperoniActionPerformed
        // TODO add your handling code here:
        if (cbPepperoni.isSelected()) {
            iIngrediente += 10;
        }
    }//GEN-LAST:event_cbPepperoniActionPerformed

    private void cbJamónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJamónActionPerformed
        // TODO add your handling code here:
        if (cbJamón.isSelected()) {
            iIngrediente += 10;
        }
    }//GEN-LAST:event_cbJamónActionPerformed

    private void cbQuesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQuesoActionPerformed
        // TODO add your handling code here:
        if (cbQueso.isSelected()) {
            iIngrediente += 10;
        }
    }//GEN-LAST:event_cbQuesoActionPerformed

    private void cbSalamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalamiActionPerformed
        // TODO add your handling code here:
        if (cbSalami.isSelected()) {
            iIngrediente += 10;
        }
    }//GEN-LAST:event_cbSalamiActionPerformed

    private void cbSalchichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalchichaActionPerformed
        // TODO add your handling code here:
        if (cbSalchicha.isSelected()) {
            iIngrediente += 10;
        }
    }//GEN-LAST:event_cbSalchichaActionPerformed

    private void cbPiñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPiñaActionPerformed
        // TODO add your handling code here:
        if (cbPiña.isSelected()) {
            iIngrediente += 10;
        }
    }//GEN-LAST:event_cbPiñaActionPerformed

    private void cbCerezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCerezaActionPerformed
        // TODO add your handling code here:
        if (cbCereza.isSelected()) {
            iIngrediente += 10;
        }
    }//GEN-LAST:event_cbCerezaActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        lblTotal.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Pizzería.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pizzería.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pizzería.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pizzería.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizzería().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnTotal;
    private javax.swing.JCheckBox cbCereza;
    private javax.swing.JCheckBox cbJamón;
    private javax.swing.JComboBox<String> cbMasa;
    private javax.swing.JCheckBox cbPepperoni;
    private javax.swing.JCheckBox cbPiña;
    private javax.swing.JCheckBox cbQueso;
    private javax.swing.JCheckBox cbSalami;
    private javax.swing.JCheckBox cbSalchicha;
    private javax.swing.JComboBox<String> cbTamanio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}
