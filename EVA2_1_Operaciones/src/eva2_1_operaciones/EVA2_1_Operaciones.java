/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_operaciones;

/**
 *
 * @author Kevin
 */
public class EVA2_1_Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
        // OPERADORES ARITMETICOS
        
        //SUMA
        int num1, num2;
         num1 = 5;
         num2 = 3;
         int suma = num1 + num2; //operador de suma +
         //si en el opeador+ uno de los temrinos es 
         //una cadena, todo se convierte a cadena y se unen
         //conecntracion: Union de cadenas de texto
         System.out.println("la suma es:" + suma);
         boolean prueba = true;
         System.out.println("el valor de prueba es:" + prueba);
         
         //MULTIPLICACION
         int multi;
         multi = num1 + num2;
         System.out.println("la multiplicacion es:" + multi);
         
         //DIVISION
         int divi = 7 / 2;
         System.out.println("la division de 7/2 es;" + divi);
         double diviDouble = 7/ 2.0;
         System.out.println("la division (double) de 7/2 es;" + diviDouble);
         
         //ACUMULADORES
         //SUMA +=
         //RESTA -=
         //MULTIPLICACION *=
         //DIVISION /=
        int sumatoria = 0;
         /*sumatoria = sumatoria + 90;
         sumatoria = sumatoria + 80; */
         sumatoria += 90; //AGREGO 90 A SUMATORIA
         sumatoria += 80;
         sumatoria += 80;
         
       System.out.println("la sumatoria es" + sumatoria);
       sumatoria -= 70; //resta 70 a la sumatoria
       //SUMATORIA = SUMATORIA -70;
       System.out.println("La sumatoria es " + sumatoria);
    }
    
}
