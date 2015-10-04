package com.epam.SE1.task5;
import java.util.Scanner;

/**
 * Created by Vesdet on 01.10.2015.
 */
public class Task_5 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = (int)in.nextDouble();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            a[i][i] = 1; a[i][n-1-i] = 1;
            for (int j = 0; j < n ; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
