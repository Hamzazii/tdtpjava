package com.tdtpjava.td1;

import java.util.Scanner;

public class Exerciceb9 {
    public static void main(String[] args) {
        int r,N;
        Scanner scanner=new Scanner(System.in);
        System.out.println("saisir N");
        N= scanner.nextInt();
        int T=N;
        int S=0;

        while(N!=0){
            r=N%10;
            S=r+S;
            N=N/10;
        }
        System.out.printf("la somme des nombres de " +T+ " est "+S);

    }
}
