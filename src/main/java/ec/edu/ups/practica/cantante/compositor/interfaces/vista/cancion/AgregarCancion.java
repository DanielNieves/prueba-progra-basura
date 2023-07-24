/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica.cantante.compositor.interfaces.vista.cancion;

import ec.edu.ups.practica.cantante.compositor.interfaces.controlador.ControladorCompositor;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Cancion;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Compositor;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Usuario
 */
public class AgregarCancion extends javax.swing.JInternalFrame {
    private ControladorCompositor controladorCompositor;
    private ResourceBundle mensajes;

    /**
     * Creates new form AgregarCancion
     */
    public AgregarCancion(ControladorCompositor controladorCompositor) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
    }

    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblCodigoAgregarCancion.setText(mensajes.getString("ventana.codigo"));
        jblTituloAgregarCancion.setText(mensajes.getString("ventanaCancion.titulo"));
        jblLetraAgregarCancion.setText(mensajes.getString("ventanaCancion.letra"));
        jblDuracionCancionAgregarCancion.setText(mensajes.getString("ventanaCancion.duracioncancion"));
        jblIdAgregarCancion.setText(mensajes.getString("ventana.id"));
        jblNombreAgregarCancion.setText(mensajes.getString("ventana.nombre"));
        jblApellidoAgregarCancion.setText(mensajes.getString("ventana.apellido"));
        jblEdadAgregarCancion.setText(mensajes.getString("ventana.edad"));
        jblNacionalidadAgregarCancion.setText(mensajes.getString("ventana.nacionalidad"));
        jblSalarioAgregarCancion.setText(mensajes.getString("ventana.salario"));
        jblNumeroComposicionesAgregarCancion.setText(mensajes.getString("ventanaCompositor.numerocomposiciones"));
        btnAceptar.setText(mensajes.getString("boton.buscar"));
        btnAgregar.setText(mensajes.getString("boton.agregar"));
        btnCancelarAgregar.setText(mensajes.getString("boton.cancelar"));
        Border borde = BorderFactory.createTitledBorder(mensajes.getString("panel.agregarcancion"));
        jpanelA.setBorder(borde);
        Border bordea = BorderFactory.createTitledBorder(mensajes.getString("panel.buscarcompositor"));
        jpanelB.setBorder(bordea);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelA = new javax.swing.JPanel();
        jblCodigoAgregarCancion = new javax.swing.JLabel();
        jblTituloAgregarCancion = new javax.swing.JLabel();
        jblLetraAgregarCancion = new javax.swing.JLabel();
        jblDuracionCancionAgregarCancion = new javax.swing.JLabel();
        txtCodigoCancion = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtLetra = new javax.swing.JTextField();
        txtDuracionCancion = new javax.swing.JTextField();
        jpanelB = new javax.swing.JPanel();
        jblIdAgregarCancion = new javax.swing.JLabel();
        jblNombreAgregarCancion = new javax.swing.JLabel();
        jblApellidoAgregarCancion = new javax.swing.JLabel();
        jblEdadAgregarCancion = new javax.swing.JLabel();
        jblNacionalidadAgregarCancion = new javax.swing.JLabel();
        jblSalarioAgregarCancion = new javax.swing.JLabel();
        jblNumeroComposicionesAgregarCancion = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtNumeroComposiciones = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelarAgregar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jpanelA.setBackground(new java.awt.Color(102, 204, 0));
        jpanelA.setBorder(javax.swing.BorderFactory.createTitledBorder("AGREGAR CANCION"));

        jblCodigoAgregarCancion.setText("Codigo:");

        jblTituloAgregarCancion.setText("Titulo:");

        jblLetraAgregarCancion.setText("Letra:");

        jblDuracionCancionAgregarCancion.setText("Duración de la Canción: ");

        txtCodigoCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCancionActionPerformed(evt);
            }
        });

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        txtLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLetraActionPerformed(evt);
            }
        });

        txtDuracionCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracionCancionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelALayout = new javax.swing.GroupLayout(jpanelA);
        jpanelA.setLayout(jpanelALayout);
        jpanelALayout.setHorizontalGroup(
            jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelALayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpanelALayout.createSequentialGroup()
                        .addComponent(jblTituloAgregarCancion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelALayout.createSequentialGroup()
                        .addComponent(jblCodigoAgregarCancion)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblDuracionCancionAgregarCancion)
                    .addComponent(jblLetraAgregarCancion))
                .addGap(18, 18, 18)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDuracionCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 113, Short.MAX_VALUE))
        );
        jpanelALayout.setVerticalGroup(
            jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelALayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblCodigoAgregarCancion)
                    .addComponent(txtCodigoCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblLetraAgregarCancion)
                    .addComponent(txtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblTituloAgregarCancion)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblDuracionCancionAgregarCancion)
                    .addComponent(txtDuracionCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jpanelB.setBackground(new java.awt.Color(102, 204, 0));
        jpanelB.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR COMPOSITOR"));

        jblIdAgregarCancion.setText("ID:");

        jblNombreAgregarCancion.setText("Nombre:");

        jblApellidoAgregarCancion.setText("Apellido:");

        jblEdadAgregarCancion.setText("Edad:");

        jblNacionalidadAgregarCancion.setText("Nacionalidad:");

        jblSalarioAgregarCancion.setText("Salario:");

        jblNumeroComposicionesAgregarCancion.setText("Numero de Composiciones:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNombre.setEditable(false);
        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.setEditable(false);
        txtApellido.setEnabled(false);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtEdad.setEditable(false);
        txtEdad.setEnabled(false);
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        txtNacionalidad.setEditable(false);
        txtNacionalidad.setEnabled(false);
        txtNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadActionPerformed(evt);
            }
        });

        txtSalario.setEditable(false);
        txtSalario.setEnabled(false);
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        txtNumeroComposiciones.setEditable(false);
        txtNumeroComposiciones.setEnabled(false);
        txtNumeroComposiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroComposicionesActionPerformed(evt);
            }
        });

        btnAceptar.setText("Buscar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelarAgregar.setText("Cancelar");
        btnCancelarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAgregarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelBLayout = new javax.swing.GroupLayout(jpanelB);
        jpanelB.setLayout(jpanelBLayout);
        jpanelBLayout.setHorizontalGroup(
            jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelBLayout.createSequentialGroup()
                        .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblIdAgregarCancion)
                            .addComponent(jblNombreAgregarCancion)
                            .addComponent(jblApellidoAgregarCancion)
                            .addComponent(jblEdadAgregarCancion)
                            .addComponent(jblNacionalidadAgregarCancion)
                            .addComponent(jblSalarioAgregarCancion))
                        .addGap(79, 79, 79)
                        .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanelBLayout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnAceptar))))
                    .addGroup(jpanelBLayout.createSequentialGroup()
                        .addComponent(jblNumeroComposicionesAgregarCancion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(48, 48, 48)
                .addComponent(btnCancelarAgregar)
                .addGap(119, 119, 119))
        );
        jpanelBLayout.setVerticalGroup(
            jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblIdAgregarCancion)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar))
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelBLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNombreAgregarCancion)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblApellidoAgregarCancion)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblEdadAgregarCancion)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNacionalidadAgregarCancion)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblSalarioAgregarCancion)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNumeroComposicionesAgregarCancion)
                            .addComponent(txtNumeroComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelBLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnCancelarAgregar))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpanelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpanelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCancionActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLetraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLetraActionPerformed

    private void txtDuracionCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracionCancionActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void txtNumeroComposicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroComposicionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroComposicionesActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.noestalleno")); 
        }else{
            Compositor compositorTempo = controladorCompositor.buscarCompositor(Integer.parseInt(txtId.getText()));
            if (compositorTempo !=null) {
                txtNombre.setText(compositorTempo.getNombre());
                txtApellido.setText(compositorTempo.getApellido());
                txtEdad.setText( String.valueOf(compositorTempo.getEdad()));
                txtNacionalidad.setText(compositorTempo.getNacionalidad());
                txtNacionalidad.setText(compositorTempo.getNacionalidad());
                txtSalario.setText(String.valueOf(compositorTempo.calcularSalario()));
                txtNumeroComposiciones.setText(String.valueOf(compositorTempo.getNumeroDeComposiciones()));

            }else{
                this.limpiarCampos();
                JOptionPane.showMessageDialog(this, mensajes.getString("joption.noexiste")); 

            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(this.validacionDeCampos()){
            int codigo = Integer.parseInt(txtCodigoCancion.getText());
            if (controladorCompositor.buscarCancion(controladorCompositor.buscarCompositor(Integer.parseInt(txtId.getText())),codigo)==null) {
                String titulo = txtTitulo.getText();
                String letra = txtLetra.getText();
                double tiempo = Double.parseDouble(txtDuracionCancion.getText());
        
                Cancion cancion = new Cancion(codigo, titulo, letra, tiempo);
                controladorCompositor.agregarCancion(cancion, controladorCompositor.buscarCompositor(Integer.parseInt(txtId.getText())));
                System.out.println(controladorCompositor.verCompositores());
                JOptionPane.showMessageDialog(this, mensajes.getString("joption.seagrego"));
                this.limpiarCampos();
                this.limpiarCamposCancion();
            }else{
                JOptionPane.showMessageDialog(this, mensajes.getString("joption.lacancionyaexsite")); 
            }
                
        }else{
            JOptionPane.showMessageDialog(this, mensajes.getString("joption.nosehanllenado")); 
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAgregarActionPerformed
        this.limpiarCampos();
        this.limpiarCamposCancion();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarAgregarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.limpiarCampos();
        this.limpiarCamposCancion();
    }//GEN-LAST:event_formInternalFrameClosing

    private void limpiarCampos(){
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtNacionalidad.setText("");
        txtSalario.setText("");
        txtNumeroComposiciones.setText("");
    }
    
    private void limpiarCamposCancion(){
        txtCodigoCancion.setText("");
        txtDuracionCancion.setText("");
        txtLetra.setText("");
        txtTitulo.setText("");
    }
    
    private boolean validacionDeCampos(){
        if (txtCodigoCancion.getText().isEmpty()||txtDuracionCancion.getText().isEmpty()||txtLetra.getText().isEmpty()||txtTitulo.getText().isEmpty()||txtNacionalidad.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelarAgregar;
    private javax.swing.JLabel jblApellidoAgregarCancion;
    private javax.swing.JLabel jblCodigoAgregarCancion;
    private javax.swing.JLabel jblDuracionCancionAgregarCancion;
    private javax.swing.JLabel jblEdadAgregarCancion;
    private javax.swing.JLabel jblIdAgregarCancion;
    private javax.swing.JLabel jblLetraAgregarCancion;
    private javax.swing.JLabel jblNacionalidadAgregarCancion;
    private javax.swing.JLabel jblNombreAgregarCancion;
    private javax.swing.JLabel jblNumeroComposicionesAgregarCancion;
    private javax.swing.JLabel jblSalarioAgregarCancion;
    private javax.swing.JLabel jblTituloAgregarCancion;
    private javax.swing.JPanel jpanelA;
    private javax.swing.JPanel jpanelB;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigoCancion;
    private javax.swing.JTextField txtDuracionCancion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLetra;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroComposiciones;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
