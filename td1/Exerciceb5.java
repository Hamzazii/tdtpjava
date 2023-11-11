package com.tdtpjava.td1;

import java.util.Scanner;

public class Exerciceb5 {
    public static void main(String[] args) {
        int w=0, v=1,u=1,i;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir n>0");
        n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("Saisir n>0");
            n = scanner.nextInt();

        }
        for (i = 2; i <= n; i++) {
            w = u + v;
            u = v;
            v = w;
        }
        System.out.print("le terme  " + n);
        System.out.println(" de la suite est "+w);
    }
}