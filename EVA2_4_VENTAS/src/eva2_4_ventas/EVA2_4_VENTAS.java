/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_VENTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int canti, sald;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿CUANTAS PIEZAS QUIERE COMPRAR JOVEN?");
        canti = captu.nextInt();
        
        if(canti >= 1000)
            sald = canti * 500;
        else           //falso - opcional
            sald = canti * 800;
                System.out.println("El saldo es" + sald);
    }
    
}
