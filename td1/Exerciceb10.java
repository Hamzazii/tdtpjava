package com.tdtpjava.td1;

import java.util.Scanner;

public class Exerciceb10 {
    public static void main(String[] args) {
        int N;
        Scanner scanner=new Scanner(System.in);
        System.out.println("saisir N");
        N= scanner.nextInt();
        int T=N;
        int S=0;
        while (N!=0){
            S = (int) (S + Math.pow((N%10),3));
            N=N/10;
        }

        if(T==S){
            System.out.println(T+" est cubique");
        }
        else
            System.out.println(T+" n'est pas cubique ");
    }
}
