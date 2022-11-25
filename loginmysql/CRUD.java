
package loginmysql;

import Class.Conexion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class CRUD extends javax.swing.JFrame {

    Conexion conn = new Conexion();
    java.sql.Connection con = conn.getConexion();
    
    PreparedStatement pst;

    ResultSet rs;

    public CRUD() {
        try {
            initComponents();
                         mostrardatos();
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        panel_fondo = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        label_minimizar = new javax.swing.JLabel();
        label_cerrar = new javax.swing.JLabel();
        panel_formulario = new javax.swing.JPanel();
        txt_pass = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        label_icono = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        txt_user = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        panel_crud = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtabledatos = new javax.swing.JTable();

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/elim.png"))); // NOI18N
        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_fondo.setBackground(new java.awt.Color(255, 255, 255));
        panel_fondo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(153, 153, 153));
        label_titulo.setText("CRUD GESTION DE USUARIOS");
        panel_fondo.add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 240, 30));

        label_minimizar.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        label_minimizar.setForeground(new java.awt.Color(102, 153, 255));
        label_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_minimizar.setText("●");
        label_minimizar.setToolTipText("Minimizar");
        label_minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_minimizarMouseClicked(evt);
            }
        });
        panel_fondo.add(label_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 20, 20));

        label_cerrar.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        label_cerrar.setForeground(new java.awt.Color(255, 102, 102));
        label_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_cerrar.setText("●");
        label_cerrar.setToolTipText("Cerrar");
        label_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_cerrarMouseClicked(evt);
            }
        });
        panel_fondo.add(label_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 20, 20));

        panel_formulario.setBackground(new java.awt.Color(255, 255, 255));
        panel_formulario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "FORMULARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        panel_formulario.setComponentPopupMenu(jPopupMenu1);
        panel_formulario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_formularioMouseClicked(evt);
            }
        });
        panel_formulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_pass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTRASEÑA\n\n\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });
        panel_formulario.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 190, 60));

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        panel_formulario.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 230, 60));

        txt_telefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_telefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TELEFONO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        panel_formulario.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 210, 60));

        txt_correo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_correo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        panel_formulario.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 210, 60));

        label_icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/users.png"))); // NOI18N
        panel_formulario.add(label_icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 180, 170));

        txt_apellidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_apellidos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APELLIDOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        panel_formulario.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 230, 60));

        txt_user.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_user.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "USUARIO\n\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        panel_formulario.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 190, 60));

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_id.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Id\n\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        panel_formulario.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 80));

        panel_fondo.add(panel_formulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 940, 210));

        panel_crud.setBackground(new java.awt.Color(255, 255, 255));
        panel_crud.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_crud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_guardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/add_user.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
        });
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        panel_crud.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        btn_modificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/revert.png"))); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarMouseClicked(evt);
            }
        });
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        panel_crud.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, 30));

        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/button_cancel.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        panel_crud.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 120, 30));

        btn_cerrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/out_1.png"))); // NOI18N
        btn_cerrar.setText("Cerrar sesión\n");
        btn_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseClicked(evt);
            }
        });
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        panel_crud.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 160, 40));

        panel_fondo.add(panel_crud, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 940, 50));

        jtabledatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nombre", "apellidos", "usuarios", "pass", "telefono", "email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtabledatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabledatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtabledatos);

        panel_fondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 940, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 962, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 11, Short.MAX_VALUE)
                    .addComponent(panel_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimizarMouseClicked

    }//GEN-LAST:event_label_minimizarMouseClicked

    private void label_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_cerrarMouseClicked

    }//GEN-LAST:event_label_cerrarMouseClicked

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed


           
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
   
