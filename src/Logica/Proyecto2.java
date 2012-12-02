/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Cesar David Loaiza Q
 */
public class Proyecto2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Nodo nodo = new Nodo(null, 2, true, true, 0, 0);
      Arbol arbol = new Arbol(nodo);
      arbol.encontrarMiniMax();
      nodo.setBtnNingunoMin(true);
      System.out.println(arbol.getMiniMax());
   }
}
