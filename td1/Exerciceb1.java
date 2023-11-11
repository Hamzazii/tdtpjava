package com.tdtpjava.td1;

import java.util.Scanner;

public class Exerciceb1 {
    public static void main(String[] args) {
        int N,factN,i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir N>0");
        N = scanner.nextInt();
        while (N<=0){
            System.out.println("Donner N>0");
            N = scanner.nextInt();
        }
        i=1;
        factN=1;
        while (i<=N){
            factN=factN*i;
            i++;
        }

        System.out.print("le factoriel de " + N);
        System.out.println(" est " +factN);










}}
