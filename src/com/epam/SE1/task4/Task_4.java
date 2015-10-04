package com.epam.SE1.task4;
/**
 * Created by Vesdet on 01.10.2015.
 */
public class Task_4 {
    public static void main(String[] args) {
        int[] a= {5, 10, -25, -1, 71, 42, 12, -4};
        int n = a.length-1;
        int max = a[0]+a[n];
        for (int i = 0; i < a.length/2; i++) {
            if (max<(a[i]+a[n-i])) max=a[i]+a[n-i];
        }
        System.out.println("MAX=" + max);
    }
}
