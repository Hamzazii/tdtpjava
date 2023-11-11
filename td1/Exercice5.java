package com.tdtpjava.td1;

import java.util.Scanner;

public class Exercice5 {

        public static void main(String[] args) {

            int h;
            char choix='a';
            Scanner scanner = new Scanner(System.in);
            System.out.println("veuillez choisir la la langue a(anglais) ou f(francais)");
            h = scanner.nextInt();


            switch (choix) {

                case 'f': {
                    if (h > 0 && h <= 18)
                        System.out.println("Bonjour");
                    if (h > 18 && h <= 22)
                        System.out.println("Bonsoir");
                    if (h > 22 && h <= 24 || h == 0)
                        System.out.println("Bonne nuit");
                    break;
                }

            case 'a': {
                if (h > 0 && h <= 18)
                    System.out.println("Good morning");
                if (h > 18 && h <= 22)
                    System.out.println("Good evening");
                if (h > 22 && h <= 24 || h == 0)
                    System.out.println("Good night");
                break;
            }
        }}}