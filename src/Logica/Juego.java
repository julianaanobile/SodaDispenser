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
    
<<<<<<< HEAD
    int  moneda=(int) (Math.random()*1+2);
    int aguaDisponible;
    int eleccionMax;
    int eleccionMin;
    boolean noneMax=false;
    boolean noneMin=false;
    Arbol arbol;
    public void IniciarJuego(){
        
       
        aguaDisponible=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de Litros para iniciar el juego"));
        int aux=aguaDisponible;
        if(moneda==1){
            JOptionPane.showMessageDialog(null, "Inicia el juego MAX");
            Nodo max= new Nodo(null, aguaDisponible,false,true,0);
            arbol.crearArbol(max);
            while(aguaDisponible!=0){
               // Nodo max= new Nodo(null, aguaDisponible,false,true,0);
                if(aguaDisponible==aux){
                    
                }
            
                
                eleccionMax=arbol.encontrarMiniMax();
                
            }
        }else if(moneda==2){
            Nodo min= new Nodo(null, aguaDisponible,noneMin,false,0);
            
            JOptionPane.showMessageDialog(null, "Inicia el juego MIN");
            while(aguaDisponible !=0){
                
                if(eleccionMin==1){
                    
                    if(aguaDisponible-1==0){
                        JOptionPane.showMessageDialog(null, "Max ha ganado");
                    }else{
                        if(aguaDisponible==aux){
                            Nodo max=new Nodo(null, aguaDisponible-1,false, true,0);
                            arbol.crearArbol(max);
                        }else{
                            
                            Nodo max=new Nodo(, aguaDisponible-1,false, true,0);
                            arbol.crearArbol(max);
                        }
                        
                        aguaDisponible-=1;
                       eleccionMax= arbol.encontrarMiniMax();
                        if(aguaDisponible-eleccionMax==0){
                            JOptionPane.showMessageDialog(null, "Min ha ganado");
                        }
                        else aguaDisponible-=eleccionMax ;
                        
//                        if(encontrarMiniMax()==1){
//                            aguaDisponible-=1;
//                            if(aguaDisponible==0){
//                                JOptionPane.showMessageDialog(null, "Min ha ganado");
//                            }else{
//                                Nodo max= new (min,aguaDisponible,true,0);
//                                crearArbol(max);
//                            }
//                        }else if(encontrarMiniMax()==2){
//                            aguaDisponible-=2;
//                            if(aguaDisponible==0){
//                                JOptionPane.showMessageDialog(null, "Min ha ganado");
//                            }else{
//                                Nodo max= new (min,aguaDisponible,true,0);
//                                crearArbol(max);
//                            }
//                        }else if(encontrarMiniMax()==3){
//                            aguaDisponible-=3;
//                           if(aguaDisponible==0){
//                                JOptionPane.showMessageDialog(null, "Min ha ganado");
//                            }else{
//                                Nodo max= new (min,aguaDisponible,true,0);
//                                crearArbol(max);
//                            }
//                        }else if(encontrarMiniMax()==0){
//
//                        }
                    }

                }else if(eleccionMin==2){
                    //aguaDisponible-=2;
                    if(aguaDisponible-2==0){
                        JOptionPane.showMessageDialog(null, "Max ha ganado");
                    }else{
                        if(aguaDisponible==aux){
                            Nodo max=new Nodo(min, aguaDisponible-2,false, true,0);
                            arbol.crearArbol(max);
                        }else{
                            Nodo max=new Nodo(null, aguaDisponible-2,false, true,0);
                            arbol.crearArbol(max);
                        }
                        aguaDisponible-=2;
                        eleccionMax= arbol.encontrarMiniMax();
                        if(aguaDisponible-eleccionMax==0){
                            JOptionPane.showMessageDialog(null, "Min ha ganado");
                        }
                        else aguaDisponible-=eleccionMax ;
//                        if(encontrarMiniMax()==1){
//                            aguaDisponible-=1;
//                            if(aguaDisponible==0){
//                                    JOptionPane.showMessageDialog(null, "Min ha ganado");
//                            }else{
//                                    Nodo max= new (min,aguaDisponible,true,0);
//                                    crearArbol(max);
//                                }
//                        }else if(encontrarMiniMax()==2){
//                            aguaDisponible-=2;
//                            if(aguaDisponible==0){
//                                    JOptionPane.showMessageDialog(null, "Min ha ganado");
//                                }else{
//                                    Nodo max= new (min,aguaDisponible,true,0);
//                                    crearArbol(max);
//                                }
//                        }else if(encontrarMiniMax()==3){
//                            aguaDisponible-=3;
//                            if(aguaDisponible==0){
//                                    JOptionPane.showMessageDialog(null, "Min ha ganado");
//                                }else{
//                                    Nodo max= new (min,aguaDisponible,true,0);
//                                    crearArbol(max);
//                                }
//                        }else if(encontrarMiniMax()==0){
//
//                            
//                            
//                            
//                            
//              
//                        }
                    }

                }else if(eleccionMin==3){
                    //aguaDisponible-=3;
                    if(aguaDisponible-3==0){
                        JOptionPane.showMessageDialog(null, "Max ha Ganado");
                    }else{
                            if(aguaDisponible==aux){
                            Nodo max=new Nodo(min, aguaDisponible-3,false, true,0);
                            arbol.crearArbol(max);
                        }else{
                            Nodo max=new Nodo(null, aguaDisponible-3,false, true,0);
                            arbol.crearArbol(max);
                        }
                        aguaDisponible-=3;
                        eleccionMax= arbol.encontrarMiniMax();
                        if(aguaDisponible-eleccionMax==0){
                            JOptionPane.showMessageDialog(null, "Min ha ganado");
                        }
                        else aguaDisponible-=eleccionMax ;
//                        if(encontrarMiniMax()==1){
//                            aguaDisponible-=1;
//                            if(aguaDisponible==0){
//                                    JOptionPane.showMessageDialog(null, "Min ha ganado");
//                                }else{
//                                    Nodo max= new (min,aguaDisponible,true,0);
//                                    crearArbol(max);
//                                }
//                        }else if(encontrarMiniMax()==2){
//                            aguaDisponible-=2;
//                            if(aguaDisponible==0){
//                                    JOptionPane.showMessageDialog(null, "Min ha ganado");
//                                }else{
//                                    Nodo max= new (min,aguaDisponible,true,0);
//                                    crearArbol(max);
//                                }
//                        }else if(encontrarMiniMax()==3){
//                            aguaDisponible-=3;
//                            if(aguaDisponible==0){
//                                    JOptionPane.showMessageDialog(null, "Min ha ganado");
//                                }else{
//                                    Nodo max= new (min,aguaDisponible,true,0);
//                                    crearArbol(max);
//                                }
//                        }else if(encontrarMiniMax()==0){
//
//                        }
                  }

                }else if(eleccionMin==0){
                    
                       if(aguaDisponible==aux){
                            Nodo max=new Nodo(min, aguaDisponible,false, true,0);
                            arbol.crearArbol(max);
                        }else{
                            Nodo max=new Nodo(null, aguaDisponible,false, true,0);
                            arbol.crearArbol(max);
                        }
                        eleccionMax= arbol.encontrarMiniMax();
                        if(aguaDisponible-eleccionMax==0){
                            JOptionPane.showMessageDialog(null, "Min ha ganado");
                        }
                        else aguaDisponible-=eleccionMax ;
                        
                    noneMin=true;
//                    if(encontrarMiniMax()==1){
//                        aguaDisponible-=1;
//                       if(aguaDisponible==0){
//                                JOptionPane.showMessageDialog(null, "Min ha ganado");
//                            }else{
//                                Nodo max= new (min,aguaDisponible,true);
//                                crearArbol(max);
//                            }
//                    }else if(encontrarMiniMax()==2){
//                        aguaDisponible-=2;
//                        if(aguaDisponible==0){
//                                JOptionPane.showMessageDialog(null, "Min ha ganado");
//                            }else{
//                                Nodo max= new (min,aguaDisponible,true);
//                                crearArbol(max);
//                            }
//                    }else if(encontrarMiniMax()==3){
//                        aguaDisponible-=3;
//                        if(aguaDisponible==0){
//                                JOptionPane.showMessageDialog(null, "Min ha ganado");
//                            }else{
//                                Nodo max= new (min,aguaDisponible,true);
//                                crearArbol(max);
//                            }
//                    }else if(encontrarMiniMax()==0){
//                        
//                    }

                }
            }
=======
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
>>>>>>> origin/master
        }
    }
   
    
}
