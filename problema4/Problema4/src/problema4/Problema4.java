/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALAA
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numerodias;
        double preciohabitacion;
        double subtotal;
        double descuento1;
        double porcentaje1;
        porcentaje1 = 10;
        double totalpagar;
        double descuento2;
        double porcentaje2;
        porcentaje2 = 15;
        double porcentaje3 = 20;
        double descuento3;

        System.out.println("Ingrese el numero de dias en la hosteria");
        numerodias = entrada.nextInt();

        System.out.println("Ingrese el precio de la habitacion");
        preciohabitacion = entrada.nextDouble();

        subtotal = preciohabitacion * numerodias;
        if (numerodias < 0) {
            subtotal = 0;
            totalpagar = 0;
        } else {

        }
        if (numerodias <= 5) {
            totalpagar = numerodias * preciohabitacion;
        } else {

            if (numerodias >= 5 && numerodias <= 10) {
                descuento1 = (porcentaje1 * subtotal) / 100;
                totalpagar = subtotal - descuento1;
            } else {
                if (numerodias >= 10 && numerodias <= 15) {
                    descuento2 = (porcentaje2 * subtotal) / 100;
                    totalpagar = subtotal - descuento2;
                } else {
                    descuento3 = (porcentaje3 * subtotal) / 100;
                    totalpagar = subtotal - descuento3;
                }
            }
        }
        System.out.printf("El total a pagar es: %.2f", subtotal);
        System.out.printf("El total a pagar es: %.2f", totalpagar);

    }
}
