/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_26_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario, psw;
        
        String USUARIO = "Admin";
        String PASSWORD = "Admin";
        
        Scanner captu = new Scanner(System.in);
        while(true){
        System.out.println("USUARIO:");
                usuario = captu.nextLine();
        System.out.println("CONTRASEÑA:");
                psw = captu.nextLine();
                if (usuario.equals(USUARIO) && psw.equals(PASSWORD))
                    break;
        }
        
        System.out.println("Bienvenido al SISTEMA!!");
    }
    
}
