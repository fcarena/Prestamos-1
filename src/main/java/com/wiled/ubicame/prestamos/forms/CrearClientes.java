/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CrearClientes.java
 *
 * Created on May 21, 2011, 12:21:26 PM
 */
package com.wiled.ubicame.prestamos.forms;

import com.wiled.ubicame.prestamos.utils.PrestamoConstants;
import com.wiled.ubicame.prestamos.datalayer.Controller;
import com.wiled.ubicame.prestamos.entidades.Cliente;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import static com.wiled.ubicame.prestamos.utils.PrestamoUtils.containsOnlyNumbers;
import static com.wiled.ubicame.prestamos.utils.PrestamoUtils.isCedulaSizeValid;
import static com.wiled.ubicame.prestamos.utils.PrestamoUtils.isTelefonoSizeValid;

/**
 *
 * @author edgar
 */
public class CrearClientes extends javax.swing.JDialog {
    private Frame frame;
    private Cliente clienteCreado;

    public Cliente getClienteCreado() {
        return clienteCreado;
    }

    public void setClienteCreado(Cliente clienteCreado) {
        this.clienteCreado = clienteCreado;
    }
    
    /** Creates new form CrearClientes */
    public CrearClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.frame = parent;
        
        telefonoTxt.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    onCreate();
                }                
            }            
        });
        
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
        nombreTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellidoTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        crearBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        limpiarCamposBtn = new javax.swing.JButton();
        cedulaTxt = new javax.swing.JTextField();
        telefonoTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Creacion de Clientes");
        setResizable(false);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Cedula:");

        jLabel4.setText("Telefono:");

        crearBtn.setBackground(java.awt.Color.green);
        crearBtn.setText("Crear");
        crearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBtnActionPerformed(evt);
            }
        });

        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        limpiarCamposBtn.setText("Limpiar Campos");
        limpiarCamposBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCamposBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(apellidoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(cedulaTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(telefonoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpiarCamposBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearBtn)
                    .addComponent(cancelarBtn)
                    .addComponent(limpiarCamposBtn))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBtnActionPerformed
       onCreate();
    }//GEN-LAST:event_crearBtnActionPerformed

    
    private void onCreate() {
        if(nombreTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor introduzca un nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
            nombreTxt.grabFocus();
            return;
        }
        
        if(apellidoTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor introduzca un apellido", "ERROR", JOptionPane.ERROR_MESSAGE);
            apellidoTxt.grabFocus();
            return;
        }
        
        if(!cedulaTxt.getText().isEmpty() && (!containsOnlyNumbers(cedulaTxt.getText()) || !isCedulaSizeValid(cedulaTxt.getText()))) {
            JOptionPane.showMessageDialog(rootPane, "Por favor introduzca una cedula valida", "ERROR", JOptionPane.ERROR_MESSAGE);
            cedulaTxt.grabFocus();
            return;            
        }
        
        if(!telefonoTxt.getText().isEmpty() && (!containsOnlyNumbers(telefonoTxt.getText()) || !isTelefonoSizeValid(telefonoTxt.getText()))) {
            JOptionPane.showMessageDialog(rootPane, "Por favor introduzca un telefono valido", "ERROR", JOptionPane.ERROR_MESSAGE);
            telefonoTxt.grabFocus();
            return;            
        }
        
        // TODO add your handling code here:
        Controller controller = Controller.getInstance(PrestamoConstants.PROD_PU);
        String nombre = nombreTxt.getText();
        String apellido = apellidoTxt.getText();
        String cedula = cedulaTxt.getText().toString();
        String telefono = telefonoTxt.getText().toString();
        
        Cliente cliente = controller.crearCliente(nombre, apellido, cedula, telefono);
        if(cliente != null) {
            JOptionPane.showMessageDialog(rootPane, "Cliente creado con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            clienteCreado = cliente;
            
            dispose();            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Cliente no pudo ser creado", "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void limpiarCamposBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCamposBtnActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_limpiarCamposBtnActionPerformed

    private void limpiarCampos() {
        nombreTxt.setText("");
        apellidoTxt.setText("");
        cedulaTxt.setText("");
        telefonoTxt.setText("");
        
        nombreTxt.grabFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JButton crearBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton limpiarCamposBtn;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextField telefonoTxt;
    // End of variables declaration//GEN-END:variables
}
