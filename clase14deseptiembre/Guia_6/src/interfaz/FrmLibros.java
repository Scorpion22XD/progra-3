package interfaz;

import clases.Libros;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FrmLibros extends javax.swing.JFrame {
    
    // declaramos un objeto de la clase "Libros"
    Libros objLibro;
    
    // Declaramos los modelos para cada jList que utilizamos
    DefaultListModel modLibro, modEditorial, modTipo, modAño;
    DefaultListModel modPaginas, modCosto, modEstadisticas;

    public FrmLibros() {
        initComponents();
        
        // llamamos a los metodos para llenar los ComboBox
        llenarEditorial();
        llenarTipo();
        
        // llamamos al metodo que crea los objetos de tipo DefaultList
        cargarModelo();
        
    }
    
    // metodo que tiene el control de cxbEditorial de las Editoriales
    final void llenarEditorial() {
        cbxEditorial.addItem("A");
        cbxEditorial.addItem("B");
        cbxEditorial.addItem("C");
        
    }
    
    // metodo que llena el control cbxTipo de los tipos de libros especificados
    final void llenarTipo() {
        cbxTipo.addItem("Programacion");
        cbxTipo.addItem("Analisis");
        cbxTipo.addItem("Diseño");
        
    }
    
    // Metodo que obtienen los valores ingresados y seleccionados por el usuario
    String obtenerLibro() {
        return txtLibro.getText();
    }
    
    String obtenerEditorial() {
        return String.valueOf(cbxEditorial.getSelectedItem());
    }
    
    String obtenerTipo() {
        return String.valueOf(cbxTipo.getSelectedItem());
    }
    
    int obtenerAño() {
        return Integer.valueOf(txtAño.getText());
    }
    
    int obtenerPaginas() {
        return Integer.valueOf(txtPaginas.getText());
    }
    
    double obtenerCosto() {
        return Double.valueOf(txtCosto.getText());
    }
    
    // metodo que permite crear los objetos de la clase DefaultListModel
    // ademas asigna los controles JList con su modelo correspondiente
    final void cargarModelo() {
        // creamos los modelos
        modLibro = new DefaultListModel();
        modEditorial = new DefaultListModel();
        modTipo = new DefaultListModel();
        modAño = new DefaultListModel();
        modPaginas = new DefaultListModel();
        modCosto = new DefaultListModel();
        modEstadisticas = new DefaultListModel();
        
        // asociamos cada jList con su modelo correspondiente
        lstLibro.setModel(modLibro);
        lstEditorial.setModel(modEditorial);
        lstTipo.setModel(modTipo);
        lstAño.setModel(modAño);
        lstPaginas.setModel(modPaginas);
        lstPrecio.setModel(modCosto);
        lstEstadisticas.setModel(modEstadisticas);
        
    }
    
    // metodo que agrega los valores seleccionados en las listas por medio
    // de sus modelos correspondientes
    void llenarModelos() {
        // asignamos a cada modelo los datos proporcionados por el usuario
        modLibro.addElement(objLibro.getNombre());
        modEditorial.addElement(objLibro.getEditorial());
        modTipo.addElement(objLibro.getTipo());
        modAño.addElement(objLibro.getAño());
        modPaginas.addElement(objLibro.getPaginas());
        modCosto.addElement(objLibro.getCosto());
                
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLibro = new javax.swing.JTextField();
        cbxEditorial = new javax.swing.JComboBox<>();
        cbxTipo = new javax.swing.JComboBox<>();
        txtAño = new javax.swing.JTextField();
        txtPaginas = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstLibro = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstEditorial = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstTipo = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstAño = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstPaginas = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstPrecio = new javax.swing.JList<>();
        btnEstadisticas = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstEstadisticas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("REGISTRO DE LIBROS");

        txtLibro.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Libro"));

        cbxEditorial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", " " }));
        cbxEditorial.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Editorial"));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programacion", "Analisis", "Diseño" }));
        cbxTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Libro"));

        txtAño.setBorder(javax.swing.BorderFactory.createTitledBorder("Año de Edicion"));

        txtPaginas.setBorder(javax.swing.BorderFactory.createTitledBorder("Paginas"));

        txtCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo ($)"));

        btnLimpiar.setBackground(new java.awt.Color(153, 153, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(153, 153, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 153, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lstLibro.setBorder(javax.swing.BorderFactory.createTitledBorder("Libro"));
        jScrollPane1.setViewportView(lstLibro);

        lstEditorial.setBorder(javax.swing.BorderFactory.createTitledBorder("Editorial"));
        jScrollPane2.setViewportView(lstEditorial);

        lstTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));
        jScrollPane3.setViewportView(lstTipo);

        lstAño.setBorder(javax.swing.BorderFactory.createTitledBorder("Año"));
        jScrollPane4.setViewportView(lstAño);

        lstPaginas.setBorder(javax.swing.BorderFactory.createTitledBorder("Paginas"));
        jScrollPane5.setViewportView(lstPaginas);

        lstPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio"));
        jScrollPane6.setViewportView(lstPrecio);

        btnEstadisticas.setBackground(new java.awt.Color(0, 153, 153));
        btnEstadisticas.setText("ESTADISTICAS");
        btnEstadisticas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        lstEstadisticas.setBorder(javax.swing.BorderFactory.createTitledBorder("Estadisticas"));
        jScrollPane7.setViewportView(lstEstadisticas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7)
                    .addComponent(btnEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txtCosto))
                            .addComponent(txtLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbxEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimpiar)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegistrar)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSalir)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(184, 184, 184))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLibro))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAño, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(txtPaginas)
                    .addComponent(txtCosto)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                        .addComponent(jScrollPane4)
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane3))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // limpiamos el contenido de los TextField
        txtLibro.setText("");
        txtAño.setText("");
        txtPaginas.setText("");
        txtCosto.setText("");
        
        // colocamos como elemento seleccionado en los ComboBox ningun elemento
        cbxEditorial.setSelectedIndex(-1);
        cbxTipo.setSelectedIndex(-1);
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // definimos una variable que almaceneara el resultado de la respuesta
        // dada por el usuario en la ventana de dialogo
        int resp = JOptionPane.showOptionDialog(this, "Esta seguro de salir...?",
                "Cuotas Universidad", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        // verificamos si el usuario dio clic en el boton "Yes"
        if (resp == 0) {
            System.exit(0);
            
        }
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // validamos utilizando try - catch
        try {
            // creamos el objeto de la clase Libro y le asignamos los valores a los atributos
            objLibro = new Libros(obtenerLibro(), obtenerEditorial(), obtenerTipo(), 
                    obtenerAño(), obtenerPaginas(), obtenerCosto());
            
            // llena con los datos proporcionados las listas por medio de los modelos
            llenarModelos();
            
        } catch (Exception ex) {
            // mostrar mensaje de error
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion " + ex.getMessage());
            
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        // validamos utilizando try - catch
        try {
            modEstadisticas.clear();
            
            // mostrar el numero total de libros del tipo "Analisis" de la editorial B
            // en jList "Estadisticas"
            modEstadisticas.addElement("Numero de Libros de tipo Analisis de la Editorial B es: " 
                    + Libros.gettAnalisisB());
            
            // Determinar el libro con el año de edicion mas reciente
            int mayor = Integer.MIN_VALUE;
            int pos = 0;
            
            // recorremos el jList de los libros ingresados para saber cuantos existen
            for (int i = 0; i < modLibro.getSize(); i++ ) {
                mayor = Integer.parseInt(modAño.elementAt(i).toString());
                pos = i;
            }
            
            // agregamos los datos obtenidos al jList "Estadisticas"
            modEstadisticas.addElement("Libro con el año de edicion mas reciente: " + modLibro.getElementAt(pos));
                           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion " + ex.getMessage());
        }
        
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(FrmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxEditorial;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JList<String> lstAño;
    private javax.swing.JList<String> lstEditorial;
    private javax.swing.JList<String> lstEstadisticas;
    private javax.swing.JList<String> lstLibro;
    private javax.swing.JList<String> lstPaginas;
    private javax.swing.JList<String> lstPrecio;
    private javax.swing.JList<String> lstTipo;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtLibro;
    private javax.swing.JTextField txtPaginas;
    // End of variables declaration//GEN-END:variables
}
