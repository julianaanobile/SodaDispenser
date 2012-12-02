/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Juego {
    
    int moneda;
    int aguaDisponible;
    public void IniciarJuego(){
        
        moneda=(int) (Math.random()*1+2);
        aguaDisponible=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de Litros para iniciar el juego"));
        if(moneda==1){
            JOptionPane.showMessageDialog(null, "Inicia el juego MAX");
            Nodo max= new Nodo(null, aguaDisponible,true);
            
            crearArbol(max);
        }else if(moneda==2){
            JOptionPane.showMessageDialog(null, "Inicia el juego MIN");
        }
    }
   
    
}
