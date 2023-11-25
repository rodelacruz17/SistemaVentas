
package Vista;

import java.awt.Color;
import Modelo.LoginDAO;
import Modelo.login;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    int xMouse, yMouse;
    login lg = new login();
    LoginDAO login = new LoginDAO();
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void validar(){
        String correo = txtCorreo.getText();
        String pass = String.valueOf(txtPass.getPassword());
        if (!"".equals(correo) || !"".equals(pass)) {
            
            lg = login.log(correo, pass);
            if (lg.getCorreo()!= null && lg.getPass() != null) {
                Sistema sis = new Sistema();
                sis.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Correo o la Contraseña incorrecta");
            }
        }
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
        txtCorreo = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

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

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setText("Ingrese su correo o usuario");
        txtCorreo.setBorder(null);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        Bg.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 410, 30));

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(204, 204, 204));
        txtPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPass.setText("jPasswordField1");
        txtPass.setBorder(null);
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        Bg.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 410, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 188, 212));
        jSeparator1.setForeground(new java.awt.Color(0, 188, 212));
        Bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 410, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 188, 212));
        jSeparator2.setForeground(new java.awt.Color(0, 188, 212));
        Bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 410, 10));

        jButton1.setBackground(new java.awt.Color(31, 118, 184));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Iniciar Sesión");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 170, 60));

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

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

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

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        if (txtCorreo.getText().equals("Ingrese su correo o usuario")) {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.black);
        }
        if (String.valueOf(txtPass.getPassword()).isEmpty()) {
            txtPass.setText("jPasswordField1");
            txtPass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        if (String.valueOf(txtPass.getPassword()).equals("jPasswordField1")) {
            txtPass.setText("");
            txtPass.setForeground(Color.black);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese su nombre de usuario");
            txtCorreo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPassMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        validar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Exitpanel;
    private javax.swing.JLabel Greet;
    private javax.swing.JLabel IconLogin;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel citybg;
    private javax.swing.JPanel header;
    private javax.swing.JLabel iconbg;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel password;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
