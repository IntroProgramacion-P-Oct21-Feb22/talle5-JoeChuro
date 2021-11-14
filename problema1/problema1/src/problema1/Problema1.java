/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALAA
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costokilovatioHora;
        double kilovatiosconsumidos;
        int edad;
        double descuento;
        double porcentaje;
        double valortotal;
        
        porcentaje = 10;
        
        
        System.out.println("Ingrese el costo de Kilovatio/hora");
        costokilovatioHora = entrada.nextDouble();
        
        System.out.println("Ingrese los Kilovatios consumidos en el mes");
        kilovatiosconsumidos = entrada.nextDouble();
        
        System.out.println("Ingrese la edad del usuario");
        edad = entrada.nextInt();
        
        valortotal = costokilovatioHora * kilovatiosconsumidos;
        
        if (edad >= 65) { 
            descuento = (valortotal * porcentaje)/100;
            valortotal = (valortotal - descuento);        
        }
        System.out.printf("Elvalor a pagar es: %.2f,", valortotal);
        
        
        
                
    }
    
}
