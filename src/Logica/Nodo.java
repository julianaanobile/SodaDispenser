/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Cesar David Loaiza Q
 */
public class Nodo {
   private Nodo padre;
   private int utilidad;
   private int aguaDisponible;
   private boolean btnNingunoMax;
   private boolean btnNingunoMin;
   private boolean esMax;
   private int profundidad;
   

   public Nodo(Nodo padre, int aguaDisponible, boolean btnNinguno, boolean esMax, int profundidad) {
      this.padre = padre;
      this.aguaDisponible = aguaDisponible;
      //this.btnNinguno = btnNinguno;
      this.esMax = esMax;
      if( btnNinguno == false)
      {
         if(esMax)
            btnNingunoMax = padre.btnNingunoMax;
         else
            btnNingunoMin = padre.btnNingunoMin;
      }
      else
      {
         if(esMax)
            btnNingunoMax = !padre.btnNingunoMax;
         else
            btnNingunoMin = !padre.btnNingunoMin;
         
      }
      if(esMax)
         utilidad = (int) Double.NEGATIVE_INFINITY;
      else
         utilidad = (int) Double.POSITIVE_INFINITY;
      this.profundidad = profundidad;
         
      
   }

   public int getAguaDisponible() {
      return aguaDisponible;
   }

   public void setAguaDisponible(int aguaDisponible) {
      this.aguaDisponible = aguaDisponible;
   }

   public boolean hundioNingunoMax() {
      return btnNingunoMax;
   }

   public void setBtnNingunoMax(boolean btnNingunoMax) {
      this.btnNingunoMax = btnNingunoMax;
   }

   public boolean hundioNingunoMin() {
      return btnNingunoMin;
   }

   public void setBtnNingunoMin(boolean btnNingunoMin) {
      this.btnNingunoMin = btnNingunoMin;
   }

   public boolean esMax() {
      return esMax;
   }

   public void setEsMax(boolean esMax) {
      this.esMax = esMax;
   }

   

   public Nodo getPadre() {
      return padre;
   }

   public void setPadre(Nodo padre) {
      this.padre = padre;
   }

   public int getUtilidad() {
      return utilidad;
   }

   public void setUtilidad(int utilidad) {
      this.utilidad = utilidad;
   }
   
     
}
