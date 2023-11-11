package com.tdtpjava.td1;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Exerciceb3 {
    public static void main(String[] args) {
        int N, i, max = Integer.MIN_VALUE,imax=0;
        Scanner scanner = new Scanner(System.in);
        /*
        for (i = 1; i <= 5; i++) {
            System.out.println("Saisir le Nombre numero"+i);
            N = scanner.nextInt();
            if(N>max){
                max=N;
            }

        }
        System.out.println("max="+max);
        */

       /* for (i = 1; i <= 5; i++) {
            System.out.println("Saisir le Nombre numero"+i);
            N = scanner.nextInt();
            if(N>max){
                max=N;
                imax=i;
            }

        }
        System.out.println("max="+max);
        System.out.println("imax="+imax);
*/
        for (i = 1; i <= 5; i++) {
            System.out.println("Saisir le Nombre numero"+i);
            N = scanner.nextInt();
            if(N>max && N%10==0){
                max=N;
                imax=i;
            }

        }
        System.out.println("max="+max);
        System.out.println("imax="+imax);






    }
}