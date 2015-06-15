/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.matrixapplication.nol;

/**
 *
 * @author Ladies Man
 */
public class Nol1 {

    private static int[][] matrix;

    public static void main(String[] args) {
        int bar = Integer.parseInt(args[0]);
        int kol = Integer.parseInt(args[1]);
        matrix = new int[bar][kol];
        inputValueMatrix(bar, kol);
        displayMatrix(bar, kol);
    }

    public static void inputValueMatrix(int bar, int kol) {
        for (int a = 0; a < bar; a++) {
            for (int b = 0; b < kol; b++) {
                matrix[a][b] = 0;
            }
        }
    }

    public static void displayMatrix(int bar, int kol) {
        for (int a = 0; a < bar; a++) {
            for (int b = 0; b < bar; b++) {
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }
    }
}
