package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args){
        double moy;
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez entrer la moyenne");
        moy = scanner.nextDouble();

        if(moy>=10 && moy<12){
            System.out.println("Passable");
        }
        if(moy>=12 && moy<14){
            System.out.println("A.Bien");
        }
        if(moy>=14 && moy<16){
            System.out.println("Bien");
        }
        if(moy>=16){
            System.out.println("T.Bien");
        }



    }
}
