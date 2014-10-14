/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesbac;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author DIEGO
 */
public class frmConsultaClientes extends javax.swing.JFrame {

    manejadorReportes m = new manejadorReportes();
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Recursos/bac_icono.png"));
        return retValue;
    }
    /**
     * Creates new form frmConsultaClientes
     */
    public frmConsultaClientes() {
        initComponents();
        jXDatePicker1.setFormats(new String[]{"d/M/yyyy"});
        jXDatePicker2.setFormats(new String[]{"d/M/yyyy"});
        jXDatePicker1.getEditor().setEditable(false);
        jXDatePicker2.getEditor().setEditable(false);
        m.tablaClientes(jTable1);
    }
    
    public void limpiar(){
        remove(jTable1);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Correo", "Fecha", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
    }
    
    public void pastel(){
        // Fuente de Datos
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Regular", 40);
        data.setValue("Corporativo", 20);
        data.setValue("Adulto Mayor", 15);
        data.setValue("Embarazada", 15);
        data.setValue("Discapacitado", 10);
 
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
         "Gráfico de pastel por tipo de Cliente", 
         data, 
         true, 
         true, 
         false);
 
        // Mostrar Grafico
        ChartFrame frame = new ChartFrame("Reporte", chart);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void barras(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(1, "Cliente","Regular");
        dataset.setValue(1, "Cliente","Corporativo");
        dataset.setValue(1, "Cliente","Adulto Mayor");
        dataset.setValue(1, "Cliente","Embarazada");
        dataset.setValue(1, "Cliente","Discapacitado");
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createBarChart3D
        ("Gráfico de barras por tipo de Cliente","", "Cantidad", 
        dataset, PlotOrientation.VERTICAL, true,true, false);
        
        ChartFrame frame = new ChartFrame("Reporte", chart);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jButtonPastel = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButtonBarras = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Todos los Clientes");
        setIconImage(getIconImage());
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Todos los Clientes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(570, 10, 520, 70);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 90, 1180, 10);

        jButton3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(510, 640, 110, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Correo", "Fecha", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 210, 1080, 400);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Hasta:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 120, 90, 40);
        getContentPane().add(jXDatePicker1);
        jXDatePicker1.setBounds(140, 130, 150, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Desde:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 120, 90, 40);
        getContentPane().add(jXDatePicker2);
        jXDatePicker2.setBounds(400, 130, 150, 28);

        jButtonPastel.setFont(new java.awt.Font("Candara", 3, 20)); // NOI18N
        jButtonPastel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/barras.png"))); // NOI18N
        jButtonPastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPastelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPastel);
        jButtonPastel.setBounds(950, 110, 70, 60);

        jButton5.setFont(new java.awt.Font("Candara", 3, 20)); // NOI18N
        jButton5.setText("Procesar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(580, 120, 130, 50);

        jButtonBarras.setFont(new java.awt.Font("Candara", 3, 20)); // NOI18N
        jButtonBarras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/pastel.png"))); // NOI18N
        jButtonBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBarras);
        jButtonBarras.setBounds(1040, 110, 70, 60);

        jLabel23.setFont(new java.awt.Font("Candara", 2, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Barras");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(950, 170, 70, 15);

        jLabel24.setFont(new java.awt.Font("Candara", 2, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Pastel");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(1040, 170, 70, 15);

        setSize(new java.awt.Dimension(1172, 756));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.hide(); this.dispose();
        frmMenuConsultas f1 = new frmMenuConsultas(); f1.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonPastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPastelActionPerformed
        barras();
    }//GEN-LAST:event_jButtonPastelActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButtonBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarrasActionPerformed
        pastel();
    }//GEN-LAST:event_jButtonBarrasActionPerformed

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
                new frmConsultaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonBarras;
    private javax.swing.JButton jButtonPastel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    // End of variables declaration//GEN-END:variables
}
