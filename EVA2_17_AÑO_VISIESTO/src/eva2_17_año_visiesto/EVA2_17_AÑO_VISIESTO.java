/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_año_visiesto;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class EVA2_17_AÑO_VISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int año,divi,resi,resi2,resi3;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introducir año que crea es Viciesto:");
       año = captu.nextInt();
       divi = año / 4;
       
        resi = año % 4; // NUESTRO RESIDUO TIENE QUE QUDAR EN 0
        // System.out.println("Division entera de " + año +  "% 4 =  "+ resi);
        resi2 = año % 100;//NUESTRO RESIDUO TIENE QUE QUEDAR EN 1 VALOR
       // System.out.println("Division entera de " + año +  "% 100 =  "+ resi);
       resi3 = año % 400; //NUESTRO RESIDUO TIENE QUE QUEDAR EN 0
       // System.out.println("Division entera de " + año +  "% 400 =  "+ resi);
     // ||= OR && AND  PARA COMPARAR RESIDUOS Y DAR EL RESULTADO
    
        if((resi == 0) && (resi2 !=0 || resi3 == 0 ))
            System.out.println("En efecto es año vicisesto");
        else
            System.out.println("No es año viciesto");
    }
    
}
