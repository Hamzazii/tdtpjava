package com.tdtpjava.td1;

import java.util.Scanner;

public class Exerciceb8 {
    public static void main(String[] args) {
        int i, j,N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir N");
        N= scanner.nextInt();

        for (i = 0; i <N-1; i++) {
            for (j = 0; j <i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        for (i = 0; i <N; i++) {
            for (j = 0; j <N-i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }




    }}