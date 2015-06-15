/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.matrixapplication.simetris;

import java.util.Random;

/**
 *
 * @author Ladies Man
 */
public class Simetris1 {

    public static void main(String[] args) {
        int ordo = Integer.valueOf(args[0]);
        int[][] matrix = createMatrixSimetris(ordo);
        displayMatriSimetris(matrix, ordo);
    }

    public static int[][] createMatrixSimetris(int ordo) {
        int[][] result = new int[ordo][ordo];
        for (int a = 0; a < ordo; a++) {
            for (int b = 0; b < ordo; b++) {
                result[a][b] = new Random().nextInt(9) + 1;
            }
        }
        return result;
    }

    public static void displayMatriSimetris(int[][] matrix, int ordo) {
        for (int a = 0; a < ordo; a++) {
            for (int b = 0; b < ordo; b++) {
                System.out.print(matrix[a][b] + "  ");
            }
            System.out.println("");
        }
    }
}