if (txt_user.getText().isEmpty() || txt_pass.getText().isEmpty() || txt_nombre.getText().isEmpty() || txt_apellidos.getText().isEmpty() || txt_telefono.getText().isEmpty()|| txt_correo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Uno o mas campos estan vacios. Favor de llenarlos.");
        } else {
            String nombre = txt_nombre.getText().trim();
            String apellidos = txt_apellidos.getText().trim();
            String user = txt_user.getText().trim();
            String pass = txt_pass.getText().trim();
            String telefono = txt_telefono.getText().trim();
            String correo = txt_correo.getText().trim();


            try {
   
                pst = con.prepareStatement("Update usuarios set nombre=?, apellidos=?, username=?, pass=?, email=?, telefono=?"+"where id='"+txt_id.getText()+"'");


                pst.setString(1, nombre);
                pst.setString(2, apellidos);
                pst.setString(3, user);
                pst.setString(4, pass);
                pst.setString(5, telefono);
                pst.setString(6, correo);
                
                pst.executeUpdate();

                
                int indice =pst.executeUpdate();
            
                if(indice >0){
                
                JOptionPane.showMessageDialog(null, "Datos Actualizados Correactamente.");
                limpiarCampos();
                mostrardatos();
                        }else{
                JOptionPane.showMessageDialog(null, "Porfavor seleccionar la fila a Actualizar.");
            }

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar registrar al usuario.");
                System.err.println("Error: " + e.getMessage());
            } finally {
                try {
                    pst.close();
                } catch (SQLException e) {
                    System.err.println("Error: " + e.getMessage());
                }
            
            }
 }
   
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed


        
    }//GEN-LAST:event_btn_eliminarActionPerformed
   

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
           
        if (txt_user.getText().isEmpty() || txt_pass.getText().isEmpty() || txt_nombre.getText().isEmpty() || txt_apellidos.getText().isEmpty() || txt_telefono.getText().isEmpty()|| txt_correo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Uno o mas campos estan vacios. Favor de llenarlos.");
        } else {
            String nombre = txt_nombre.getText().trim();
            String apellidos = txt_apellidos.getText().trim();
            String user = txt_user.getText().trim();
            String pass = txt_pass.getText().trim();
            String telefono = txt_telefono.getText().trim();
            String correo = txt_correo.getText().trim();


            try {
   
                pst = con.prepareStatement("insert into usuarios (nombre, apellidos, username, pass, email, telefono) values (?,?,?,?,?,?)");


                pst.setString(1, nombre);
                pst.setString(2, apellidos);
                pst.setString(3, user);
                pst.setString(4, pass);
                pst.setString(5, telefono);
                pst.setString(6, correo);
                
                pst.executeUpdate();

                
                JOptionPane.showMessageDialog(null, "Datos guardado Correactamente.");
                limpiarCampos();

                mostrardatos();

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar registrar al usuario.");
                System.err.println("Error: " + e.getMessage());
            } finally {
                try {
                    pst.close();
                } catch (SQLException e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }
        }  
    }//GEN-LAST:event_btn_guardarMouseClicked

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void btn_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarMouseClicked

    private void panel_formularioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_formularioMouseClicked
       btn_guardar.setEnabled(true);
            btn_modificar.setEnabled(false);
            btn_eliminar.setEnabled(true);
            
            limpiarCampos();
    }//GEN-LAST:event_panel_formularioMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
   
        if(JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar Usuario?","SALIR",JOptionPane.YES_NO_CANCEL_OPTION)==0){
            try{
             PreparedStatement ps= con.prepareStatement("DELETE FROM usuarios where id='"+txt_id.getText()+"'");
             int indice = ps.executeUpdate();
             if(indice >0){
                mostrardatos();} else{
                 System.err.println("No ha seleccionado fila ");
             }
               
            }catch( SQLException e){
              System.err.println("Error al Eliminar datos " + e.getMessage());  
            }
            
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jtabledatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabledatosMouseClicked
      int fila = jtabledatos.getSelectedRow();

   txt_id.setText(jtabledatos.getValueAt(fila,0).toString());
   txt_nombre.setText(jtabledatos.getValueAt(fila,1).toString());
   txt_apellidos.setText(jtabledatos.getValueAt(fila, 2).toString());
   txt_user.setText(jtabledatos.getValueAt(fila, 3).toString());
   txt_pass.setText(jtabledatos.getValueAt(fila, 4).toString());
    txt_telefono.setText(jtabledatos.getValueAt(fila,5).toString());
    txt_correo.setText(jtabledatos.getValueAt(fila, 6).toString());

            btn_guardar.setEnabled(false);
            btn_modificar.setEnabled(true);
            btn_eliminar.setEnabled(true);
        
            

    }//GEN-LAST:event_jtabledatosMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
int id = Integer.parseInt(txt_id.getText());

        //Metdo de eliminacion de datos a MySql
        try {
          
            pst = con.prepareStatement("delete from usuarios where id='" + id + "'");

            pst.executeUpdate();

         
            JOptionPane.showMessageDialog(null, "Datos eliminados con exito.");

           
            limpiarCampos();

         
            mostrardatos();

           
            btn_guardar.setEnabled(true);
            btn_modificar.setEnabled(false);
            btn_eliminar.setEnabled(false);

        } catch (HeadlessException | SQLException e) {
   
            JOptionPane.showMessageDialog(null, "Ocurrio un error al eliminar los datos del usuario.");
            System.err.println("Error: " + e.getMessage());
        } finally {
     
            try {
                pst.close();
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cerrarMouseClicked

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
      new Login().setVisible(true);
      this.dispose();  
              
            
    }//GEN-LAST:event_btn_cerrarActionPerformed


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
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtabledatos;
    private javax.swing.JLabel label_cerrar;
    private javax.swing.JLabel label_icono;
    private javax.swing.JLabel label_minimizar;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JPanel panel_crud;
    private javax.swing.JPanel panel_fondo;
    private javax.swing.JPanel panel_formulario;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    private void mostrardatos() throws SQLException {

        
   DefaultTableModel modelo = new DefaultTableModel();
  modelo.addColumn("id");
  modelo.addColumn("nombre");
  modelo.addColumn("apellidos");    
  modelo.addColumn("usuario");
  modelo.addColumn("pass");
  modelo.addColumn("email");
  modelo.addColumn("telefono");
  jtabledatos.setModel(modelo);
  String consultasql= "select * from usuarios"; 
  String data[]= new String[7];
  
  Statement st;
  try {
      
      pst = con.prepareStatement("select * from usuarios");
      st=(Statement) con.createStatement();
      rs = pst.executeQuery();
      while (rs.next()) {
        data[0]=rs.getString(1);
        data[1]=rs.getString(2);  
        data[2]=rs.getString(3);  
        data[3]=rs.getString(4);  
        data[4]=rs.getString(5);  
        data[5]=rs.getString(6);  
        data[6]=rs.getString(7);  
        modelo.addRow(data);  
      }   
  } catch(SQLException e) {
      System.out.println("Error al mostrar datos.....");
  }
  

    }
    
        void limpiarCampos() {
        
        txt_nombre.setText("");
        txt_apellidos.setText("");
        txt_id.setText("");
        txt_user.setText("");
        txt_pass.setText("");
        txt_telefono.setText("");
        txt_correo.setText("");
    }
        void eliminar(){
                int filaseleccionado = jtabledatos.getSelectedRow();
                if (filaseleccionado==-1){
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila.");
                } else{
                    String sql = "DELETE FROM usuario where id="+txt_id.getText();
                }
        }

        
}

