/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_comparar;

import java.util.Scanner;

/**
 *
 * @author Jennis
 */
public class EVA2_6_COMPARAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        //CUAL ES EL VALOR ENTRE DOS NUMEROS
        //PIDAN AL USUARIO DOS VALORES ENTEROS
        int valor1;
        int valor2;
        System.out.println("Introducir valor");
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor 1");
        valor1 = captu.nextInt();
         System.out.println("Valor 2");
        valor2 = captu.nextInt();
        // CUAL ES EL MAYOT
        if(valor1 > valor2)
            System.out.println(valor1 + " Es mayor");
        else{
           if(valor1 == valor2)    //== sirve para comparar v1 es igual a v2 ?
               System.out.println("Son Iuguales");
           else
            System.out.println(valor2 + " Es mayor");
            
    }
        
        
    }
    
}
