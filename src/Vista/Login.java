
package Vista;

import java.awt.Color;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        iconbg = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        Exitpanel = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        IconLogin = new javax.swing.JLabel();
        Greet = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Botonlogin = new javax.swing.JPanel();
        InicioSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Bg.setBackground(new java.awt.Color(255, 255, 255));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconbg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/login1.png"))); // NOI18N
        Bg.add(iconbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 340));

        Nombre.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        Nombre.setForeground(new java.awt.Color(31, 118, 184));
        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre.setText("Comercios Sur");
        Bg.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 320, 30));

        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/loginFondo.jpg"))); // NOI18N
        citybg.setText("jLabel1");
        Bg.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 500));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        Exitpanel.setBackground(new java.awt.Color(255, 255, 255));

        Exit.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(0, 0, 0));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("x");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExitpanelLayout = new javax.swing.GroupLayout(Exitpanel);
        Exitpanel.setLayout(ExitpanelLayout);
        ExitpanelLayout.setHorizontalGroup(
            ExitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ExitpanelLayout.setVerticalGroup(
            ExitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 766, Short.MAX_VALUE)
                .addComponent(Exitpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(Exitpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 40));

        IconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/50x.png"))); // NOI18N
        Bg.add(IconLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        Greet.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        Greet.setForeground(new java.awt.Color(0, 102, 204));
        Greet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Greet.setText("¡Bienvenido!");
        Bg.add(Greet, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, 50));

        user.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        user.setForeground(new java.awt.Color(0, 0, 0));
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("Usuario");
        Bg.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        password.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password.setText("Contraseña");
        Bg.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        usertxt.setBackground(new java.awt.Color(255, 255, 255));
        usertxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        usertxt.setForeground(new java.awt.Color(204, 204, 204));
        usertxt.setText("Ingrese su nombre de usuario");
        usertxt.setBorder(null);
        usertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usertxtMousePressed(evt);
            }
        });
        Bg.add(usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 410, 30));

        passwordtxt.setBackground(new java.awt.Color(255, 255, 255));
        passwordtxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        passwordtxt.setForeground(new java.awt.Color(204, 204, 204));
        passwordtxt.setText("jPasswordField1");
        passwordtxt.setBorder(null);
        passwordtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordtxtMousePressed(evt);
            }
        });
        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });
        Bg.add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 410, 30));
        Bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 410, 10));
        Bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 410, 10));

        Botonlogin.setBackground(new java.awt.Color(31, 118, 184));
        Botonlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        InicioSesion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        InicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        InicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InicioSesion.setText("Iniciar Sesión");
        InicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InicioSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InicioSesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BotonloginLayout = new javax.swing.GroupLayout(Botonlogin);
        Botonlogin.setLayout(BotonloginLayout);
        BotonloginLayout.setHorizontalGroup(
            BotonloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonloginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(InicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotonloginLayout.setVerticalGroup(
            BotonloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonloginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(InicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Bg.add(Botonlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtxtActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        Exitpanel.setBackground(new Color(184,0,3));
        Exit.setForeground(Color.white);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        Exitpanel.setBackground(Color.white);
        Exit.setForeground(Color.black);
    }//GEN-LAST:event_ExitMouseExited

    private void InicioSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioSesionMouseEntered
        Botonlogin.setBackground(new Color(37,149,219));
    }//GEN-LAST:event_InicioSesionMouseEntered

    private void InicioSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioSesionMouseExited
        Botonlogin.setBackground(new Color(31,118,184));
    }//GEN-LAST:event_InicioSesionMouseExited

    private void usertxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertxtMousePressed
        if (usertxt.getText().equals("Ingrese su nombre de usuario")) {
            usertxt.setText("");
            usertxt.setForeground(Color.black);
        }
        if (String.valueOf(passwordtxt.getPassword()).isEmpty()) {
            passwordtxt.setText("jPasswordField1");
            passwordtxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usertxtMousePressed

    private void passwordtxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordtxtMousePressed
        if (String.valueOf(passwordtxt.getPassword()).equals("jPasswordField1")) {
            passwordtxt.setText("");
            passwordtxt.setForeground(Color.black);
        }
        if (usertxt.getText().isEmpty()) {
            usertxt.setText("Ingrese su nombre de usuario");
            usertxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passwordtxtMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JPanel Botonlogin;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Exitpanel;
    private javax.swing.JLabel Greet;
    private javax.swing.JLabel IconLogin;
    private javax.swing.JLabel InicioSesion;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel citybg;
    private javax.swing.JPanel header;
    private javax.swing.JLabel iconbg;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JLabel user;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
