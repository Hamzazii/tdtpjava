package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercicet2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N,i;
        System.out.println("Saisir N");
        N= scanner.nextInt();
        int [] Tableau=new int[100];
        i=0;
        while(N!=0){
            Tableau[i]=N%2;
            N=N/2;
            i++;
        }
        for (int j=i-1; j >=0 ; j--) {
            System.out.print(Tableau[j]);
            
        }
        
        
    }
}
