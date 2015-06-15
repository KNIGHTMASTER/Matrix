/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.matrixapplication.determinan;

/**
 *
 * @author Ladies Man
 */
public class Determinan1 {

    public static void main(String[] args) {
        int ordo = Integer.parseInt(args[0]);
        System.out.println("Ordo = " + ordo);
        int[][] matrix;
        if (ordo == 2) {
            matrix = new int[2][2];
        } else if (ordo == 3) {
            matrix = new int[3][3];
        } else {
            System.out.println("Can not get Determinan value from ordo " + ordo);
        }
    }
}
