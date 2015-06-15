/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.matrixapplication.segitiga;

import java.util.Random;

/**
 *
 * @author Ladies Man
 */
public class SegitigaAtas1 {

    public static void main(String[] args) {
        int ordo = Integer.parseInt(args[0]);
        int[][] matrix = createMatrix(ordo);
        displayMatrix(matrix, ordo);
    }

    public static int[][] createMatrix(int ordo) {
        int[][] result = new int[ordo][ordo];
        for (int a = 0; a < ordo; a++) {
            for (int b = 0; b < ordo; b++) {
                if ((a < b)) {
                    result[a][b] = 0;
                } else {
                    result[a][b] = new Random().nextInt(9) + 1;
                }
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix, int ordo) {
        for (int a = 0; a < ordo; a++) {
            for (int b = 0; b < ordo; b++) {
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }
    }
}
