package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercicet5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        char temp;
        System.out.println("Saisir dimension du tableau");
        N= scanner.nextInt();
        char [] Tableau=new char[N];

        for (int i = 0; i <Tableau.length; i++) {
            System.out.println("Saisir les elements du tableau");
            Tableau[i]= scanner.next().charAt(0);

        }
        //Avant décalage
        for (int i = 0; i <Tableau.length; i++) {
            System.out.print(Tableau[i]+" ");

        }
        System.out.println();

        temp=Tableau[0];
        for (int i = 0; i <Tableau.length-1; i++) {
            Tableau[i]=Tableau[i+1];

        }
        Tableau[Tableau.length-1]=temp;
        //Après décalage
        for (int i = 0; i <Tableau.length; i++) {
            System.out.print(Tableau[i]+" ");

        }












    }
}
