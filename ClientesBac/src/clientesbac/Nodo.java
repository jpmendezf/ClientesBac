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
public class Nodo {
    private String correo;
    private String nombre;
    private String tipo;
    private String fecha;
    private String hora;
    private int prioridad;
    private Nodo next;
    private Nodo previous;
    
    
    Nodo(String co, String nom, String t,String fe, String h){
         
        this.correo= co;
        this.nombre=nom;
        this.tipo=t;
        this.fecha=fe;
        this.hora=h;
        this.prioridad=0;
        this.next=null;
        this.previous= null;
       
    }
    
    Nodo(){
         
        this.correo= null;
        this.nombre=null;
        this.tipo=null;
         this.fecha=null;
        this.hora=null;
        this.prioridad=0;
         this.next=null;
        this.previous= null;
    }
    
    public void fijarPrioridad(){
        if(tipo.equals("Discapacitado")){this.prioridad=1;}
        if(tipo.equals("Adulto Mayor")){this.prioridad=2;}
        if(tipo.equals("Embarazada")){this.prioridad=3;}
        if(tipo.equals("Corporativo")){this.prioridad=4;}
        if(tipo.equals("Regular")){this.prioridad=5;}
    }
    public void setCorreo(String co){
        this.correo=co;
    }
    public void setNext(Nodo nodo){
        this.next=nodo;
    }
     public void setPrevious(Nodo nodo){
         if(nodo==null){this.previous=null;}
         else{
        this.previous=nodo;}
        
    }
    
     
     public void setNombre(String nom){
        this.nombre=nom;
    }
      public void setTipo(String tipo){
        this.tipo=tipo;
    }
      public void setFecha(String fe){
        this.fecha=fe;
    }
      public void setHora(String hora){
        this.hora=hora;
    }
      
     public String getCorreo(){
       return this.correo;
       
    }  
      public String getTipo(){
       return this.tipo;
       
    }  
    
       public String getNombre(){
       return this.nombre;
       
    }  
       public String getFecha(){
       return this.fecha;
       
    }  
       
       public String getHora(){
       return this.hora;
       
    }  
       public Nodo getNext(){
       return this.next;
       
    } 
      public Nodo getPrevious(){
       return this.previous;
       
    } 
      public int getPrioridad(){
          return this.prioridad;
      }
      
     public boolean CompareTo(Nodo nodo){// comparar las prioridades
         if(this.getPrioridad()<nodo.getPrioridad()){
             return true;
         }
         else
         if(this.getPrioridad()>nodo.getPrioridad()){
             return false;
         }
         else{
             return false;
         }
     }
}


