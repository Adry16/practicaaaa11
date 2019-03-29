/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author M16 ❤
 */
public class Operaciones {
  public void AreaTriangulo(){
       int a,b;
       float d;
       a = Integer.parseInt(JOptionPane.showInputDialog("ingrese la base:"));
       b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese lado:"));
      d=a*b/2;
       if(d<0){
         JOptionPane.showMessageDialog(null,"Dato erroneo");
       }else{
           JOptionPane.showMessageDialog(null,"El Area del Triangulo es:"+d);  
       }  
       }
       public void Circulo(){
           double rad,r;
           rad=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Radio"));
           if(rad<0){
               JOptionPane.showMessageDialog(null, "Dato Erroneo");
               }else{
               r=Math.PI*rad;
               JOptionPane.showMessageDialog(null,"El area del circulo es:"+r );
               
               
           }
            
       }
}  
  




