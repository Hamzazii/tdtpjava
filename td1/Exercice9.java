package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir les de a et b");
        a = scanner.nextInt();
        b = scanner.nextInt();
        if(a<b){
            System.out.println(a+"<"+b);
        }
        else if(a>b){
            System.out.println(b+"<"+a);
        }
        else System.out.println("EGAUX");
}}
