/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_if;

import java.util.Scanner;

/**
 *
 * @author Jennis
 */
public class EVA2_5_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CAPTURAR TEMPERATURA
        int temp;
        Scanner captu = new Scanner(System.in);
        //CAPTURAR TEMPERATURA
        System.out.println("Temperatura (C°)");
        temp = captu.nextInt();
        //Vamos a evaluar
        //si la temperatura es mayor a 22°, se enciende el clima
        if (temp > 22)
            System.out.println("ENCENDER AIRE ACONDICIONADO");
        
    }
    
}
