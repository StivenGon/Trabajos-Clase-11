package tienda;
import java.text.DecimalFormat;

public class Detalle extends javax.swing.JFrame {

    /**
     * Creates new form VentanaDescripción
     */
    public Detalle(){
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Detalles de venta");
        this.setResizable(false);
       
    }

    /**
     *  @author Stiven Gonzalez
     *  Clase Virtual desarrollada el 26 diciembre 2023
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtArticulo1 = new javax.swing.JLabel();
        txtArticulo2 = new javax.swing.JLabel();
        txtArticulo3 = new javax.swing.JLabel();
        txtArticulo4 = new javax.swing.JLabel();
        txtArticulo5 = new javax.swing.JLabel();
        txtArticulo6 = new javax.swing.JLabel();
        txtArticulo7 = new javax.swing.JLabel();
        txtArticulo8 = new javax.swing.JLabel();
        txtCantidad1 = new javax.swing.JLabel();
        txtCantidad2 = new javax.swing.JLabel();
        txtCantidad3 = new javax.swing.JLabel();
        txtCantidad4 = new javax.swing.JLabel();
        txtCantidad5 = new javax.swing.JLabel();
        txtCantidad6 = new javax.swing.JLabel();
        txtCantidad7 = new javax.swing.JLabel();
        txtCantidad8 = new javax.swing.JLabel();
        txtPrecioSinIVA1 = new javax.swing.JLabel();
        txtPrecioSinIVA2 = new javax.swing.JLabel();
        txtPrecioSinIVA3 = new javax.swing.JLabel();
        txtPrecioSinIVA4 = new javax.swing.JLabel();
        txtPrecioSinIVA5 = new javax.swing.JLabel();
        txtPrecioSinIVA6 = new javax.swing.JLabel();
        txtPrecioSinIVA7 = new javax.swing.JLabel();
        txtPrecioSinIVA8 = new javax.swing.JLabel();
        txtPrecio1 = new javax.swing.JLabel();
        txtPrecio2 = new javax.swing.JLabel();
        txtPrecio3 = new javax.swing.JLabel();
        txtPrecio4 = new javax.swing.JLabel();
        txtPrecio5 = new javax.swing.JLabel();
        txtPrecio6 = new javax.swing.JLabel();
        txtPrecio7 = new javax.swing.JLabel();
        txtPrecio8 = new javax.swing.JLabel();
        txtDescuento1 = new javax.swing.JLabel();
        txtDescuento2 = new javax.swing.JLabel();
        txtDescuento3 = new javax.swing.JLabel();
        txtDescuento4 = new javax.swing.JLabel();
        txtDescuento5 = new javax.swing.JLabel();
        txtDescuento6 = new javax.swing.JLabel();
        txtDescuento7 = new javax.swing.JLabel();
        txtDescuento8 = new javax.swing.JLabel();
        txtPagar1 = new javax.swing.JLabel();
        txtPagar2 = new javax.swing.JLabel();
        txtPagar3 = new javax.swing.JLabel();
        txtPagar4 = new javax.swing.JLabel();
        txtPagar5 = new javax.swing.JLabel();
        txtPagar6 = new javax.swing.JLabel();
        txtPagar7 = new javax.swing.JLabel();
        txtPagar8 = new javax.swing.JLabel();
        btRegresar = new javax.swing.JButton();
        btPagar = new javax.swing.JButton();
        txtTotalPagar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Detalles de la venta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Artículo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio + IVA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descuento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total a pagar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, -1, -1));

        txtArticulo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtArticulo1.setForeground(new java.awt.Color(0, 0, 0));
        txtArticulo1.setText("Aceite vegetal");
        getContentPane().add(txtArticulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, -1));

        txtArticulo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtArticulo2.setForeground(new java.awt.Color(0, 0, 0));
        txtArticulo2.setText("Leche de vaca");
        getContentPane().add(txtArticulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, -1));

        txtArticulo3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtArticulo3.setForeground(new java.awt.Color(0, 0, 0));
        txtArticulo3.setText("Atún en lata");
        getContentPane().add(txtArticulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, -1));

        txtArticulo4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtArticulo4.setForeground(new java.awt.Color(0, 0, 0));
        txtArticulo4.setText("Refresco en lata");
        getContentPane().add(txtArticulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, -1));

        txtArticulo5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtArticulo5.setForeground(new java.awt.Color(0, 0, 0));
        txtArticulo5.setText("Agua Mineral");
        getContentPane().add(txtArticulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 130, -1));

        txtArticulo6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtArticulo6.setForeground(new java.awt.Color(0, 0, 0));
        txtArticulo6.setText("Sal Fina");
        getContentPane().add(txtArticulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, -1));

        txtArticulo7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtArticulo7.setForeground(new java.awt.Color(0, 0, 0));
        txtArticulo7.setText("Huevos");
        getContentPane().add(txtArticulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 130, -1));

        txtArticulo8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtArticulo8.setForeground(new java.awt.Color(0, 0, 0));
        txtArticulo8.setText("Harina");
        getContentPane().add(txtArticulo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 130, -1));

        txtCantidad1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad1.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCantidad1.setText("0");
        getContentPane().add(txtCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 50, -1));

        txtCantidad2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad2.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCantidad2.setText("0");
        getContentPane().add(txtCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 50, -1));

        txtCantidad3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad3.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCantidad3.setText("0");
        getContentPane().add(txtCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 50, -1));

        txtCantidad4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad4.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCantidad4.setText("0");
        getContentPane().add(txtCantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 50, -1));

        txtCantidad5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad5.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCantidad5.setText("0");
        getContentPane().add(txtCantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 50, -1));

        txtCantidad6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad6.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCantidad6.setText("0");
        getContentPane().add(txtCantidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 50, -1));

        txtCantidad7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad7.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCantidad7.setText("0");
        getContentPane().add(txtCantidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 50, -1));

        txtCantidad8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad8.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCantidad8.setText("0");
        getContentPane().add(txtCantidad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 50, -1));

        txtPrecioSinIVA1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioSinIVA1.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioSinIVA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecioSinIVA1.setText("₲0");
        getContentPane().add(txtPrecioSinIVA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 60, -1));

        txtPrecioSinIVA2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioSinIVA2.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioSinIVA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecioSinIVA2.setText("₲0");
        getContentPane().add(txtPrecioSinIVA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 60, -1));

        txtPrecioSinIVA3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioSinIVA3.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioSinIVA3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecioSinIVA3.setText("₲0");
        getContentPane().add(txtPrecioSinIVA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 60, -1));

        txtPrecioSinIVA4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioSinIVA4.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioSinIVA4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecioSinIVA4.setText("₲0");
        getContentPane().add(txtPrecioSinIVA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 60, -1));

        txtPrecioSinIVA5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioSinIVA5.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioSinIVA5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecioSinIVA5.setText("₲0");
        getContentPane().add(txtPrecioSinIVA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 60, -1));

        txtPrecioSinIVA6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioSinIVA6.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioSinIVA6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecioSinIVA6.setText("₲0");
        getContentPane().add(txtPrecioSinIVA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 60, -1));

        txtPrecioSinIVA7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioSinIVA7.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioSinIVA7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecioSinIVA7.setText("₲0");
        getContentPane().add(txtPrecioSinIVA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 60, -1));

        txtPrecioSinIVA8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioSinIVA8.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioSinIVA8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecioSinIVA8.setText("₲0");
        getContentPane().add(txtPrecioSinIVA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 60, -1));

        txtPrecio1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio1.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio1.setText("₲0");
        getContentPane().add(txtPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 60, -1));

        txtPrecio2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio2.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio2.setText("₲0");
        getContentPane().add(txtPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 60, -1));

        txtPrecio3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio3.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio3.setText("₲0");
        getContentPane().add(txtPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 60, -1));

        txtPrecio4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio4.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio4.setText("₲0");
        getContentPane().add(txtPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 60, -1));

        txtPrecio5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio5.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio5.setText("₲0");
        getContentPane().add(txtPrecio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 60, -1));

        txtPrecio6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio6.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio6.setText("₲0");
        getContentPane().add(txtPrecio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 60, -1));

        txtPrecio7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio7.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio7.setText("₲0");
        getContentPane().add(txtPrecio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 60, -1));

        txtPrecio8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio8.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio8.setText("₲0");
        getContentPane().add(txtPrecio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 60, -1));

        txtDescuento1.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuento1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescuento1.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDescuento1.setText("₲0");
        getContentPane().add(txtDescuento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 70, -1));

        txtDescuento2.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuento2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescuento2.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDescuento2.setText("₲0");
        getContentPane().add(txtDescuento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 70, -1));

        txtDescuento3.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuento3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescuento3.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDescuento3.setText("₲0");
        getContentPane().add(txtDescuento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 70, -1));

        txtDescuento4.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuento4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescuento4.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDescuento4.setText("₲0");
        getContentPane().add(txtDescuento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 70, -1));

        txtDescuento5.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuento5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescuento5.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDescuento5.setText("₲0");
        getContentPane().add(txtDescuento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 70, -1));

        txtDescuento6.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuento6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescuento6.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDescuento6.setText("₲0");
        getContentPane().add(txtDescuento6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 70, -1));

        txtDescuento7.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuento7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescuento7.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDescuento7.setText("₲0");
        getContentPane().add(txtDescuento7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 70, -1));

        txtDescuento8.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuento8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescuento8.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDescuento8.setText("₲0");
        getContentPane().add(txtDescuento8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 70, -1));

        txtPagar1.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar1.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar1.setText("₲0");
        getContentPane().add(txtPagar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 80, -1));

        txtPagar2.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar2.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar2.setText("₲0");
        getContentPane().add(txtPagar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 80, -1));

        txtPagar3.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar3.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar3.setText("₲0");
        getContentPane().add(txtPagar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 80, -1));

        txtPagar4.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar4.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar4.setText("₲0");
        getContentPane().add(txtPagar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 80, -1));

        txtPagar5.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar5.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar5.setText("₲0");
        getContentPane().add(txtPagar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 80, -1));

        txtPagar6.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar6.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar6.setText("₲0");
        getContentPane().add(txtPagar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 80, -1));

        txtPagar7.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar7.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar7.setText("₲0");
        getContentPane().add(txtPagar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 80, -1));

        txtPagar8.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar8.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar8.setText("₲0");
        getContentPane().add(txtPagar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 80, -1));

        btRegresar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btRegresar.setText("Regresar");
        btRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 130, -1));

        btPagar.setBackground(new java.awt.Color(51, 255, 51));
        btPagar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btPagar.setForeground(new java.awt.Color(255, 255, 255));
        btPagar.setText("Pagar");
        btPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 450, 140, -1));

        txtTotalPagar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTotalPagar.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalPagar.setText("₲0");
        getContentPane().add(txtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 110, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("₲");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, -1, -1));

        fondo.setForeground(new java.awt.Color(0, 0, 0));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pago.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagarActionPerformed
        // TODO add your handling code here:
        Pago ventana4 = new Pago();
        
        this.setVisible(false);
        ventana4.setVisible(true);
        String totales =txtTotalPagar.getText();
        ventana4.Cambio(totales);
        ventana4.setVisible(true);
    }//GEN-LAST:event_btPagarActionPerformed

    private void btRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegresarActionPerformed
        // TODO add your handling code here:
        Menu ventana2 = new Menu();
        this.setVisible(false);
        ventana2.setVisible(true);
    }//GEN-LAST:event_btRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Detalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detalle().setVisible(true);
            }
        });
    }
    public void cantidades(String cantidad1, String cantidad2, String cantidad3, String cantidad4, String cantidad5, String cantidad6,String cantidad7, String cantidad8){
        DecimalFormat df = new DecimalFormat("#.##");
        //Cantidad
        txtCantidad1.setText(cantidad1);
        txtCantidad2.setText(cantidad2);
        txtCantidad3.setText(cantidad3);
        txtCantidad4.setText(cantidad4);
        txtCantidad5.setText(cantidad5);
        txtCantidad6.setText(cantidad6);
        txtCantidad7.setText(cantidad7);
        txtCantidad8.setText(cantidad8);
        //precios
        txtPrecioSinIVA1.setText("13000");
        txtPrecioSinIVA2.setText("9000");
        txtPrecioSinIVA3.setText("11500");
        txtPrecioSinIVA4.setText("7000");
        txtPrecioSinIVA5.setText("3500");
        txtPrecioSinIVA6.setText("4000");
        txtPrecioSinIVA7.setText("16000");
        txtPrecioSinIVA8.setText("5500");
        //precios + iva
        float p1 = 13000f + (13000f*0.10f);
        float p2 = 9000f + (9000f*0.10f);
        float p3 = 11500f + (11500f*0.10f);
        float p4 = 7000f + (7000f*0.10f);
        float p5 = 3500f + (3500f*0.10f);
        float p6 = 4000f + (4000f*0.10f);
        float p7 = 16000f + (16000f*0.10f);
        float p8 = 5500f + (5500f*0.10f);
        
        String prec1 = df.format(p1);
        String prec2 = df.format(p2);
        String prec3 = df.format(p3);
        String prec4 = df.format(p4);
        String prec5 = df.format(p5);
        String prec6 = df.format(p6);
        String prec7 = df.format(p7);
        String prec8 = df.format(p8);
        
        txtPrecio1.setText("$"+prec1);
        txtPrecio2.setText("$"+prec2);
        txtPrecio3.setText("$"+prec3);
        txtPrecio4.setText("$"+prec4);
        txtPrecio5.setText("$"+prec5);
        txtPrecio6.setText("$"+prec6);
        txtPrecio7.setText("$"+prec7);
        txtPrecio8.setText("$"+prec8);
        
        // descuentos
        int cantidadp1 = Integer.valueOf(cantidad1);
        int cantidadp2 = Integer.valueOf(cantidad2);
        int cantidadp3 = Integer.valueOf(cantidad3);
        int cantidadp4 = Integer.valueOf(cantidad4);
        int cantidadp5 = Integer.valueOf(cantidad5);
        int cantidadp6 = Integer.valueOf(cantidad6);
        int cantidadp7 = Integer.valueOf(cantidad7);
        int cantidadp8 = Integer.valueOf(cantidad8);
        
        int cDescuentos;
        float aPagar1;
        float aPagar2;
        float aPagar3;
        float aPagar4;
        float aPagar5;
        float aPagar6;
        float aPagar7;
        float aPagar8;
        //desceuntos para productos del 1 al 4
        if(cantidadp1>=3){          
            if(cantidadp1==3){ 
                String descuento= df.format(p1);
                float cantidadF = Float.valueOf(cantidadp1);
                aPagar1= (cantidadF-1f)*p1;
                String total1 = df.format(aPagar1);
                txtDescuento1.setText("$"+descuento);
                txtPagar1.setText("$"+total1);
               
            }else{
                cDescuentos = (cantidadp1/3);
                int cantidad= cantidadp1-(cDescuentos);
                float cantidadP= Float.valueOf(cantidad);
                
                float desc= p1*cDescuentos;
                aPagar1= p1*cantidadP;
                
                String descuento= df.format(desc);
                txtDescuento1.setText("$"+descuento);
                
                String total1= df.format(aPagar1);
                txtPagar1.setText("$"+total1);
                
            }
        }else{
            float cant1= Float.valueOf(cantidadp1);
            aPagar1= p1*cant1;
            String total1= String.valueOf(aPagar1);
            txtPagar1.setText("$"+total1);
        }
        if(cantidadp2>=3){          
            if(cantidadp2==3){ 
                String descuento= df.format(p2);
                float cantidadF = Float.valueOf(cantidadp2);
                aPagar2= (cantidadF-1f)*p2;
                String total2 = df.format(aPagar2);
                txtDescuento2.setText("$"+descuento);
                txtPagar2.setText("$"+total2); 
            }else{
                cDescuentos = (cantidadp2/3);
                int cantidad= cantidadp2-(cDescuentos);
                float cantidadP= Float.valueOf(cantidad);
                
                float desc= p2*cDescuentos;
                aPagar2= p2*cantidadP;
                
                String descuento= df.format(desc);
                txtDescuento2.setText("$"+descuento);
                
                String total2= df.format(aPagar2);
                txtPagar2.setText("$"+total2);
                
            }
        }else{
            float cant2= Float.valueOf(cantidadp2);
            aPagar2= p2*cant2;
            String total2= String.valueOf(aPagar2);
            txtPagar2.setText("$"+total2);
        }
        if(cantidadp3>=3){          
            if(cantidadp3==3){ 
                String descuento= df.format(p3);
                float cantidadF = Float.valueOf(cantidadp3);
                aPagar3= (cantidadF-1f)*p3;
                String total3 = df.format(aPagar3);
                txtDescuento3.setText("$"+descuento);
                txtPagar3.setText("$"+total3);
            }else{
                cDescuentos = (cantidadp3/3);
                int cantidad= cantidadp3-(cDescuentos);
                float cantidadP= Float.valueOf(cantidad);
                
                float desc= p3*cDescuentos;
                aPagar3= p3*cantidadP;
                
                String total3= df.format(desc);
                txtDescuento3.setText("$"+total3);
                
                String descuentoTotal= df.format(aPagar3);
                txtPagar3.setText("$"+descuentoTotal);
                
            }
        }else{
            float cant3= Float.valueOf(cantidadp3);
            aPagar3= p3*cant3;
            String total3= String.valueOf(aPagar3);
            txtPagar3.setText("$"+total3);
        }
        if(cantidadp4>=3){          
            if(cantidadp4==3){ 
                String descuento= df.format(p4);
                float cantidadF = Float.valueOf(cantidadp4);
                aPagar4= (cantidadF-1f)*p4;
                String total4 = df.format(aPagar4);
                txtDescuento4.setText("$"+descuento);
                txtPagar4.setText("$"+total4);
            }else{
                cDescuentos = (cantidadp4/3);
                int cantidad= cantidadp4-(cDescuentos);
                float cantidadP= Float.valueOf(cantidad);
                
                float desc= p4*cDescuentos;
                aPagar4= p4*cantidadP;
                
                String descuento= df.format(desc);
                txtDescuento4.setText("$"+descuento);
                
                String total4= df.format(aPagar4);
                txtPagar4.setText("$"+total4);
                
            }
        }else{
            float cant4= Float.valueOf(cantidadp4);
            aPagar4= p4*cant4;
            String total4= df.format(aPagar4);
            txtPagar4.setText("$"+total4);
        }

        // -------------------
        if(cantidadp5>=3){          
            if(cantidadp5==3){ 
                String descuento= df.format(p5);
                float cantidadF = Float.valueOf(cantidadp5);
                aPagar5= (cantidadF-1f)*p5;
                String total5 = df.format(aPagar5);
                txtDescuento5.setText("$"+descuento);
                txtPagar5.setText("$"+total5);
            }else{
                cDescuentos = (cantidadp5/3);
                int cantidad= cantidadp5-(cDescuentos);
                float cantidadP= Float.valueOf(cantidad);
                
                float desc= p5*cDescuentos;
                aPagar5= p5*cantidadP;
                
                String total5= df.format(desc);
                txtDescuento5.setText("$"+total5);
                
                String descuentoTotal= df.format(aPagar5);
                txtPagar5.setText("$"+descuentoTotal);
                
            }
        }else{
            float cant5= Float.valueOf(cantidadp5);
            aPagar5= p5*cant5;
            String total5= String.valueOf(aPagar5);
            txtPagar5.setText("$"+total5);
        }
        
            if(cantidadp6>=3){          
            if(cantidadp6==3){ 
                String descuento= df.format(p6);
                float cantidadF = Float.valueOf(cantidadp6);
                aPagar6= (cantidadF-1f)*p6;
                String total6 = df.format(aPagar6);
                txtDescuento6.setText("$"+descuento);
                txtPagar6.setText("$"+total6);
            }else{
                cDescuentos = (cantidadp6/3);
                int cantidad= cantidadp6-(cDescuentos);
                float cantidadP= Float.valueOf(cantidad);
                
                float desc= p6*cDescuentos;
                aPagar6= p6*cantidadP;
                
                String total6= df.format(desc);
                txtDescuento6.setText("$"+total6);
                
                String descuentoTotal= df.format(aPagar6);
                txtPagar6.setText("$"+descuentoTotal);
                
            }
        }else{
            float cant6= Float.valueOf(cantidadp6);
            aPagar6= p6*cant6;
            String total6= String.valueOf(aPagar6);
            txtPagar6.setText("$"+total6);
        }
                
            if(cantidadp7>=3){          
            if(cantidadp7==3){ 
                String descuento= df.format(p7);
                float cantidadF = Float.valueOf(cantidadp7);
                aPagar7= (cantidadF-1f)*p7;
                String total7 = df.format(aPagar7);
                txtDescuento7.setText("$"+descuento);
                txtPagar7.setText("$"+total7);
            }else{
                cDescuentos = (cantidadp7/3);
                int cantidad= cantidadp7-(cDescuentos);
                float cantidadP= Float.valueOf(cantidad);
                
                float desc= p6*cDescuentos;
                aPagar7= p7*cantidadP;
                
                String total7= df.format(desc);
                txtDescuento7.setText("$"+total7);
                
                String descuentoTotal= df.format(aPagar7);
                txtPagar7.setText("$"+descuentoTotal);
                
            }
            
            
        }else{
            float cant7= Float.valueOf(cantidadp7);
            aPagar7= p7*cant7;
            String total7= String.valueOf(aPagar7);
            txtPagar7.setText("$"+total7);
        }
        
            if(cantidadp8>=3){          
            if(cantidadp8==3){ 
                String descuento= df.format(p8);
                float cantidadF = Float.valueOf(cantidadp8);
                aPagar8= (cantidadF-1f)*p8;
                String total8 = df.format(aPagar8);
                txtDescuento8.setText("$"+descuento);
                txtPagar8.setText("$"+total8);
            }else{
                cDescuentos = (cantidadp8/3);
                int cantidad= cantidadp8-(cDescuentos);
                float cantidadP= Float.valueOf(cantidad);
                
                float desc= p8*cDescuentos;
                aPagar8= p8*cantidadP;
                
                String total8= df.format(desc);
                txtDescuento8.setText("$"+total8);
                
                String descuentoTotal= df.format(aPagar8);
                txtPagar8.setText("$"+descuentoTotal);
                
            }
            
            
        }else{
            float cant8= Float.valueOf(cantidadp8);
            aPagar8= p8*cant8;
            String total8= String.valueOf(aPagar8);
            txtPagar8.setText("$"+total8);
        }
        
        // calculo total
        float pagoTotal= aPagar1 + aPagar2 + aPagar3 + aPagar4+ aPagar5 +aPagar6 + aPagar7 + aPagar8;
        String pagoTotalS = df.format(pagoTotal);
        txtTotalPagar.setText(pagoTotalS);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPagar;
    private javax.swing.JButton btRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel txtArticulo1;
    private javax.swing.JLabel txtArticulo2;
    private javax.swing.JLabel txtArticulo3;
    private javax.swing.JLabel txtArticulo4;
    private javax.swing.JLabel txtArticulo5;
    private javax.swing.JLabel txtArticulo6;
    private javax.swing.JLabel txtArticulo7;
    private javax.swing.JLabel txtArticulo8;
    private javax.swing.JLabel txtCantidad1;
    private javax.swing.JLabel txtCantidad2;
    private javax.swing.JLabel txtCantidad3;
    private javax.swing.JLabel txtCantidad4;
    private javax.swing.JLabel txtCantidad5;
    private javax.swing.JLabel txtCantidad6;
    private javax.swing.JLabel txtCantidad7;
    private javax.swing.JLabel txtCantidad8;
    private javax.swing.JLabel txtDescuento1;
    private javax.swing.JLabel txtDescuento2;
    private javax.swing.JLabel txtDescuento3;
    private javax.swing.JLabel txtDescuento4;
    private javax.swing.JLabel txtDescuento5;
    private javax.swing.JLabel txtDescuento6;
    private javax.swing.JLabel txtDescuento7;
    private javax.swing.JLabel txtDescuento8;
    private javax.swing.JLabel txtPagar1;
    private javax.swing.JLabel txtPagar2;
    private javax.swing.JLabel txtPagar3;
    private javax.swing.JLabel txtPagar4;
    private javax.swing.JLabel txtPagar5;
    private javax.swing.JLabel txtPagar6;
    private javax.swing.JLabel txtPagar7;
    private javax.swing.JLabel txtPagar8;
    private javax.swing.JLabel txtPrecio1;
    private javax.swing.JLabel txtPrecio2;
    private javax.swing.JLabel txtPrecio3;
    private javax.swing.JLabel txtPrecio4;
    private javax.swing.JLabel txtPrecio5;
    private javax.swing.JLabel txtPrecio6;
    private javax.swing.JLabel txtPrecio7;
    private javax.swing.JLabel txtPrecio8;
    private javax.swing.JLabel txtPrecioSinIVA1;
    private javax.swing.JLabel txtPrecioSinIVA2;
    private javax.swing.JLabel txtPrecioSinIVA3;
    private javax.swing.JLabel txtPrecioSinIVA4;
    private javax.swing.JLabel txtPrecioSinIVA5;
    private javax.swing.JLabel txtPrecioSinIVA6;
    private javax.swing.JLabel txtPrecioSinIVA7;
    private javax.swing.JLabel txtPrecioSinIVA8;
    private javax.swing.JLabel txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
