package vistas;

import javax.swing.JOptionPane;
import modelo.Cuenta;
import modelo.CuentaJunior;
import modelo.CuentaPremium;


/**
 * Ventana para mostrar el deatlle y operaciones con la cuenta
 * @author luiscobian
 */
public class DetalleCuenta extends javax.swing.JDialog {

    private Cuenta cuenta; 
    /**
     * Creates new form DetalleCuenta
     */
    public DetalleCuenta(java.awt.Frame parent, 
            boolean modal, 
            Cuenta cuenta) {
        super(parent, modal);
        initComponents();
        this.cuenta = cuenta;
        String edad = ""; 
        if(cuenta instanceof CuentaPremium)
        {
            lblTipoCuenta.setText("PREMIUM");
        } else if(cuenta instanceof CuentaJunior){
            lblTipoCuenta.setText("JUNIOR");
            CuentaJunior junior = (CuentaJunior)cuenta; 
            edad = "" + junior.getEdad();
        }
        actualizarSaldo();
        lblError.setVisible(false);
        lbTitular.setText(cuenta.getTitular() 
                    + " : " + edad);
    }
    
    /**
     * Metodo que permite mostrar el saldo en el label
     */
    private void actualizarSaldo(){
        double saldo = cuenta.getCuenta(); 
        String valor = String.format("$ %.2f", saldo); 
        jlSaldo.setText(valor);
        jlStatius.setText(cuenta.getStatus()?"ACTIVO":"INACTIVO");
        lblError.setVisible(false);          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTipoCuenta = new javax.swing.JLabel();
        jlSaldo = new javax.swing.JLabel();
        btnDepositar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbTitular = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlStatius = new javax.swing.JLabel();
        btnDeshabilitar = new javax.swing.JButton();
        btnHabilitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 200, 214));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalle de la Cuenta");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/img/banco.png"))); // NOI18N

        lblTipoCuenta.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTipoCuenta.setForeground(new java.awt.Color(102, 153, 255));
        lblTipoCuenta.setText("Activo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblTipoCuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTipoCuenta)
                    .addComponent(jLabel2))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jlSaldo.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jlSaldo.setText("0.00");

        btnDepositar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        btnRetirar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 51, 51));
        lblError.setText("Fondos insuficientes");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Titular de la cuenta:");

        lbTitular.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lbTitular.setForeground(new java.awt.Color(102, 102, 102));
        lbTitular.setText("José Luis Cobián Hermosillo");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Estado de la cuenta: ");

        jlStatius.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jlStatius.setForeground(new java.awt.Color(102, 153, 255));
        jlStatius.setText("Activo");

        btnDeshabilitar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnDeshabilitar.setText("DesHabilitar");
        btnDeshabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesHabilitar(evt);
            }
        });

        btnHabilitar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnHabilitar.setText("Habilitar");
        btnHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSaldo)
                            .addComponent(lblError)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlStatius))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lbTitular))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnHabilitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRetirar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDepositar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeshabilitar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTitular)
                        .addGap(33, 33, 33)
                        .addComponent(jlSaldo)
                        .addGap(18, 18, 18)
                        .addComponent(lblError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jlStatius)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeshabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        // TODO add your handling code here:
        boolean valido=false; 
        double cantidad = 0; 
        if(cuenta.getStatus()){
            while(!valido){
                String cantidadString = JOptionPane
                             .showInputDialog(this,"Dame una cantidad");
                try { 
                    cantidad = Double.parseDouble(cantidadString); 
                    valido = true;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(this,"Cantidad Invalida");
                }
            }
            cuenta.deposito(cantidad);
            actualizarSaldo();
              
        }else 
        {
            JOptionPane.showMessageDialog(this,"Primero habilita tu cuenta");
        }
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:
        boolean valido=false; 
        double cantidad = 0; 
        if(cuenta.getStatus()){
            while(!valido){
                String cantidadString = JOptionPane
                             .showInputDialog(this,"Dame una cantidad");
                try { 
                    cantidad = Double.parseDouble(cantidadString); 
                    valido = true;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(this,"Cantidad Invalida");
                }
            }
            if(cuenta.getCuenta()<cantidad){
                lblError.setVisible(true);
            }else {
                cuenta.retiro(cantidad);
                actualizarSaldo();
            }
        }else 
        {
            JOptionPane.showMessageDialog(this,"Primero habilita tu cuenta");
        }
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnDesHabilitar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesHabilitar
        // TODO add your handling code here:
        if(cuenta.getStatus())
            cuenta.setStatus(false);
        else 
            JOptionPane.showMessageDialog(this, "La cuenta ya esta deshabilitada");        
        actualizarSaldo();
    }//GEN-LAST:event_btnDesHabilitar

    private void btnHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilitarActionPerformed
        // TODO add your handling code here:
        if(!cuenta.getStatus())
            cuenta.setStatus(true);
        else 
            JOptionPane.showMessageDialog(this, "La cuenta ya esta habilitada");        
        actualizarSaldo();
    }//GEN-LAST:event_btnHabilitarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnDeshabilitar;
    private javax.swing.JButton btnHabilitar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlSaldo;
    private javax.swing.JLabel jlStatius;
    private javax.swing.JLabel lbTitular;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblTipoCuenta;
    // End of variables declaration//GEN-END:variables
}
