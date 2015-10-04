package com.epam.SE1.task3;
import java.lang.Math;
/**
 * Created by Vesdet on 01.10.2015.
 */
public class Task_3 {
    public static void main(String[] args) {
        int i=0;
        double y;
        for (double x = -Math.PI; x <= Math.PI; x+=Math.PI/8) {
            y=Math.tan(2*x)-3;
            System.out.println(x+"  "+y);
        }
    }
}
