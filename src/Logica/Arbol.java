/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author Cesar David Loaiza Q
 */
public class Arbol {
   private Nodo raiz;
   private int decisionMinimax;
   private ArrayList arbolito;
   
   public Arbol(Nodo raiz)
   {
      this.raiz = raiz;
      arbolito = new ArrayList();
      
      
   }
   
   public void crearArbol(Nodo raicita)
   {
      Nodo nodo1;
      Nodo nodo2;
      Nodo nodo3;
      Nodo nodo4;
      if(raiz.getAguaDisponible() == 0)
      {
         ;
      }
      else
      {
      
         if( !raiz.hundioNinguno() )
         {
           nodo4 = new Nodo(raiz, raiz.getAguaDisponible(), true);
           arbolito.add(nodo4);
           crearArbol(nodo4);
         }

         nodo1 = new Nodo(raiz, raiz.getAguaDisponible()-1, raiz.hundioNinguno());
         arbolito.add(nodo1);
         crearArbol(nodo1);
         
         if( raiz.getAguaDisponible()-2 >= 0)
         {
             nodo2 = new Nodo(raiz, raiz.getAguaDisponible()-2, raiz.hundioNinguno());
             crearArbol(nodo2);
             arbolito.add(nodo2);
         }  
         if( raiz.getAguaDisponible()-3 >= 0)
         {
            nodo3 = new Nodo(raiz, raiz.getAguaDisponible()-3, raiz.hundioNinguno());
            crearArbol(nodo3);
            arbolito.add(nodo3);
         }
      }
   }
      
      
         
      
      
      //Nodo nodo2 = new Nodo
         
    
   public void encontrarMiniMax()
   {
      
   }
}
