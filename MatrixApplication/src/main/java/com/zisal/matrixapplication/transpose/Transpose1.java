/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.matrixapplication.transpose;

import java.util.Scanner;

/**
 *
 * @author Ladies Man
 */
public class Transpose1 {

    private static Scanner scan;

    public static void main(String[] args) {
        int bar = Integer.parseInt(args[0]);
        int kol = Integer.parseInt(args[1]);

        scan = new Scanner(System.in);

        int[][] initMatrix = createInitMatrix(bar, kol);
        int[][] transposedMatrix = doTranspose(initMatrix, bar, kol);
        System.out.println("Origin Matrix is :");
        displayMatrix(initMatrix, bar, kol);
        System.out.println("Transposed Matrix is :");
        displayMatrix(transposedMatrix, kol, bar);
    }

    public static int[][] createInitMatrix(int bar, int kol) {
        int[][] result = new int[bar][kol];
        for (int a = 0; a < bar; a++) {
            for (int b = 0; b < kol; b++) {
                System.out.print("input index [" + a + "," + b + "] =");
                result[a][b] = scan.nextInt();
            }
        }
        return result;
    }

    public static int[][] doTranspose(int[][] matrix, int bar, int kol) {
        int[][] result = new int[kol][bar];
        for (int a = 0; a < bar; a++) {
            for (int b = 0; b < kol; b++) {
                result[b][a] = matrix[a][b];
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix, int bar, int kol) {
        for (int a = 0; a < bar; a++) {
            for (int b = 0; b < kol; b++) {
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }
    }
}
