/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        int[][] z = suma(informacion, informacion2);

        for (int i = 0; i < z.length; i++) {
            for (int c = 0; c < z[i].length; c++) {
                System.out.printf("%s\t", z[i][c]);
            }
            System.out.println();

        }

    }

    public static int[][] suma(int[][] a, int[][] b) {
        int[][] suma = new int[3][3];
        for (int i = 0; i < a.length; i++) {

            for (int c = 0; c < a[i].length; c++) {

                int v = a[i][c];
                int u = b[i][c];
                suma[i][c] = v + u;
            }

        }
        return suma;
    }

}
