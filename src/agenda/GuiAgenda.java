package agenda;

import java.awt.MouseInfo;
import java.awt.Point;
import java.util.HashMap;

public class GuiAgenda extends javax.swing.JFrame {
    public HashMap<String, Contacto> contacto = new HashMap();
    
    public GuiAgenda() {
        initComponents();
        jPanel2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mover = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDatos = new javax.swing.JTextArea();
        bBuscar = new javax.swing.JLabel();
        nuevoContacto = new javax.swing.JLabel();
        bCerrar = new javax.swing.JLabel();
        bMinimizar = new javax.swing.JLabel();
        fondoPrincipal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mover1 = new javax.swing.JLabel();
        bCerrar1 = new javax.swing.JLabel();
        bMinimizar1 = new javax.swing.JLabel();
        cDireccion = new javax.swing.JTextField();
        cTelefono = new javax.swing.JTextField();
        cApellidos = new javax.swing.JTextField();
        cNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        cDatos = new javax.swing.JTextArea();
        bAgregar = new javax.swing.JLabel();
        fondoContacto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moverMouseDragged(evt);
            }
        });
        mover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moverMousePressed(evt);
            }
        });
        jPanel1.add(mover, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 410, 30));

        tNombre.setBackground(new java.awt.Color(239, 238, 241));
        tNombre.setBorder(null);
        tNombre.setOpaque(false);
        jPanel1.add(tNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 280, -1));

        tDatos.setEditable(false);
        tDatos.setBackground(new java.awt.Color(239, 238, 241));
        tDatos.setColumns(20);
        tDatos.setRows(5);
        tDatos.setBorder(null);
        tDatos.setOpaque(false);
        jScrollPane1.setViewportView(tDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 430, 320));

        bBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bBuscarMouseClicked(evt);
            }
        });
        jPanel1.add(bBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 90, 30));

        nuevoContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoContactoMouseClicked(evt);
            }
        });
        jPanel1.add(nuevoContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 40, 100, 20));

        bCerrar.setPreferredSize(new java.awt.Dimension(34, 14));
        bCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(bCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 20, 20));

        bMinimizar.setPreferredSize(new java.awt.Dimension(34, 14));
        bMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(bMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 10, 20, 20));

        fondoPrincipal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jairo\\Desktop\\Agenda\\img\\finaldeverdad2.png")); // NOI18N
        jPanel1.add(fondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 576, 576));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mover1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mover1MouseDragged(evt);
            }
        });
        mover1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mover1MousePressed(evt);
            }
        });
        jPanel2.add(mover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 410, 30));

        bCerrar1.setPreferredSize(new java.awt.Dimension(34, 14));
        bCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCerrar1MouseClicked(evt);
            }
        });
        jPanel2.add(bCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 20, 20));

        bMinimizar1.setPreferredSize(new java.awt.Dimension(34, 14));
        bMinimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMinimizar1MouseClicked(evt);
            }
        });
        jPanel2.add(bMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 10, 20, 20));

        cDireccion.setBackground(new java.awt.Color(239, 238, 241));
        cDireccion.setBorder(null);
        cDireccion.setOpaque(false);
        jPanel2.add(cDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 410, 20));

        cTelefono.setBackground(new java.awt.Color(239, 238, 241));
        cTelefono.setBorder(null);
        cTelefono.setOpaque(false);
        jPanel2.add(cTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 232, 410, 20));

        cApellidos.setBackground(new java.awt.Color(239, 238, 241));
        cApellidos.setBorder(null);
        cApellidos.setOpaque(false);
        jPanel2.add(cApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 165, 410, 20));

        cNombre.setBackground(new java.awt.Color(239, 238, 241));
        cNombre.setBorder(null);
        cNombre.setOpaque(false);
        jPanel2.add(cNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 97, 410, 20));

        cDatos.setBackground(new java.awt.Color(239, 238, 241));
        cDatos.setColumns(20);
        cDatos.setRows(5);
        cDatos.setBorder(null);
        cDatos.setOpaque(false);
        jScrollPane2.setViewportView(cDatos);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 430, 120));

        bAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAgregarMouseClicked(evt);
            }
        });
        jPanel2.add(bAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 90, 30));

        fondoContacto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jairo\\Desktop\\Agenda\\img\\finaldeverdad1.png")); // NOI18N
        fondoContacto.setPreferredSize(new java.awt.Dimension(576, 576));
        jPanel2.add(fondoContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bCerrarMouseClicked

    private void bMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMinimizarMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_bMinimizarMouseClicked

    private void moverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_moverMousePressed

    private void moverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_moverMouseDragged

    private void bBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBuscarMouseClicked
        Contacto dato = contacto.get(tNombre.getText());
        tDatos.setText(dato.datosContacto());
    }//GEN-LAST:event_bBuscarMouseClicked

    private void mover1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mover1MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_mover1MouseDragged

    private void mover1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mover1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_mover1MousePressed

    private void bCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCerrar1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_bCerrar1MouseClicked

    private void bMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMinimizar1MouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_bMinimizar1MouseClicked

    private void nuevoContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoContactoMouseClicked
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_nuevoContactoMouseClicked

    private void bAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAgregarMouseClicked
        int numero = Integer.parseInt(cTelefono.getText());
        Contacto h = new Contacto(cNombre.getText(),cApellidos.getText(),numero,cDireccion.getText(),cDatos.getText());
        contacto.put(cNombre.getText(),h);
        
        //System.out.println(contacto.get("Jairo").datosContacto());
        jPanel2.setVisible(false);
        jPanel1.setVisible(true);
        
        cNombre.setText("");
        cApellidos.setText("");
        cTelefono.setText("");
        cDireccion.setText("");
        cDatos.setText("");
    }//GEN-LAST:event_bAgregarMouseClicked

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
            java.util.logging.Logger.getLogger(GuiAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bAgregar;
    private javax.swing.JLabel bBuscar;
    private javax.swing.JLabel bCerrar;
    private javax.swing.JLabel bCerrar1;
    private javax.swing.JLabel bMinimizar;
    private javax.swing.JLabel bMinimizar1;
    private javax.swing.JTextField cApellidos;
    private javax.swing.JTextArea cDatos;
    private javax.swing.JTextField cDireccion;
    private javax.swing.JTextField cNombre;
    private javax.swing.JTextField cTelefono;
    private javax.swing.JLabel fondoContacto;
    private javax.swing.JLabel fondoPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mover;
    private javax.swing.JLabel mover1;
    private javax.swing.JLabel nuevoContacto;
    private javax.swing.JTextArea tDatos;
    private javax.swing.JTextField tNombre;
    // End of variables declaration//GEN-END:variables
    private int x;
    private int y;
}
