/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_volado;

/**
 *
 * @author invitado
 */
public class EVA2_8_VOLADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double moneda;
    moneda = Math.random();
    System.out.println("El valor de moneda = " + moneda);
    
    //0.5 es la moneda del rango
    if(moneda > 0.5)
    System.out.println("CARA");
    else 
    System.out.println("CRUZ");
    }
    
}
