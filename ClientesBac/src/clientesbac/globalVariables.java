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
    private String urlLogo;
    
    public globalVariables(){
        imagen = new ImageIcon(getClass().getResource("/Recursos/bac_logo.jpg")); 
        urlLogo = "/Recursos/bac_logo.jpg";
    }
    
    public globalVariables(String u){
        imagen = new ImageIcon(u); 
        urlLogo = u;
    }
    
    public ImageIcon getImagen(){
        ImageIcon imagenRedimensionada = new ImageIcon(this.imagen.getImage().getScaledInstance(350, 100, 0));
        return imagenRedimensionada;
    }
    
    public String geturlLogo(){
        return this.urlLogo;
    }
    
    public void setImagen(String u){
        this.imagen = new ImageIcon(u); 
    }
    
    public void seturlLogo(String u){
        this.urlLogo = u; 
    }
}
