/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author Cesar David Loaiza Q
 */
public class Nodo {
   private Nodo padre;
   private int utilidad;
   private int aguaDisponible;
   private boolean btnNinguno;

   public Nodo(Nodo padre, int aguaDisponible, boolean btnNinguno) {
      this.padre = padre;
      this.aguaDisponible = aguaDisponible;
      this.btnNinguno = btnNinguno;
   }

   public int getAguaDisponible() {
      return aguaDisponible;
   }

   public void setAguaDisponible(int aguaDisponible) {
      this.aguaDisponible = aguaDisponible;
   }

   public boolean isBtnNinguno() {
      return btnNinguno;
   }

   public void setBtnNinguno(boolean btnNinguno) {
      this.btnNinguno = btnNinguno;
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
