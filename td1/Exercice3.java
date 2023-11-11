package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {

        int a, b;
        int choix;
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez entrer les valeurs de a,b et choix");
        a = scanner.nextInt();
        b = scanner.nextInt();
        choix = scanner.nextInt();

        switch(choix){

            case 1:{
                if(a%2==0 && b%2==0)
                    System.out.println("la somme a+b est paire");
                if(a%2!=0 && b%2!=0)
                    System.out.println("la somme a+b est paire");
                break;
            }
            case 2:{
                if(a%2==0 && b%2==0)
                    System.out.println("le produit a*b est paire");
                if((a%2==0 && b%2!=0) || (a%2!=0 && b%2==0))
                    System.out.println("le produit a*b est paire");
                break;
            }
            case 3:{
                if(a>0 && b>0)
                    System.out.println("le signe de a+b est positive");
                if(a<0 && b<0)
                    System.out.println("le signe de a+b est negative");
                if(a>0 && b<0 && Math.abs(a)>Math.abs(b))
                    System.out.println("le signe de a+b est positive");
                if(a>0 && b<0 && Math.abs(a)<Math.abs(b))
                    System.out.println("le signe de a+b est negative");
                if(a<0 && b>0 && Math.abs(a)>Math.abs(b) )
                    System.out.println("le signe de a+b est negative");
                if(a<0 && b>0 && Math.abs(a)<Math.abs(b) )
                    System.out.println("le signe de a+b est positive");
                break;
            }
            case 4:{
                if(a>0 && b>0)
                    System.out.println("le signe de a*b est positive");
                if(a<0 && b<0)
                    System.out.println("le signe de a+b est positive");
                if(a>0 && b<0)
                    System.out.println("le signe de a+b est negative");
                if(a<0 && b>0)
                    System.out.println("le signe de a+b est negative");
                break;
            }










        }
















    }
}