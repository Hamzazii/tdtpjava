package com.tdtpjava.td2;

public class Exercice1 {

    public static void main(String[] args) {
        Point point = new Point('a', 3);
        point.affiche();
        point.translate(4);
        point.affiche();
    }
}
    class Point{

    private char nom;
    private double x;
    public Point(char nom,double x){
        this.nom=nom;
        this.x=x;
    }
    public void affiche(){

        System.out.println("l'abssice de " +nom+" est " +x);

    }
    public double translate(double dx){
        return x+=dx;
    }




   }