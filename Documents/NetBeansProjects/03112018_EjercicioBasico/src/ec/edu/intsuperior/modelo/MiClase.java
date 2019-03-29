/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author M16 ❤
 */
public class MiClase {
    public static void suma() {
        int x;
        int y;
        int z;
        x = 5;
        y = 2;
        z = x + y;
        System.out.println("La suma es:" + z);
    }//metodo clase estatico 

    public static int resta() {
        int x, y, z;
        x = 7;
        y = 3;
        z = x - y;
        return z;
    }

    public void multiplicacion() {//metodo de instancia
        int x, y, z;
        x = 6;
        y = 3;
        z = x * y;
        System.out.println("La multiplicacion es:" + z);

    }

    public float division() {//metodo de retorno
        float x, y;
        x = 30;
        y = 2;
        return x / y;

    }

    public static void max() {
        int x = 6;
        int y = 3;

        if (x > y) {
            System.out.println("El numero mayor es:" + x);
        } else {
            System.out.println("El mayor es:" + y);
        }
    }

    public static void promedio() {
        int x, y, z;
        float prom;

        x = 9;
        y = 6;
        z = 5;
        prom = (float) (x + y + z)/3;
        System.out.println("El promedio:"+prom+"\n");
        if (prom>=7){
            System.out.println("Exonerado");
            }else{
            if (prom>=4)
                System.out.println("Suspendo");
            else
                System.out.println("Pierde");
        
    }
}
}
