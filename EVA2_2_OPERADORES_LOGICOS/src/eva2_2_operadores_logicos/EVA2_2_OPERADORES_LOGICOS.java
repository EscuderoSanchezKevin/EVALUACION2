/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_operadores_logicos;

/**
 *
 * @author KEVIN
 */
public class EVA2_2_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean A, B;
        A = false;
        B = false;
        boolean resu;
        //OPERADOR AND -> &&
        resu = A && B;
        System.out.println("resu = " + resu);
        A = true;
        B = false;
        resu = A && B;
        System.out.println("resu = " +resu);
        A = true;
        B = true;
        resu = A && B;
        System.out.println("resu = " +resu);
        //OPERADOR OR -> ||
        A = false;
        B = false;
        resu = A || B;
        System.out.println("resu (OR) = " + resu);
        A = true;
        B = false;
        resu = A || B;
        System.out.println("resu (OR) = " + resu);
        //NEGACION --> !
        A = false;
        resu = !A;
        System.out.println("resu (!) = " + resu);
    }
    
}
