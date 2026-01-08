/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        String nombre;
        String cedula;
        System.out.println("Ingrese la opción 1 = valor planilla de luz, 2 = "
                + "valor del predio");
        opcion = entrada.nextInt();
        entrada.nextLine();

        if (opcion == 1) {
            System.out.println("Ingrese el nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la cédula");
            cedula = entrada.nextLine();
            calcularValorLuz(nombre, cedula);
        } else if (opcion == 2) {
            System.out.println("Ingrese el nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la cédula");
            cedula = entrada.nextLine();
            calcularPredio(nombre, cedula);

        } else {
            System.out.println("Ingresar una opción válida");
        }

    }

    public static void calcularValorLuz(String a, String b) {
        double valorKilo;
        double numeroKilos;
        double valorTotal;
        System.out.println("Ingrese el valor de Kilovatio");
        valorKilo = entrada.nextDouble();
        System.out.println("Ingrese el número de Kilovatios");
        numeroKilos = entrada.nextDouble();
        valorTotal = valorKilo * numeroKilos;
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de"
                + " %.2f", a, b, valorTotal);

    }

    public static void calcularPredio(String a, String b) {
        double valorInmueble;
        double valorPredio;
        System.out.println("Ingrese el valor del inmueble");
        valorInmueble = entrada.nextDouble();
        valorPredio = valorInmueble * 0.02;
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble"
                + " valorado en %.2f y tiene que pagar de predio %.2f", a, b,
                valorInmueble, valorPredio);

    }
}
