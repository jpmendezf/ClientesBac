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
    {            
            // caso de lista vacía
            if (this.size == 0) 
            { 
                this.first = nodo;
                this.last = nodo;
                            
   
            }
            else 
            { this.actual=this.first;
                for(int i=0;i<this.size;i++){
                if(this.actual.CompareTo(nodo)==true){
                    if(actual.getNext()!=null){
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
                nodo.setPrevious(actual.getPrevious());
                nodo.setNext(actual);
                actual.setPrevious(nodo);
                this.size++;
                
    }//fin metodo
   
   public Nodo dequeue(){
      actual=this.first;
      this.first= this.first.getNext();
      this.first.setPrevious(null);
      size--;
      return actual;
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
       }
       return cola;
   }
   
   public Cola buscarHora(String criterio){//para cuando se ocupe listas x hora
       Cola cola=new Cola();
       this.actual=this.first;
       for(int i=0;i<this.size;i++){
            if(actual.getHora().equals(criterio)){
                cola.add(actual);
             }
       }
       return cola;
   }
   
   public Cola buscarFecha(String criterio){//para cuando se ocupe listas x fecha
       Cola cola=new Cola();
       this.actual=this.first;
       for(int i=0;i<this.size;i++){
            if(actual.getFecha().equals(criterio)){
                cola.add(actual);
             }
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

