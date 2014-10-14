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
         this.size = 0;
         while(this.size<tamanio){
             NodoC caja= new NodoC("Caja "+(size+1));
             if(size==0){
                 this.first=caja;
                 this.actual=this.first;
                 
             }
             else{
                 this.actual.setNext(caja);
                 this.actual=this.actual.getNext();
             }
             this.size++;
             this.last=this.actual;
             
         }
         
       }  
     
     public String asignar(){// devuelve la posicion en la q se asignara al cliente
         this.actual=this.first;
         for(int i=0;i<this.size;i++){
             if(actual.getEstado()==false){
                 this.actual.setEstado(true);
                 System.out.println(actual.getNombre());
                 return actual.getNombre();
                 
                 
             }
             else{
                 this.actual=this.actual.getNext();
             }
         }
         return "";
         
     }
     
     
     public void vaciar(int pos){
         this.actual=this.first;
         for(int i=0;i<pos-1;i++){
             if(i==pos){
                 this.actual.setEstado(false);
                 break;
             }
             this.actual=this.actual.getNext();
         }
         
     }
     
     public int getSize(){
        return this.size;
    }
     public NodoC getLast(){
        return this.last;
    }

    public NodoC getFirst(){
        return this.first;
    }
    
    
    
}

