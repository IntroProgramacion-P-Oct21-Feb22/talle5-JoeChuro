/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jooec
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String descripcionproducto;
        int cantidadrequerida;
        double preciounitario;
        double descuento;
        double porcentaje = 15;
        double valortotal;

        System.out.println("Ingrese el noñmbre del producto");
        descripcionproducto = entrada.nextLine();

        System.out.println("Ingrese la cantidad requerida");
        cantidadrequerida = entrada.nextInt();

        System.out.println("Ingrese el precio unitario");
        preciounitario = entrada.nextDouble();

        valortotal = cantidadrequerida * preciounitario;

        if (cantidadrequerida >= 50) {
            descuento = (valortotal * porcentaje) / 100;
            valortotal = valortotal - descuento;

        }
        System.out.printf("El nombre del producto es: %s\n",
                descripcionproducto);
        System.out.printf("El valor a pagar es: %.2f", valortotal);

    }

}
