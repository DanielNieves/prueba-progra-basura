/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica.cantante.compositor.interfaces.vista.compositor;

import ec.edu.ups.practica.cantante.compositor.interfaces.controlador.ControladorCompositor;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Cancion;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Cantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Compositor;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Disco;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Usuario
 */
public class BuscarCompositor extends javax.swing.JInternalFrame {
    private ControladorCompositor controladorCompositor;
    private ResourceBundle mensajes;
    private Compositor compositor;

    /**
     * Creates new form BuscarCompositor
     */
    public BuscarCompositor(ControladorCompositor controladorCompositor) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
    }

    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblIdBuscarCompositor.setText(mensajes.getString("ventana.id"));
        jblNombreBuscarCompositor.setText(mensajes.getString("ventana.nombre"));
        jblApellidoBuscarCompositor.setText(mensajes.getString("ventana.apellido"));
        jblEdadBuscarCompositor.setText(mensajes.getString("ventana.edad"));
        jblSalarioBuscarCompositor.setText(mensajes.getString("ventana.salario"));
        jblNacionalidadBuscarCompositor.setText(mensajes.getString("ventana.nacionalidad"));
        jblNumeroComposiconesBuscarCompositor.setText(mensajes.getString("ventanaCompositor.numerocomposiciones"));
        btnAceptar.setText(mensajes.getString("boton.buscar"));
        btnCancelar.setText(mensajes.getString("boton.cancelar"));
        Border borde = BorderFactory.createTitledBorder(mensajes.getString("panel.buscarcompositor"));
        jpanelA.setBorder(borde);
        TableColumnModel columnModel = tblCancion.getColumnModel();
        TableColumn columnaCodigo = columnModel.getColumn(0);
        columnaCodigo.setHeaderValue(mensajes.getString("ventana.codigo"));
        TableColumn columnaLetra = columnModel.getColumn(1);
        columnaLetra.setHeaderValue(mensajes.getString("ventanaCancion.letra"));
        TableColumn columnaTitulo = columnModel.getColumn(2);
        columnaTitulo.setHeaderValue(mensajes.getString("ventanaCancion.titulo"));
        TableColumn columnaDuracion = columnModel.getColumn(3);
        columnaDuracion.setHeaderValue(mensajes.getString("ventanaCancion.duracioncancion"));
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
        jblIdBuscarCompositor = new javax.swing.JLabel();
        jblNombreBuscarCompositor = new javax.swing.JLabel();
        jblApellidoBuscarCompositor = new javax.swing.JLabel();
        jblEdadBuscarCompositor = new javax.swing.JLabel();
        jblNacionalidadBuscarCompositor = new javax.swing.JLabel();
        jblSalarioBuscarCompositor = new javax.swing.JLabel();
        jblNumeroComposiconesBuscarCompositor = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtNumeroComposiciones = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCancion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jpanelA.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR COMPOSITOR"));
        jpanelA.setLayout(null);

        jblIdBuscarCompositor.setForeground(new java.awt.Color(255, 255, 255));
        jblIdBuscarCompositor.setText("ID:");
        jpanelA.add(jblIdBuscarCompositor);
        jblIdBuscarCompositor.setBounds(60, 38, 60, 16);

        jblNombreBuscarCompositor.setForeground(new java.awt.Color(255, 255, 255));
        jblNombreBuscarCompositor.setText("Nombre:");
        jpanelA.add(jblNombreBuscarCompositor);
        jblNombreBuscarCompositor.setBounds(60, 66, 47, 16);

        jblApellidoBuscarCompositor.setForeground(new java.awt.Color(255, 255, 255));
        jblApellidoBuscarCompositor.setText("Apellido:");
        jpanelA.add(jblApellidoBuscarCompositor);
        jblApellidoBuscarCompositor.setBounds(60, 100, 70, 16);

        jblEdadBuscarCompositor.setForeground(new java.awt.Color(255, 255, 255));
        jblEdadBuscarCompositor.setText("Edad:");
        jpanelA.add(jblEdadBuscarCompositor);
        jblEdadBuscarCompositor.setBounds(60, 134, 29, 16);

        jblNacionalidadBuscarCompositor.setForeground(new java.awt.Color(255, 255, 255));
        jblNacionalidadBuscarCompositor.setText("Nacionalidad:");
        jpanelA.add(jblNacionalidadBuscarCompositor);
        jblNacionalidadBuscarCompositor.setBounds(60, 168, 90, 16);

        jblSalarioBuscarCompositor.setForeground(new java.awt.Color(255, 255, 255));
        jblSalarioBuscarCompositor.setText("Salario:");
        jpanelA.add(jblSalarioBuscarCompositor);
        jblSalarioBuscarCompositor.setBounds(60, 208, 60, 16);

        jblNumeroComposiconesBuscarCompositor.setForeground(new java.awt.Color(255, 255, 255));
        jblNumeroComposiconesBuscarCompositor.setText("Numero de Composiciones:");
        jpanelA.add(jblNumeroComposiconesBuscarCompositor);
        jblNumeroComposiconesBuscarCompositor.setBounds(60, 242, 148, 16);

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jpanelA.add(txtId);
        txtId.setBounds(212, 35, 131, 22);

        txtNombre.setEditable(false);
        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jpanelA.add(txtNombre);
        txtNombre.setBounds(212, 63, 131, 22);

        txtApellido.setEditable(false);
        txtApellido.setEnabled(false);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jpanelA.add(txtApellido);
        txtApellido.setBounds(212, 97, 131, 22);

        txtEdad.setEditable(false);
        txtEdad.setEnabled(false);
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        jpanelA.add(txtEdad);
        txtEdad.setBounds(212, 131, 131, 22);

        txtNacionalidad.setEditable(false);
        txtNacionalidad.setEnabled(false);
        txtNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadActionPerformed(evt);
            }
        });
        jpanelA.add(txtNacionalidad);
        txtNacionalidad.setBounds(212, 165, 131, 22);

        txtSalario.setEditable(false);
        txtSalario.setEnabled(false);
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });
        jpanelA.add(txtSalario);
        txtSalario.setBounds(212, 205, 131, 22);

        txtNumeroComposiciones.setEditable(false);
        txtNumeroComposiciones.setEnabled(false);
        txtNumeroComposiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroComposicionesActionPerformed(evt);
            }
        });
        jpanelA.add(txtNumeroComposiciones);
        txtNumeroComposiciones.setBounds(214, 239, 131, 22);

        btnAceptar.setText("Buscar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jpanelA.add(btnAceptar);
        btnAceptar.setBounds(162, 342, 72, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jpanelA.add(btnCancelar);
        btnCancelar.setBounds(269, 342, 76, 23);

        tblCancion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Letra", "Título", "Duración de Canción"
            }
        ));
        jScrollPane1.setViewportView(tblCancion);

        jpanelA.add(jScrollPane1);
        jScrollPane1.setBounds(410, 30, 430, 320);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/si.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jpanelA.add(jLabel1);
        jLabel1.setBounds(10, 16, 860, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelA, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelA, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            compositor = controladorCompositor.buscarCompositor(Integer.parseInt(txtId.getText()));
            if (compositor !=null) {
                txtNombre.setText(compositor.getNombre());
                System.out.println("------------------------------------");
                System.out.println(compositor.getCancionesTop100Billboard());
                txtApellido.setText(compositor.getApellido());
                txtEdad.setText( String.valueOf(compositor.getEdad()));
                txtNacionalidad.setText(compositor.getNacionalidad());
                txtNacionalidad.setText(compositor.getNacionalidad());
                txtSalario.setText(String.valueOf(compositor.calcularSalario()));
                txtNumeroComposiciones.setText(String.valueOf(compositor.getNumeroDeComposiciones()));
                this.actualizarTabla(compositor.getCancionesTop100Billboard());
                //this.actualizarTablaClientes(compositor.getCliente());
                System.out.println(controladorCompositor.verCompositores());
            }else{
                this.limpiarCampos();
                JOptionPane.showMessageDialog(this, mensajes.getString("joption.noexiste")); 

            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtId.setText("");
        this.limpiarCampos();
        this.setVisible(false);
        DefaultTableModel modelo = (DefaultTableModel)this.tblCancion.getModel();
        modelo.setNumRows(0);
        this.tblCancion.setModel(modelo);
    }//GEN-LAST:event_btnCancelarActionPerformed
    private void actualizarTabla(List<Cancion> listaCan ){
        DefaultTableModel modelo = (DefaultTableModel)this.tblCancion.getModel();
        modelo.setNumRows(0);
       
        //if (listaPersonas!=null) {
            for (Cancion listaCa : listaCan) {
                int cod = listaCa.getCodigo();
                if(cod!=0){
                    String nom = listaCa.getTitulo();
                    String letra= listaCa.getLetra();
                    double duracion = listaCa.getTiempoEnMinutos();
                    Object[] rowDate = {cod,nom,letra,duracion};
                    modelo.addRow(rowDate);
                }
                
            }
            this.tblCancion.setModel(modelo);
        //}else{
          //  JOptionPane.showMessageDialog(this, "No se ha ingresado ningun cantante aun");
        //}
    }
    
    
    
    
    private void limpiarCampos(){
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtNacionalidad.setText("");
        txtSalario.setText("");
        txtNumeroComposiciones.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblApellidoBuscarCompositor;
    private javax.swing.JLabel jblEdadBuscarCompositor;
    private javax.swing.JLabel jblIdBuscarCompositor;
    private javax.swing.JLabel jblNacionalidadBuscarCompositor;
    private javax.swing.JLabel jblNombreBuscarCompositor;
    private javax.swing.JLabel jblNumeroComposiconesBuscarCompositor;
    private javax.swing.JLabel jblSalarioBuscarCompositor;
    private javax.swing.JPanel jpanelA;
    private javax.swing.JTable tblCancion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroComposiciones;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
