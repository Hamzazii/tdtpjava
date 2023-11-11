package com.tdtpjava.td1;

import java.util.Scanner;

public class Exerciceb2 {
    public static void main(String[] args) {
        int N,i,S=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir N");
        N = scanner.nextInt();
        for (i=1;i<N;i=i+2){
                S=S+i;
            }
                                     /* 2eme methode:
                                     for (i=0;i<N;i++){
                                             if(i%2!=0){
                                              S=S+i;
                                                  }
                                              }
                                             */


        System.out.print("la somme des entiers impairs inférieurs à "+N);
        System.out.println(" est " +S);

        }
}
