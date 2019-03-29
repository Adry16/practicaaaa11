/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.inrsuperior.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author M16 ❤
 */
public class Metodo {
     public class punto{
         private float x;
         private float y;
         int p1;
         int p2;
         int p3;
         
         public punto(){ }
             public punto (float x, float y){
                 this.x=x;
                 this.y=y;     
         }
     }      
       public void menuGeneral() {
        String op;
        int confirmar = 1;
        do {
            op = JOptionPane.showInputDialog("seleccione :\n"
                    + "1.-Crear Punto\n"
                    + "2.-Asignar Coordenada\n"
                    + "3.-Imprimir Punto\n"
                    + "4.-Salir\n");
            
            switch (op) {
                case "1":

                    System.out.println("Deafault");
                    System.out.println("Parametros");
                    break;
                case "2":
                    System.out.println("X");
                    System.out.println("Y");
                    break;
                case "3":
                    System.out.println("Imprimir Todo");
                   
                    break;
                case "4":
                    confirmar = JOptionPane.showConfirmDialog(null, "Seguro que quieres salir....?");
                    break;
            }

        } while (!op.equals("4"));
         }
       
       public void Insertar() {
        String op;
        int confirmar = 1;
        do {
            op = JOptionPane.showInputDialog("seleccione :\n"
                    + "1.-Default, Parametros\n"
                    + "2.-(4-5)\n"
                    + "3.-P1\n"
                    + "4.-Salir\n");
            switch (op) {
                case "1":

                    System.out.println("");
                    System.out.println("");
                    break;
                case "2":
                    System.out.println("4");
                    System.out.println("5");
                    break;
                case "3":
                    System.out.println("4.5");
                   
                    break;
                case "4":
                    confirmar = JOptionPane.showConfirmDialog(null, "Seguro que quieres salir....?");
                    break;
            }

        } while (!op.equals("4"));
         }
        }
            
 




    
      
        


    