/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DanyG
 */
public class ListaSimpleCircular extends javax.swing.JFrame {

    Nodo n;
    LSC miLista = new LSC();
    /**
     * Creates new form ListaSimpleCircular
     */
    public ListaSimpleCircular() {
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

        btnEliminar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnContar = new javax.swing.JButton();
        lblThis = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblDato = new javax.swing.JLabel();
        txtArchivo = new javax.swing.JTextField();
        txtDato = new javax.swing.JTextField();
        txtBorrar = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        lblLista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEliminar.setBackground(new java.awt.Color(126, 64, 19));
        btnEliminar.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar lista");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(126, 64, 19));
        btnBorrar.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(126, 64, 19));
        btnRegresar.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        btnRegresar.setText("Atras");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(126, 64, 19));
        btnAgregar.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(126, 64, 19));
        jLabel5.setText("Nombre del archivo");

        btnContar.setBackground(new java.awt.Color(126, 64, 19));
        btnContar.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        btnContar.setText("Contar");
        btnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarActionPerformed(evt);
            }
        });

        lblThis.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        lblThis.setForeground(new java.awt.Color(126, 64, 19));
        lblThis.setText("Dato a borrar");

        btnGuardar.setBackground(new java.awt.Color(126, 64, 19));
        btnGuardar.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(126, 64, 19));
        jLabel4.setText("Dato a buscar");

        lblDato.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        lblDato.setForeground(new java.awt.Color(126, 64, 19));
        lblDato.setText("Dato");

        txtArchivo.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        txtArchivo.setForeground(new java.awt.Color(126, 64, 19));

        txtDato.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        txtDato.setForeground(new java.awt.Color(126, 64, 19));

        txtBorrar.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        txtBorrar.setForeground(new java.awt.Color(126, 64, 19));

        lblTitulo.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(126, 64, 19));
        lblTitulo.setText("Lista Simple Circular");

        btnCargar.setBackground(new java.awt.Color(126, 64, 19));
        btnCargar.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(126, 64, 19));
        btnBuscar.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(126, 64, 19));

        lblLista.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblLista.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(219, Short.MAX_VALUE)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblThis))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLista)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblDato)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnAgregar))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnGuardar)
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(3, 3, 3)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                                        .addComponent(txtBuscar))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnContar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btnCargar)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDato)
                    .addComponent(btnAgregar))
                .addGap(16, 16, 16)
                .addComponent(lblLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblThis)
                            .addComponent(txtBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)))
                .addGap(6, 6, 6)
                .addComponent(btnContar)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        miLista.setHead(null);
        lblLista.setText(miLista.ToString());
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int dato =  Integer.parseInt(txtBorrar.getText());
        if(!miLista.Buscar(dato)){
            JOptionPane.showMessageDialog(null, "No se encontro el dato");
            txtBorrar.setText("");
            return;
        }
        miLista.Borrar(dato);
        lblLista.setText(miLista.ToString());
        txtBorrar.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try{
            Boolean resultado = miLista.Buscar(Integer.parseInt(txtDato.getText()));
            if(!resultado){
                n = new Nodo();
                n.setDato(Integer.parseInt(txtDato.getText()));
                miLista.Agregar(n);
                lblLista.setText(miLista.ToString());
                txtDato.setText("");
                return;
            }
            JOptionPane.showMessageDialog(null, "El dato ya existe dentro de la lista");
            txtDato.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Introduzca un dato valido");
            txtDato.setText("");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarActionPerformed
        JOptionPane.showMessageDialog(null, "Numero de elementos en la lista : " + miLista.ContarNodos());
    }//GEN-LAST:event_btnContarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
            String textolista = lblLista.getText();
            String nombreDelArchivo = "";
            if(nombreDelArchivo.isEmpty()){
                nombreDelArchivo = "ListaCircular";
            }else{
                nombreDelArchivo = txtArchivo.getText();
            }
            Writer.Escribir(textolista, nombreDelArchivo);
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
                String[] listaArreglo;
                listaArreglo = contenido.split(",");
                int contador = 0;
                miLista.setHead(null);
                for(String string : listaArreglo){
                    n = new Nodo();
                    n.setDato(Integer.parseInt(listaArreglo[contador]));
                    miLista.Agregar(n);
                    contador++;
                }
                lblLista.setText(miLista.ToString());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ListaSimpleCircular.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            int dato = Integer.parseInt(txtBuscar.getText());
            if(!miLista.Buscar(dato)){
                JOptionPane.showMessageDialog(null, "El dato no se encuentra en la lista");
            }else{
                JOptionPane.showMessageDialog(null, "El dato se encuentra en la lista");
            }
            txtBuscar.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Introduzca un dato valido");
            txtBuscar.setText("");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ListaSimpleCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaSimpleCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaSimpleCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaSimpleCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaSimpleCircular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnContar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblDato;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblThis;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtArchivo;
    private javax.swing.JTextField txtBorrar;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDato;
    // End of variables declaration//GEN-END:variables
}
