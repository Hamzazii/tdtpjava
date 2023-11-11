package com.tdtpjava.td1;

import java.util.Scanner;

public class Exerciceb4 {
    public static void main(String[] args) {
        int a,b,r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir a>0 et b>0");
        a=scanner.nextInt();
        b=scanner.nextInt();
        while(a<=0 || b<0){
            System.out.println("Saisir a>0 et b>0");
            a=scanner.nextInt();
            b=scanner.nextInt();
        }
       while((r=a%b)!=0){
           a=b;
           b=r;
       }
        System.out.println("le pgcd est "+b);
}}
