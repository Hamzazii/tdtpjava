package com.tdtpjava.td2;

public class Exercice2 {
    public static void main(String[] args) {
        Point1 point1=new Point1();
        point1.setNom('a');
        point1.setX(4);
        System.out.println(point1.getX());

    }}
    class Point1{
    char nom;
    double x,y;

    public Point1(){

    }

    public char getNom() {
        return nom;
    }
    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setNom(char nom){
        this.nom=nom;
}
    public void setX(double x) {
        this.x = x;
    }
    public double norme(){
        return Math.sqrt(x*x+y*y);
    }


}
