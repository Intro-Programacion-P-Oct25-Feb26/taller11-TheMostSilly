/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion;

        System.out.println("Ingrese la opción 1 = área del cuadrado, 2 = área"
                + " del triángulo, 3 = área del rectángulo");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            obtenerAreaCuadrado();

        } else if (opcion == 2) {
            obtenerAreaTriangulo();
        } else if (opcion == 3) {
            obtenerAreaRectangulo();

        } else {
            System.out.println("Ingrese una opción válida");
        }
    }

    public static void obtenerAreaCuadrado() {
        double lado;
        System.out.println("Ingrese el lado");
        lado = entrada.nextDouble();
        double operacion = lado * lado;
        System.out.printf("El área del cuadrado es: %s", operacion);
    }
    public static void obtenerAreaTriangulo() {
        double base;
        double altura;
        System.out.println("Ingrese la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();
        double operacion = (base * altura)/2;
        System.out.printf("El área del triángulo es: %s", operacion);
    }
    public static void obtenerAreaRectangulo() {
        double base;
        double altura;
        System.out.println("Ingrese la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();
        double operacion = base * altura;
        System.out.printf("El área del rectángulo es: %s", operacion);
    }
    
}
