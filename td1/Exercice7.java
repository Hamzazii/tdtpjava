package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        int N, o1, o2, o3;
        int N1,N2,N3,N4,N5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier de trois chiffres non nul");
        N = scanner.nextInt();
        if (N >= 100 && N <= 999) {
            //427
            o1 = N / 100;//4
            o2 = (N % 100) / 10;//2
            o3 = N % 10;//7

            if (o1!= 0 && o2!= 0 && o3!= 0) {
                N1 =o1*100+o3*10+o2;
                N2 =o2*100+o3*10+o1;
                N3 =o2*100+o1*10+o3;
                N4 =o3*100+o2*10+o1;
                N5 =o3*100+o1*10+o2;
                System.out.println("N="+N);
                System.out.println("N1="+N1);
                System.out.println("N2="+N2);
                System.out.println("N3="+N3);
                System.out.println("N4="+N4);
                System.out.println("N5="+N5);

            }

            else{
                System.out.println("il y a un nombre nul");
            }
        }

        else {
            System.out.println("donner un entier de trois chiffres");
        }










                                     }
}