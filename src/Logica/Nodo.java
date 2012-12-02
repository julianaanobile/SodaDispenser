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

   public Nodo(Nodo padre, int aguaDisponible, boolean btnNinguno, boolean esMax) {
      this.padre = padre;
      this.aguaDisponible = aguaDisponible;
      this.btnNinguno = btnNinguno;
      this.esMax = esMax;
      if(esMax)
         btnNingunoMax = btnNinguno;
      else
         btnNingunoMin = btnNinguno;
         
      
   }

   public int getAguaDisponible() {
      return aguaDisponible;
   }

   public void setAguaDisponible(int aguaDisponible) {
      this.aguaDisponible = aguaDisponible;
   }

   public boolean isBtnNingunoMax() {
      return btnNingunoMax;
   }

   public void setBtnNingunoMax(boolean btnNingunoMax) {
      this.btnNingunoMax = btnNingunoMax;
   }

   public boolean isBtnNingunoMin() {
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
