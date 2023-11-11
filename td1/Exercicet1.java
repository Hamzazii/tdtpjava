package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercicet1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.println("Saisir dimension du tableau");
        N= scanner.nextInt();
        int [] Tableau=new int[N];
        int min,max;

        for (int i = 0; i <Tableau.length; i++) {
            System.out.println("Saisir les elements du tableau");
            Tableau[i]= scanner.nextInt();

        }
         min=Tableau[0];
         max=Tableau[0];
        for (int i = 1; i <Tableau.length; i++) {
            if (max<Tableau[i]){
                max=Tableau[i];
            }
            if (min>Tableau[i]){
                min=Tableau[i];
            }
        }

        System.out.println("max="+max);
        System.out.println("min="+min);















    }

    }

