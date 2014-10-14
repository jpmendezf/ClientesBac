/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesbac;

import java.sql.ResultSet;

/**
 *
 * @author DIEGO
 */
public class manejadorReportes {
    public void tablaClientes(javax.swing.JTable jTable1)
    {
        int linea=0;
        
        try
        {
            Nodo nodo=clientesbac.clientesBac.clientesCola.getFirst();
            for(int i=0;i<clientesbac.clientesBac.clientesCola.getSize();i++){
                jTable1.setValueAt(nodo.getNombre(), linea, 0);
                jTable1.setValueAt(nodo.getTipo(), linea, 1);
                jTable1.setValueAt(nodo.getCorreo(), linea, 2);
                jTable1.setValueAt(nodo.getFecha(), linea, 3);
                jTable1.setValueAt(nodo.getHora(), linea, 4);
                linea++;
                nodo=nodo.getNext();
            }
        }

        catch(Exception e) {}
    }
    
    public void tablaClientesEntreFechas(javax.swing.JTable jTable1, String f1, String f2)
    {
        int linea=0;
        
        try
        {
            Cola cola=clientesbac.clientesBac.clientesCola.buscarFecha(f1, f2);
            Nodo nodo=cola.getFirst();
            
            for(int i=0;i<cola.getSize();i++){
                System.out.println(cola.getSize());
                jTable1.setValueAt(nodo.getNombre(), linea, 0);
                jTable1.setValueAt(nodo.getTipo(), linea, 1);
                jTable1.setValueAt(nodo.getCorreo(), linea, 2);
                jTable1.setValueAt(nodo.getFecha(), linea, 3);
                jTable1.setValueAt(nodo.getHora(), linea, 4);
                linea++;
                nodo=nodo.getNext();
            }
        }

        catch(Exception e) {}
    }
}
