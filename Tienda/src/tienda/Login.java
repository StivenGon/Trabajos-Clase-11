package tienda;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Inicio de sesión");
        this.setResizable(false);
    }

    /**
     *  @autor Stiven Gonzalez
     *  Clase Virtual desarrollada el 26 diciembre 2023
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JLabel();
        Ingresar = new javax.swing.JButton();
        txtUsuario1 = new javax.swing.JLabel();
        etPassword = new javax.swing.JPasswordField();
        etUsuario = new javax.swing.JTextField();
        txtSalida = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Usuario");
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 170, 40));

        Ingresar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Ingresar.setText("Ingresar");
        Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 330, 50));

        txtUsuario1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario1.setText("Contraseña");
        getContentPane().add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 180, 40));

        etPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(etPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 330, 40));

        etUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(etUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 330, 40));

        txtSalida.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 180, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 804, 501));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        // TODO add your handling code here:
        
        if(VerificarContraseña() == true){
            Menu ventana2 = new Menu();
            this.setVisible(false);
            ventana2.setVisible(true);
        }else{
            txtSalida.setText("Contraseña invalida");
            etPassword.setText(null);
        }
        
    }//GEN-LAST:event_IngresarActionPerformed

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
    private boolean VerificarContraseña(){
        String password = "123456";
        String ingresada = etPassword.getText();
        System.err.println(ingresada);
        
        if(ingresada.equals(password)){
            return true;
        }
        else return false;   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JPasswordField etPassword;
    private javax.swing.JTextField etUsuario;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel txtSalida;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JLabel txtUsuario1;
    // End of variables declaration//GEN-END:variables
}
