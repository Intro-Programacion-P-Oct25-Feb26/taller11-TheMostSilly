/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] casas = viviendas();
        double[][] meses = consumoElectrico();
        double[] anual = sumaConsumo(meses);
        reporteFinal(casas, anual);
    }

    public static String[] viviendas() {
        Scanner entrada = new Scanner(System.in);
        String[] casa = new String[10];

        for (int i = 0; i < casa.length; i++) {
            System.out.println("Ingrese el nombre de la vivienda");
            casa[i] = entrada.nextLine();

        }
        return casa;
    }

    public static double[][] consumoElectrico() {
        Scanner entrada = new Scanner(System.in);
        double[][] meses = new double[10][12];

        for (int f = 0; f < meses.length; f++) {
            for (int c = 0; c < meses[f].length; c++) {
                System.out.println("Ingrese el consumo de la vivienda");
                meses[f][c] = entrada.nextDouble();

            }
        }
        return meses;

    }

    public static double[] sumaConsumo(double[][] m) {
        double[] anual = new double[10];

        for (int i = 0; i < m.length; i++) {
            double suma = 0;
            for (int c = 0; c < m[i].length; c++) {
                suma += m[i][c];

            }
            anual[i] = suma;

        }
        return anual;

    }

    public static void reporteFinal(String[]a, double[]b) {
        for (int i = 0; i < a.length; i++){
            System.out.printf("La vivienda %s tiene un consumo anual de:"
                    + " %s", a[i], b[i]);
        }

    }

}
