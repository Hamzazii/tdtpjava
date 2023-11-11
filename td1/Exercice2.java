package com.tdtpjava.td1;

import java.util.Scanner;

import static java.lang.Math.*;

public class Exercice2 {
    public static void main(String[] args){

float a,b,c,D;
float x,x1,x2;
Scanner scanner=new Scanner(System.in);
        System.out.println("veuillez entrer les valeurs de a,b et c");
       a=scanner.nextFloat();
       b= scanner.nextFloat();
       c= scanner.nextFloat();

       if(a==0){if(b==0){if(c==0) System.out.println("tout x est solution");

                         else System.out.println("ensemble vide"); }

                 else {
                     if(c==0) System.out.println("x1=0");
                     else
                     System.out.println("x1="+ -c/b);
       }}


       else{
           D=b*b-4*a*c;
       if(D>0){
           System.out.println("Il y a deux solutions reels");
           System.out.println("x1="+ (-b+sqrt(D))/2*a);
           System.out.println("x2="+ (-b-sqrt(D))/2*a);
       }

      else if(D==0){
           System.out.println("Il y a une solution reel");
           System.out.println("x="+ -b/2*a);
       }

      else{
           System.out.println("Il y a deux solutions complexes");
           System.out.print("x1="+ -b/2*a);
           System.out.println("+i"+ Math.sqrt(Math.abs(D))/2*a);
           System.out.print("x2="+ -b/2*a);
           System.out.println("-i"+ Math.sqrt(Math.abs(D))/2*a);
       }
       }










    }
}
