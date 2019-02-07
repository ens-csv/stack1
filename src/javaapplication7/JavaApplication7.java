/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
      import java.util.logging.Level;
      import java.util.logging.Logger;
      import javax.swing.JOptionPane;
/**
 *
 * @author enriquenavarro
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Stack <Integer> myStack = new Stack();
      int size =0 ; // tamaño elegido por el usuario
      int currentData=0; // dato  de un nodo en cuestión
      size  = Integer.parseInt(
      JOptionPane.showInputDialog("¿Cuántos  elementos deseas agregar?")); 
      for (int i=0; i<size; i++){
      currentData  = Integer.parseInt(
      JOptionPane.showInputDialog("Inserta el  elemento "+ (i+1)));
      myStack.push(currentData);
      }        
      // Muestra la lista
      System.out.println("Los elementos de la  Pila son:");
      //myStack.show();        
      try {
      myStack.pop();
      } catch (Exception ex) {
      Logger.getLogger(JavaApplication7.class.getName()).log(Level.SEVERE, null, ex);
      }
      // Muestra la lista
      System.out.println("Los elementos de la  Pila son:");
      //myStack.show();
      // Muestra la lista
      try {
      myStack.pop();
      } catch (Exception ex) {
      Logger.getLogger(JavaApplication7.class.getName()).log(Level.SEVERE, null, ex);
      }
      System.out.println("Los elementos de la  Pila son:");
      //myStack.show();
    }
}
