/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesbac;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Way
 */
public class Cola {
    private Nodo first;
    private Nodo last;
    private int size;
    private Nodo actual;
    
    public Cola(){
        first=null;
	last=null;
	size=0;
        actual=null;
    }
    
   public Cola(Nodo nodo){
   first=nodo;
   last=nodo;
   size=1;
   actual=null;
   }
   
   public void add(Nodo nodo) 
    {          Nodo aux=new Nodo();  
            // caso de lista vacía
            if (this.size == 0) 
            { 
                this.first = nodo;
                this.last = nodo;
                            
   
            }
            else 
            { this.actual=this.first;
            aux=this.actual;
                for(int i=0;i<this.size;i++){
                if(this.actual.CompareTo(nodo)==true){
                    if(actual.getNext()!=null){
                        aux=actual;
                    actual=this.actual.getNext();
                                         
                   }
                    }
                else{
                    break;
                }
                }
                
            }
            if(this.actual==this.first){
                this.first=nodo;
            }
            if(actual==this.last){
                    this.last=nodo;
            }
             
            
                nodo.setPrevious(aux);
             
                 
                nodo.setNext(actual);
                
                //actual.setPrevious(nodo);
                this.size++;
              
                
    }//fin metodo
   
   public void dequeue(){
      //actual=this.first;
      this.first= this.first.getNext();
      this.first.setPrevious(null);
      size--;
      
   }
   public void delete(Nodo nodo){// metodo auxiliar en caso de ocuparlo
       actual=nodo.getPrevious();
       actual.setNext(nodo.getNext() );
       actual=nodo.getNext();
       actual.setPrevious(nodo.getPrevious());
       nodo.setPrevious(null);
       nodo.setNext(null);
       size--;
                     
   }
   public Cola buscarTipo(String criterio){//para cuando se ocupe listas x tipo
       Cola cola=new Cola();
       this.actual=this.first;
       for(int i=0;i<this.size;i++){
            if(actual.getTipo().equals(criterio)){
                cola.add(actual);
             }
            
            this.actual=this.actual.getNext();
            
       }
       return cola;
   }
   
   
   public Cola buscarFecha(String f1, String f2){//para cuando se ocupe listas x fecha
       Cola cola=new Cola();
       SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha1 = null;
        Date fecha2 = null;
       try{
            String strFecha1 = f1;
           
            String strFecha2 = f2;
            
            fecha1 = formateador.parse(strFecha1);
            fecha2 = formateador.parse(strFecha2);
           }
       catch(Exception e){}
            
      
       this.actual=this.first;
       for(int i=0;i<this.size;i++){
           try{
               
            String strFecha = actual.getFecha();
            Date fecha = null;
            fecha = formateador.parse(strFecha);
          
            if ((fecha.after(fecha1) && fecha.before(fecha2)) || fecha.equals(fecha1) || fecha.equals(fecha2)){
                 cola.add(actual);
                 cola.size++;
            }
            
            this.actual=this.actual.getNext();
            
         
             }
        catch(Exception e){}
            
       }
       return cola;
   }
  
   
   // gets de la clase
         public Nodo getLast(){
             return this.last;
         }
         
         public Nodo getFirst(){
             return this.first;
         }
         public int getSize(){
             return this.size;
         }
}
