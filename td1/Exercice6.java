package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercice6 {

        public static void main(String[] args) {

            int A,B;
            Scanner scanner = new Scanner(System.in);
            System.out.println("veuillez entere les valeurs de A et B");
            A= scanner.nextInt();
            B= scanner.nextInt();
            if((A>0 && B>0) || (A<0 && B<0))
            {System.out.println("le signe du produit de A et B est positive");}
            if((A>0 && B<0) || (A<0 && B>0)){
                    System.out.println("le signe du produit de A et B est negative");
                }
        }
}
