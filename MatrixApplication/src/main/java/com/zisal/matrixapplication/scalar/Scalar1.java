/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.matrixapplication.scalar;

/**
 *
 * @author Ladies Man
 */
public class Scalar1 {

    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]);
        int[][] matrix = {{1, 2, 3}, {1, 2, 3}};
        processMultiply(value, matrix);
        displayMatrix(matrix);
    }

    public static void processMultiply(int value, int[][] matrix) {
        for (int a = 0; a < 2; a++) {
            for (int b = 0; b < 3; b++) {
                matrix[a][b] = matrix[a][b] * value;
            }
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int a = 0; a < 2; a++) {
            for (int b = 0; b < 3; b++) {
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }
    }
}
