/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesbac;

import javax.swing.ImageIcon;

/**
 *
 * @author DIEGO
 */
public class globalVariables {
    private ImageIcon imagen; 
    //ImageIcon imagenredimensionada; 
    
    public globalVariables(){
        imagen = new ImageIcon(getClass().getResource("/Recursos/bac_logo.jpg")); 
    }
    
    public globalVariables(String u){
        imagen = new ImageIcon(u); 
    }
    
    public ImageIcon getImagen(){
        ImageIcon imagenRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(350, 100, 0));
        return imagenRedimensionada;
    }
    
    public void setImagen(String u){
        this.imagen = new ImageIcon(u); 
    }
}
