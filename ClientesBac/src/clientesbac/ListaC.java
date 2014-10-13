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
public class ListaC {
    private NodoC first;
    private NodoC last;
    private int size;
    private NodoC actual;
    
     ListaC(int tamanio){
         while(this.size<tamanio){
             NodoC caja= new NodoC();
             if(size==0){
                 this.first=caja;
                 this.actual=this.first;
                 
             }
             else{
                 this.actual.setNext(caja);
             }
             this.size++;
             this.last=this.actual;
             
         }
         
       }  
     
     public int asignar(){// devuelve la posicion en la q se asignara al cliente
         this.actual=this.first;
         for(int i=0;i<this.size;i++){
             if(actual.getEstado()==false){
                 this.actual.setEstado(true);
                 return i+1;
                 
             }
             else{
                 this.actual=this.actual.getNext();
             }
         }
         return -2;
         
     }
    
}

