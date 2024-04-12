/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_operadores_logicos;

/**
 *
 * @author invitado
 */
public class EVA2_11_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean dinero, clima;
        //PARA HACER LA CARNE ASADA SE NECESITA:
        //HAY DINERO Y HAYA BUEN CLIMA
        dinero = false;
        clima = false;

        System.out.println("1. NO HAY DINERO Y NO HAY BUEN CLIMA");
        if ((dinero == true) && (clima == true))
        System.out.println("SE ARMO LA CARNITA!!");
        else
        System.out.println("BUEVITO!!");
        
        dinero = false;
        clima = true;

        System.out.println("2. NO HAY DINERO PERO HAY BUEN CLIMA");
        if ((dinero == true) && (clima == true))
        System.out.println("SE ARMO LA CARNITA!!");
        else
        System.out.println("BUEVITO!!");
        
        dinero = true;
        clima = false;

        System.out.println("3. HAY DINERO PERO NO HAY BUEN CLIMA");
        if ((dinero == true) && (clima == true))
        System.out.println("SE ARMO LA CARNITA!!");
        else
        System.out.println("BUEVITO!!");
        
        dinero = true;
        clima = true;

        System.out.println("1. HAY DINERO Y HAY BUEN CLIMA");
        if ((dinero == true) && (clima == true))
        System.out.println("SE ARMO LA CARNITA ASADA AJUUUUA!!");
        else
        System.out.println("BUEVITO!!");
    }
    
}
