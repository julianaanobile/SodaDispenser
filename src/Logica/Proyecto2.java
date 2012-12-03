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
      Nodo nodo = new Nodo(null, 1, false, false, true, 0, 0);//padre agua hundióMax hundióMin esMax prof jugadaAnt
      Arbol arbol = new Arbol(nodo);
      //nodo.setBtnNingunoMin(true);
      //nodo.setBtnNingunoMax(true);
      arbol.crearArbol(nodo);
      arbol.imprimirArbol();
      arbol.encontrarMiniMax();
     
      System.out.println("Decisión Mini Max "+arbol.getMiniMax());
   }
}
