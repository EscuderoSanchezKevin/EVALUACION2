/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_for_3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_20_FOR_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int numName;
        Scanner captu = new Scanner (System.in);
        System.out.println("¿cual es tu nombre?");
        nombre = captu.nextLine();
        System.out.println("¿CUANTAS VECES QUIERES IMPRIMIR?");
        numName = captu.nextInt();
        
        for (int i = 1; i <= numName; i++) {
            System.out.println(nombre);
        }
        //ejercicio 2
        int sum;
        int resu;
        System.out.println("Introduce el numero a sacar sumatoria");
        sum = captu.nextInt();
        for (int i = 1; i <= sum; i++) {
        resu = resu + i;
        }
        System.out.println("La sumatoria de" + sum + "=" + resu );
    }
    
}
