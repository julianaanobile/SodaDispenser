/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Cesar David Loaiza Q
 */
public class Arbol {
   private Nodo raizal;
   private int decisionMiniMax;
   private ArrayList<Nodo> arbolito;
   
   public Arbol(Nodo raiz)
   {
      this.raizal = raiz;
      arbolito = new ArrayList();
      
      
   }
   
   public void crearArbol(Nodo raiz)
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
             nodo4 = new Nodo(raiz, raiz.getAguaDisponible(), true, raiz.hundioNingunoMin(), !raiz.esMax(), raiz.getProfundidad()+1,0);
             arbolito.add(nodo4);
             crearArbol(nodo4);
           }
         }
         else
         {
           if( !raiz.hundioNingunoMin() )
           {
             nodo4 = new Nodo(raiz, raiz.getAguaDisponible(), raiz.hundioNingunoMax(), true, !raiz.esMax(), raiz.getProfundidad()+1, 0);
             arbolito.add(nodo4);
             crearArbol(nodo4);
           }
            
         }

         nodo1 = new Nodo(raiz, raiz.getAguaDisponible()-1, raiz.hundioNingunoMax(), raiz.hundioNingunoMin(), !raiz.esMax(), raiz.getProfundidad()+1, 1);
         arbolito.add(nodo1);
         crearArbol(nodo1);
         
         if( raiz.getAguaDisponible()-2 >= 0)
         {
             nodo2 = new Nodo(raiz, raiz.getAguaDisponible()-2, raiz.hundioNingunoMax(), raiz.hundioNingunoMin(), !raiz.esMax(), raiz.getProfundidad()+1, 2);
             arbolito.add(nodo2);
             crearArbol(nodo2);
             
         }  
         if( raiz.getAguaDisponible()-3 >= 0)
         {
            nodo3 = new Nodo(raiz, raiz.getAguaDisponible()-3, raiz.hundioNingunoMax(), raiz.hundioNingunoMin(), !raiz.esMax(), raiz.getProfundidad()+1, 3);
            arbolito.add(nodo3);
            crearArbol(nodo3);
            
         }
      }
   }
      
      
         
      
      
      //Nodo nodo2 = new Nodo
         
    
   public void encontrarMiniMax()
   {
      /*
      for(int i=arbolito.size()-1; i>0; i--){
          int util=arbolito.get(i).getUtilidad();
          
          if(arbolito.get(i).getPadre().esMax()&&util>arbolito.get(i).getPadre().getUtilidad()){
             arbolito.get(i).getPadre().setUtilidad(util);
             decisionMiniMax = arbolito.get(i).getJugada();
             
             
          }
          else if(!arbolito.get(i).getPadre().esMax()&&util<arbolito.get(i).getPadre().getUtilidad()){
             arbolito.get(i).getPadre().setUtilidad(util);
             decisionMiniMax = arbolito.get(i).getJugada();
          }
      }*/
      while(arbolito.size()>1)
      {
         Nodo nodo = arbolito.get(obtenerMaximo(arbolito));
         int util = nodo.getUtilidad();
         int utilPadre = nodo.getPadre().getUtilidad();
         if(nodo.getPadre().esMax())
         {
            if(util>utilPadre)
            {
               nodo.getPadre().setUtilidad(util);
               decisionMiniMax = nodo.getJugada();
            }
            
         }
         else
         {
            if(util<utilPadre)
            {
               nodo.getPadre().setUtilidad(util);
               decisionMiniMax = nodo.getJugada();
            }
         }
         arbolito.remove(nodo);
         
         
      }
      
      
   }
   public int getMiniMax()
   {
      return decisionMiniMax;
   }
   public void imprimirArbol()
   {
       for(int i=0; i<arbolito.size(); i++){
          System.out.println(arbolito.get(i).getJugada());
       }
   }
   
   public int obtenerMaximo(ArrayList<Nodo> arBol){
        
        ArrayList<Integer> aMax= new ArrayList<Integer>();
        for(int i=0; i<arBol.size(); i++){
           aMax.add(arBol.get(i).getProfundidad());            
        }
       return aMax.indexOf(Collections.max(aMax));
        
    }
   
   
}
