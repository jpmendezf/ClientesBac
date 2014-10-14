/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesbac;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author DIEGO, Wayner
 */
public class frmMenuPrincipal extends javax.swing.JFrame {

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Recursos/bac_icono.png"));
        return retValue;
    }
    /**
     * Creates new form frmMenuPrincipal
     */
    public frmMenuPrincipal() {
        initComponents();
        jLabelLogo.setIcon(clientesbac.clientesBac.g.getImagen());
        
        /*Enviar correos
        try{
            javamail mail = new javamail();
            mail.send("ldiego800@gmail.com","Servicio al Cliente Bac San Jose","Este correo fue enviado usando JavaMail");
            System.out.println("true");
        }
        catch(Exception e){
            System.out.println("false");
        }*/
        
    }
    
    public void procesarConfiguracion()
    {
        try{
            String codigo = JOptionPane.showInputDialog(null,"Ingrese el código de seguridad","Permisos de Administrador",JOptionPane.WARNING_MESSAGE);
            if (codigo.equals("topsecret"))
            {
                this.hide(); this.dispose();
                frmConfiguracion f1 = new frmConfiguracion(); f1.show();
            }
            else {
                JOptionPane.showMessageDialog(null, "Codigo Incorrecto","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
        }
        
    }
    
    
    public void verificarCaja(){
        try{
            String estado=clientesbac.clientesBac.cajasCola.asignar();
            if(!estado.equals("")){
                enviarCorreoC(estado);
                clientesbac.clientesBac.tiquetesCola.dequeue();
                 JOptionPane.showMessageDialog(null, "Cita registrada correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
                
            }
            
        }
        catch(Exception e){}
    }
    
    public void enviarCorreoC(String caja){
        try{
            Nodo nodo=clientesbac.clientesBac.tiquetesCola.getFirst();
            
            javamail mail = new javamail();
            mail.send(nodo.getCorreo(),"Servicio al Cliente Bac San Jose","<p>Estimado(a) "+nodo.getNombre()+" le informamos que su cita sera en la "+caja+" </p>");
            System.out.println("true");
        }
        catch(Exception e){
            System.out.println("false");
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setIconImage(getIconImage());
        getContentPane().setLayout(null);

        jLabelLogo.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(510, 20, 460, 110);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Menú Principal");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 20, 280, 110);

        jButton1.setFont(new java.awt.Font("Candara", 3, 36)); // NOI18N
        jButton1.setText("Reportes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 240, 310, 100);

        jButton2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(860, 520, 110, 40);

        jButton3.setFont(new java.awt.Font("Candara", 3, 32)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 0));
        jButton3.setText("Verificar Citas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(550, 370, 310, 70);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 150, 1030, 10);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jLabel3.setText("Enpowered By Diego and Wayner");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 540, 310, 20);

        jButton4.setFont(new java.awt.Font("Candara", 3, 36)); // NOI18N
        jButton4.setText("Tiquetes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(140, 240, 310, 100);

        jButton5.setFont(new java.awt.Font("Candara", 3, 32)); // NOI18N
        jButton5.setText("Verificar Cajas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(140, 370, 310, 70);

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem1.setText("Tiquetes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem6.setText("Verificar Cajas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jMenuItem3.setText("Configuración");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");

        jMenuItem4.setText("Clientes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Ayuda");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem5.setText("Acerca de");
        jMenuItem5.setEnabled(false);
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1022, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide(); this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.hide(); this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        verificarCaja();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.hide(); this.dispose();
        frmIngresarCita f1 = new frmIngresarCita(); f1.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        procesarConfiguracion();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide(); this.dispose();
        frmMenuConsultas f1 = new frmMenuConsultas(); f1.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.hide(); this.dispose();
        frmConsultaClientes f1 = new frmConsultaClientes(); f1.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.hide(); this.dispose();
        frmIngresarCita f1 = new frmIngresarCita(); f1.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.hide(); this.dispose();
        frmCajas f1 = new frmCajas(); f1.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.hide(); this.dispose();
        frmCajas f1 = new frmCajas(); f1.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        //Esta instruccion aplica el skin
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.NebulaSkin");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
