/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inscripcion.pvoe;
import inicio.pvoe.inicio;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import talleres.pvoe.talleres;
/**
 *
 * @author emilionava
 */
public class inscripcion extends javax.swing.JFrame {

    /**
     * Creates new form inscripcion
     */
    public inscripcion() {
        initComponents();
        setTitle("Casa de la Cultura - UAM Azcapotzalco :: Inscripción ");
        setSize(800, 500);
        setLocationRelativeTo(null);
        // Añadir listeners para controlar la selección de géneros
        RBMasculino.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (RBMasculino.isSelected()) {
                    RBFemenino.setEnabled(false);  // Deshabilitar "Femenino"
                    RBNoEspecificado.setEnabled(false);  // Deshabilitar "No especificado"
                } else {
                    RBFemenino.setEnabled(true);  // Habilitar "Femenino"
                    RBNoEspecificado.setEnabled(true);  // Habilitar "No especificado"
                }
            }
        });

        RBFemenino.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (RBFemenino.isSelected()) {
                    RBMasculino.setEnabled(false);  // Deshabilitar "Masculino"
                    RBNoEspecificado.setEnabled(false);  // Deshabilitar "No especificado"
                } else {
                    RBMasculino.setEnabled(true);  // Habilitar "Masculino"
                    RBNoEspecificado.setEnabled(true);  // Habilitar "No especificado"
                }
            }
        });

        RBNoEspecificado.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (RBNoEspecificado.isSelected()) {
                    RBFemenino.setEnabled(false);  // Deshabilitar "Femenino"
                    RBMasculino.setEnabled(false);  // Deshabilitar "Masculino"
                } else {
                    RBFemenino.setEnabled(true);  // Habilitar "Femenino"
                    RBMasculino.setEnabled(true);  // Habilitar "Masculino"
                }
            }
        });
    }
    private void guardarRegistro() {
        // Obtener los datos del formulario
        String nombre = TxtFieldNombre.getText();
        String primerApellido = TxtFieldPriApellido.getText();
        String segundoApellido = TxtFieldSegApellido.getText();
        String edad = TxtFieldEdad.getText();
        String genero = RBFemenino.isSelected() ? "Femenino" : (RBMasculino.isSelected() ? "Masculino" : "No especificado");
        String direccion = TxtAreaDireccion.getText();
        String telefonoEmergencia = TxtFieldTelEmergencia.getText();
        String telefonoContacto = TxtFieldTelContacto.getText();

        // Formatear el contenido para el archivo
        String contenido = "Nombre: " + nombre + "\n" +
                           "Primer Apellido: " + primerApellido + "\n" +
                           "Segundo Apellido: " + segundoApellido + "\n" +
                           "Edad: " + edad + "\n" +
                           "Género: " + genero + "\n" +
                           "Dirección: " + direccion + "\n" +
                           "Teléfono de emergencia: " + telefonoEmergencia + "\n" +
                           "Teléfono de contacto: " + telefonoContacto + "\n\n";

        // Guardar la información en un archivo .txt
        try {
            FileWriter fw = new FileWriter("registrosUsuarios.txt", true); // 'true' para agregar al archivo si ya existe
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
            JOptionPane.showMessageDialog(this, "Registro guardado correctamente.");
            limpiarFormulario();
            // Crear e iniciar el nuevo frame (talleres)
        talleres talleresFrame = new talleres();
        talleresFrame.setVisible(true); // Mostrar la ventana de talleres
        this.dispose(); // Cerrar el JFrame actual (FormularioRegistro)
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar el registro.");
        }
    }
    private void limpiarFormulario() {
        // Limpiar los campos de texto
        TxtFieldNombre.setText("");
        TxtFieldPriApellido.setText("");
        TxtFieldSegApellido.setText("");
        TxtFieldEdad.setText("");
        TxtAreaDireccion.setText("");
        TxtFieldTelEmergencia.setText("");
        TxtFieldTelContacto.setText("");

        // Limpiar los botones de radio
        RBFemenino.setSelected(false);
        RBMasculino.setSelected(false);
        RBNoEspecificado.setSelected(false);

        // Habilitar los botones de radio después de limpiar
        RBFemenino.setEnabled(true);
        RBMasculino.setEnabled(true);
        RBNoEspecificado.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGroupGenero = new javax.swing.ButtonGroup();
        PanelPrincipalInscripcion = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BtnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtFieldPriApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtFieldSegApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtFieldEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        RBFemenino = new javax.swing.JRadioButton();
        RBMasculino = new javax.swing.JRadioButton();
        RBNoEspecificado = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaDireccion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        TxtFieldTelContacto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtFieldTelEmergencia = new javax.swing.JTextField();
        BtnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipalInscripcion.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipalInscripcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Nuevo registro");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Primer Apellido:");

        TxtFieldPriApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFieldPriApellidoActionPerformed(evt);
            }
        });

        jLabel4.setText("Segundo Apellido:");

        jLabel5.setText("Edad:");

        TxtFieldEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFieldEdadActionPerformed(evt);
            }
        });

        jLabel6.setText("Genero:");

        RBFemenino.setText("Femenino");
        RBFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBFemeninoActionPerformed(evt);
            }
        });

        RBMasculino.setText("Masculino");
        RBMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBMasculinoActionPerformed(evt);
            }
        });

        RBNoEspecificado.setText("No especificado");

        jLabel7.setText("Dirección:");

        TxtAreaDireccion.setColumns(20);
        TxtAreaDireccion.setRows(5);
        jScrollPane1.setViewportView(TxtAreaDireccion);

        jLabel8.setText("Teléfono de contacto:");

        TxtFieldTelContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFieldTelContactoActionPerformed(evt);
            }
        });

        jLabel9.setText("Teléfono en caso de emergencia");

        BtnEnviar.setText("Enviar");
        BtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(RBFemenino)
                                        .addGap(18, 18, 18)
                                        .addComponent(RBMasculino))
                                    .addComponent(TxtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtFieldSegApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RBNoEspecificado)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtFieldPriApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtFieldTelContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel9)
                                        .addGap(0, 97, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(TxtFieldTelEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEnviar)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(239, 239, 239))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TxtFieldPriApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtFieldSegApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TxtFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RBFemenino)
                    .addComponent(RBMasculino)
                    .addComponent(RBNoEspecificado))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtFieldTelContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(12, 12, 12)
                        .addComponent(TxtFieldTelEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegresar)
                    .addComponent(BtnEnviar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        PanelPrincipalInscripcion.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 760, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipalInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipalInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnviarActionPerformed
        // Primero, guarda el registro antes de proceder con la navegación a talleres
    guardarRegistro();
    
    // Crear e iniciar el nuevo frame (talleres)
    talleres talleresFrame = new talleres();
    talleresFrame.setVisible(true); // Mostrar la ventana de talleres
    this.dispose(); // Cerrar el JFrame actual (FormularioRegistro)
    }//GEN-LAST:event_BtnEnviarActionPerformed

    private void TxtFieldTelContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFieldTelContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFieldTelContactoActionPerformed

    private void RBMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBMasculinoActionPerformed

    private void RBFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBFemeninoActionPerformed

    private void TxtFieldPriApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFieldPriApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFieldPriApellidoActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        // TODO add your handling code here:
        inicio inicioFrame = new inicio();
        inicioFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void TxtFieldEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFieldEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFieldEdadActionPerformed

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
            java.util.logging.Logger.getLogger(inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGroupGenero;
    private javax.swing.JButton BtnEnviar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JPanel PanelPrincipalInscripcion;
    private javax.swing.JRadioButton RBFemenino;
    private javax.swing.JRadioButton RBMasculino;
    private javax.swing.JRadioButton RBNoEspecificado;
    private javax.swing.JTextArea TxtAreaDireccion;
    private javax.swing.JTextField TxtFieldEdad;
    private javax.swing.JTextField TxtFieldNombre;
    private javax.swing.JTextField TxtFieldPriApellido;
    private javax.swing.JTextField TxtFieldSegApellido;
    private javax.swing.JTextField TxtFieldTelContacto;
    private javax.swing.JTextField TxtFieldTelEmergencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
