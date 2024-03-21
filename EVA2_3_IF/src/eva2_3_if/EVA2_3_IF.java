/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double cali;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la calificacion");
        cali = captu.nextDouble();
        if(cali >= 70)
        //esta seccion --> true
        //{} opcionales, solo cuando tenemos mas
        //de una instruccion
        System.out.println("aprobaste!!");
        else// la evaluacion es falsa es opcional
        System.out.println("no acreditaste!!");
    }
    
}
