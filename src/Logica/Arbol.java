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
   private int decisionMiniMax;
   private ArrayList<Nodo> arbolito;
   
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
         if(raiz.esMax())
            raiz.setUtilidad(1);
         else
            raiz.setUtilidad(-1);
      }
      else
      {
         if(raiz.esMax())
         {
           if( !raiz.hundioNingunoMax() )
           {
             nodo4 = new Nodo(raiz, raiz.getAguaDisponible(), true, !raiz.esMax(), raiz.getProfundidad()+1,0);
             arbolito.add(nodo4);
             crearArbol(nodo4);
           }
         }
         else
         {
           if( !raiz.hundioNingunoMin() )
           {
             nodo4 = new Nodo(raiz, raiz.getAguaDisponible(), true, !raiz.esMax(), raiz.getProfundidad()+1, 0);
             arbolito.add(nodo4);
             crearArbol(nodo4);
           }
            
         }

         nodo1 = new Nodo(raiz, raiz.getAguaDisponible()-1, false, !raiz.esMax(), raiz.getProfundidad()+1, 1);
         arbolito.add(nodo1);
         crearArbol(nodo1);
         
         if( raiz.getAguaDisponible()-2 >= 0)
         {
             nodo2 = new Nodo(raiz, raiz.getAguaDisponible()-2, false, !raiz.esMax(), raiz.getProfundidad()+1, 2);
             crearArbol(nodo2);
             arbolito.add(nodo2);
         }  
         if( raiz.getAguaDisponible()-3 >= 0)
         {
            nodo3 = new Nodo(raiz, raiz.getAguaDisponible()-3, false, !raiz.esMax(), raiz.getProfundidad()+1, 3);
            crearArbol(nodo3);
            arbolito.add(nodo3);
         }
      }
   }
      
      
         
      
      
      //Nodo nodo2 = new Nodo
         
    
   public void encontrarMiniMax()
   {
      for(int i=arbolito.size()-1; i>0; i--){
          int util=arbolito.get(i).getUtilidad();
          
          if(arbolito.get(i).getPadre().esMax()&&util>arbolito.get(i).getPadre().getUtilidad()){
             arbolito.get(i).getPadre().setUtilidad(util);
             
             
          }
          else if(!arbolito.get(i).getPadre().esMax()&&util<arbolito.get(i).getPadre().getUtilidad()){
             arbolito.get(i).getPadre().setUtilidad(util);
             decisionMiniMax = arbolito.get(i).getJugada();
          }
      }
      
   }
   public int getMiniMax()
   {
      return decisionMiniMax;
   }
}
