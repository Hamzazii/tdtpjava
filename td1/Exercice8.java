package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        int m,annee;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir le numéro du mois");
        m = scanner.nextInt();

        if (m == 1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
            System.out.println("le nombre de jours de ce mois est 31 ");
        }
        if (m ==4 || m==6 || m==9 || m==11) {
            System.out.println("le nombre de jours de ce mois est 30 ");
        }
        if(m==2){
            System.out.println("Saisir annee");
            annee=scanner.nextInt();
            if(annee>=1900 && annee<=2100) {
                if ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0) {
                    System.out.println("le nombre de jours de ce mois est 29 ");
                } else {
                    System.out.println("le nombre de jours de ce mois est 28 ");
                }
            }
            else{
                    System.out.println("L’Année saisie doit être compris entre 1900 et 2100");
                }



        }

    }
    }
