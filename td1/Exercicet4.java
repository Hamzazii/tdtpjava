package com.tdtpjava.td1;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Exercicet4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int L;
        System.out.println("Donner L");
        L=scanner.nextInt();
       int[][] T=new int[L][L];
       int[][] V=new int[L][L];
       int[][] S=new int[L][L];
        for (int i = 0; i <T.length ; i++) {
            for (int j= 0; j <T[i].length ; j++) {
                T[i][j]= scanner.nextInt();
            }
        }
        for (int i = 0; i <V.length ; i++) {
            for (int j = 0; j < V[i].length; j++) {
                V[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i <V.length ; i++) {
            for (int j = 0; j < V[i].length; j++) {
                S[i][j]=T[i][j]+V[i][j];

            }}



        for (int i = 0; i <V.length ; i++) {
            for (int j = 0; j < V[i].length; j++) {
                System.out.print(S[i][j]+"  ");

            }
            System.out.println();
        }








        }}
