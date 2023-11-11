package com.tdtpjava.td1;
import java.util.Scanner;
public class Exercice1 {
        public static void main(String[] args){
        int a;
        int b;
        int c;
        int max;

            Scanner scanner=new Scanner(System.in);
            System.out.print("veuillez saisir les valeurs de a, b et c");
            a=scanner.nextInt();
            b=scanner.nextInt();
            c=scanner.nextInt();
            max=a;
            if(b>a)
                max=b;

            if(c>max)
                max=c;

            System.out.println("le max est " + max);













        }
}
