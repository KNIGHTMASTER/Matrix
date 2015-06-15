/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.matrixapplication.ordo;

import java.util.Scanner;

/**
 *
 * @author Ladies Man
 */
public class Ordo1 {

    private static Scanner scan;

    private static int[][] matrix;

    public static void main(String[] args) {
        int ordo = Integer.parseInt(args[0]);
        matrix = new int[ordo][ordo];
        inputValueMatrix(ordo, ordo);
        displayMatrix(ordo, ordo);
    }

    public static void inputValueMatrix(int bar, int kol) {
        scan = new Scanner(System.in);
        for (int a = 0; a < bar; a++) {
            for (int b = 0; b < kol; b++) {
                System.out.print("input index [" + a + "," + b + "] =");
                matrix[a][b] = scan.nextInt();
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
