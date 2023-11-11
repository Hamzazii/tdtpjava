package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercicet3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N,x=0;
        float seuil=14;
        System.out.println("Saisir nombres etudiants");
        N= scanner.nextInt();
        float [] Tableau=new float[N];

        for (int i = 0; i < Tableau.length; i++) {
            System.out.println("Saisir les moyennes des etds du tableau");
            Tableau[i]= scanner.nextFloat();

        }
        for (int i = 0; i < Tableau.length; i++) {
            if(Tableau[i]>=seuil){
                x++;
            }
        }
        System.out.println("x="+x);












    }
}
