/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author DanyG
 */
public class Colas extends javax.swing.JFrame {
    Nodo n;
    Cola miCola = new Cola();
    /**
     * Creates new form Colas
     */
    public Colas() {
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

        jLabel3 = new javax.swing.JLabel();
        btnEliminarCola = new javax.swing.JButton();
        lblCola = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        txtDato = new javax.swing.JTextField();
        btnEncolar = new javax.swing.JButton();
        btnDesencolar = new javax.swing.JButton();
        btnFrente = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtArchivo = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 154, 206));
        jLabel3.setText("Cola");

        btnEliminarCola.setBackground(new java.awt.Color(102, 154, 206));
        btnEliminarCola.setFont(new java.awt.Font("Modern No. 20", 0, 12)); // NOI18N
        btnEliminarCola.setText("Eliminar cola");
        btnEliminarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarColaActionPerformed(evt);
            }
        });

        lblCola.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblCola.setText("-");

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 154, 206));
        jLabel1.setText("Dato");

        btnRegresar.setBackground(new java.awt.Color(102, 154, 206));
        btnRegresar.setFont(new java.awt.Font("Modern No. 20", 0, 12)); // NOI18N
        btnRegresar.setText("Atras");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtDato.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        txtDato.setForeground(new java.awt.Color(102, 154, 206));

        btnEncolar.setBackground(new java.awt.Color(102, 154, 206));
        btnEncolar.setFont(new java.awt.Font("Modern No. 20", 0, 12)); // NOI18N
        btnEncolar.setText("Encolar");
        btnEncolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncolarActionPerformed(evt);
            }
        });

        btnDesencolar.setBackground(new java.awt.Color(102, 154, 206));
        btnDesencolar.setFont(new java.awt.Font("Modern No. 20", 0, 12)); // NOI18N
        btnDesencolar.setText("Desencolar");
        btnDesencolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencolarActionPerformed(evt);
            }
        });

        btnFrente.setBackground(new java.awt.Color(102, 154, 206));
        btnFrente.setFont(new java.awt.Font("Modern No. 20", 0, 12)); // NOI18N
        btnFrente.setText("Frente");
        btnFrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrenteActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(102, 154, 206));
        btnGuardar.setFont(new java.awt.Font("Modern No. 20", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 154, 206));
        jLabel2.setText("Nombre del archivo");

        txtArchivo.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        txtArchivo.setForeground(new java.awt.Color(102, 154, 206));

        btnCargar.setBackground(new java.awt.Color(102, 154, 206));
        btnCargar.setFont(new java.awt.Font("Modern No. 20", 0, 12)); // NOI18N
        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
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
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCargar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarCola))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDesencolar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFrente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEncolar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblCola))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncolar)
                    .addComponent(lblCola))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDesencolar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFrente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargar)
                    .addComponent(btnEliminarCola))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarColaActionPerformed
        miCola.setHead(null);
        miCola.setTail(null);
        lblCola.setText(miCola.ToString());
    }//GEN-LAST:event_btnEliminarColaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEncolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncolarActionPerformed
        try{
            n = new Nodo();
            n.setDato(Integer.parseInt(txtDato.getText()));
            miCola.Encolar(n);
            lblCola.setText(miCola.ToString());
            txtDato.setText("");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Introduzca un dato valido");
            txtDato.setText("");
        }
    }//GEN-LAST:event_btnEncolarActionPerformed

    private void btnDesencolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencolarActionPerformed
        miCola.Desencolar();
        lblCola.setText(miCola.ToString());
    }//GEN-LAST:event_btnDesencolarActionPerformed

    private void btnFrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrenteActionPerformed
        JOptionPane.showMessageDialog(null, "Elemento al frente de la cola : " + miCola.Frente());
    }//GEN-LAST:event_btnFrenteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
            String textocola = lblCola.getText();
            String nombreDelArchivo = "";
            if(nombreDelArchivo.isEmpty()){
                nombreDelArchivo = "Cola";
            }else{
                nombreDelArchivo = txtArchivo.getText();
            }
            Writer.Escribir(textocola, nombreDelArchivo);
            JOptionPane.showMessageDialog(null, "Datos guardados");
            txtArchivo.setText("");

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        final JFileChooser fc = new JFileChooser();
        int response = fc.showOpenDialog(this);
        if( response == fc.APPROVE_OPTION){
            String path = fc.getSelectedFile().toString();
            File file = new File(path);
            Scanner scan;
            try {
                scan = new Scanner(file);
                String contenido = scan.nextLine();
                String[] colaArreglo;
                colaArreglo = contenido.split(",");
                int contador = 0;
                miCola.setHead(null);
                miCola.setTail(null);
                for(String string : colaArreglo){
                    n = new Nodo();
                    n.setDato(Integer.parseInt(colaArreglo[contador]));
                    miCola.Encolar(n);
                    contador++;
                }
                lblCola.setText(miCola.ToString());

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Colas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnCargarActionPerformed

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
            java.util.logging.Logger.getLogger(Colas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Colas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Colas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Colas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnDesencolar;
    private javax.swing.JButton btnEliminarCola;
    private javax.swing.JButton btnEncolar;
    private javax.swing.JButton btnFrente;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCola;
    private javax.swing.JTextField txtArchivo;
    private javax.swing.JTextField txtDato;
    // End of variables declaration//GEN-END:variables
}
