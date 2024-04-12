/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_calif_eeuu;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_14_CALIF_EEUU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cali;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introdce un numero de 10 en 10 del 0 al 100:");
        cali = captu.nextInt();
        
        if (cali >= 90 && cali <=100) // SI HAY UN MAS DE 1 INSRUCCION, PONER LLAVES {}
            System.out.println("A");
        else if(cali >= 80 && cali <= 89)
                System.out.println("B");
        else if(cali >= 70 && cali <= 79)
                System.out.println("C");
        else if(cali >= 60 && cali <= 69)
                System.out.println("D");
        else if(cali >= 0 && cali <= 59)
                System.out.println("F");
        else
            System.out.println("NUMERO DE CALIFICACION INVALIDA!!");
    }
    
}
