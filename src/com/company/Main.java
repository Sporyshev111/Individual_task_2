package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    double f, z, a, b, c, x;
        System.out.println("Введите а: ");
    a = scanner.nextDouble();
        System.out.println("Введите b: ");
    b = scanner.nextDouble();
        System.out.println("Введите c: ");
    c = scanner.nextDouble();
        System.out.println("Введите x: ");
    x = scanner.nextDouble();
    if (a + x*x >= 0 && b!=0 && b>x )
    {
        f = Math.log(a + x*x);
        f += Math.sin(x/b) * Math.sin(x/b);
        boolean isNun = Double.isNaN(f);
        if(isNun)
        {
            System.out.println("Ответ первого примера: решений нет.");

        }
        else {
            System.out.println("Ответ первого примера:" + f);
        }
    }
    else {
        System.out.println("Значеня не входят в ОДЗ");
    }
    if(x+a >= 0 && Math.abs(a-b)>=0 )
    {
 z = Math.pow(Math.E,-(c*x) );
 z *= (x+Math.sqrt(x+a))/(x-Math.abs(Math.sqrt(x-b)));
 boolean IsNun = Double.isNaN(z);
 if (IsNun)
 {
     System.out.println("Ответ второго примера: решений нет.");
 }
 else {
     System.out.println("Ответ второго примера:" + z);
 }


    }
    else {
        System.out.println("Значеня не входят в ОДЗ");
    }


    }
}
