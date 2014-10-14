/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesbac;

/**
 *
 * @author Way
 */
public class NodoC {
    private String nombre;
    private boolean estado;
    private NodoC next;
    private NodoC previous;
    
    NodoC(){
        this.nombre="Caja 1";
        this.estado=false;
        this.next=null;
        this.previous=null;
    }
    
    NodoC(String n){
        this.nombre=n;
        this.estado=false;
        this.next=null;
        this.previous=null;
    }
    
     public void setNext(NodoC nodo){
        this.next=nodo;
    }
     public void setPrevious(NodoC nodo){
        this.previous=nodo;
    }
     
      public NodoC getNext(){
       return this.next;
       
    } 
      public NodoC getPrevious(){
       return this.previous;
       
    } 
      
      public String getNombre(){
          return this.nombre;
      }
      
      public boolean getEstado(){
          return this.estado;
      }
      
      public void setNombre(String nom){
          this.nombre=nom;
          
      }
      
      public void setEstado(boolean estado){
          this.estado=estado;
      }
      
}
