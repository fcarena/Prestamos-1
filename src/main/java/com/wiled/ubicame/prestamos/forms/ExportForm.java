/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ExportForm.java
 *
 * Created on Jun 8, 2011, 10:11:15 AM
 */
package com.wiled.ubicame.prestamos.forms;

import com.wiled.ubicame.prestamos.utils.PrestamoUtils;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar Garcia
 */
public class ExportForm extends javax.swing.JDialog {

    /** Creates new form ExportForm */
    public ExportForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        File[] roots = File.listRoots();
        for(int i=0;i<roots.length;i++) {
            drivesCBox.insertItemAt(roots[i], i);
        }
        
        drivesCBox.setSelectedIndex(0);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        drivesCBox = new javax.swing.JComboBox();
        exportBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EXPORTAR DATOS");
        setResizable(false);

        jLabel1.setText("Destino:");

        exportBtn.setText("Exportar Datos");
        exportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drivesCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(drivesCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportBtnActionPerformed
        //Validar password
        String drive = drivesCBox.getSelectedItem().toString().replace('\'', '/');
        
        try {
            PrestamoUtils.exportDataBase(drive);
            JOptionPane.showMessageDialog(rootPane, "Archivo generado exitosamente", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            
            dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "ERROR GENERACION DE BACKUP", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "ERROR GENERACION DE BACKUP", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "ERROR GENERACION DE BACKUP", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_exportBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox drivesCBox;
    private javax.swing.JButton exportBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
