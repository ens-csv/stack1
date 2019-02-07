/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author enriquenavarro
 */
public class Stack<E> {
    //Capacidad del arreglo, ponemos un número muy grande para 
    //simular capacidad infinita
    public static final int CAPACITY  =1000; 
    //lugar para guardar los valores
    private E[] data;
    //la cantidad de elementos en la pila
    private int size=0;
    //Crea un nuevo objeto tipo Stack 
    public Stack() {
        this.data  = (E[])new Object[this.CAPACITY];
    }
    /**      
    *  Regresa TRUE si la pila esta vacía.
    *  @return 
    */ 
    public boolean isEmpty(){        
        return  (this.size==0);
    }
    /**
    *  Regresa el tamaño de la pila.
    *  @return 
    */ 
    public int size(){
        return  (this.size);
    }
    /**
    *  Añade un elemento al tope de la pila
    *  @param value to push
    */ 
    public void push(E value){
    //agrega en el tope de la pila el valor correspondiente
    this.data[this.size] = value;
    //aumenta el tamaño de la pila
    this.size++; 
    }
    /**
    *  Obtiene el tope de la pila y lo borra de la misma
    *  @return el valor del tope
    *  @throws Exception 
    */
      public E  pop() throws Exception{
        E  result = null;
        //si está vacía la pila regresa una excepción 
        if (this.isEmpty()){
          throw  new Exception("La  Pila está vacía");
        }
        this.size--;
        result = this.data[this.size];
        this.data[this.size]= null; //Garbage collector      
        return result;
    }
     /**
     *  Obtiene el tope de la pila sin borrarlo de la misma
     *  @return el valor del tope
     *  @throws Exception 
     */ 
    public E  peek() throws Exception{
        E  result = null;
        //si está vacía la pila regresa una excepción
        if (this.isEmpty()){
            throw  new Exception("La  Pila está vacía");
        }
        result = this.data[this.size];
        return result;
    }
    @Override
    public String toString() {
        return "Stack{" + "data=" + data + ", size=" + size + '}';
    }
}
