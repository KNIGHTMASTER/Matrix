/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.matrixapplication.statis;

/**
 *
 * @author Ladies Man
 */
public class Statis1 {

    public static void main(String[] args) {
        String matrix[][] = {{"a", "b"}, {"a", "b"}, {"a", "b"}};
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 2; b++) {
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }
    }
}
