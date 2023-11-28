package com.tdtpjava.td3;

public class Exercice6 {
    public static void main(String[] args) {
        Disque disque = new Disque(new Point(3, 6), 5, "D1");
        Rectangle rectangle=new Rectangle(3,5,"R1");
        displayDisque(disque);
        displayRectangle(rectangle);
    }

    static void displayDisque(Disque disque) {
        System.out.println("Perimeter: "+ disque.getPerimeter() + " Air:"+ disque.getAire());
    }
    static  void displayRectangle(Rectangle  rectangle){

        System.out.println("Perimeter: "+ rectangle.getPerimeter() + " Air:"+ rectangle.getAire());

    }
}
 abstract class Figure{
     String nom;
public abstract double getPerimeter();
public abstract double getAire();

     @Override
     public String toString() {
         return "Figure{" +
                 "nom='" + nom + '\'' +
                 '}';
     }
 }
 class Disque extends Figure{
    private Point centre;
    private double rayon;

     public Disque() {
     }

     public Disque(Point centre, double rayon) {
         this.centre = centre;
         this.rayon = rayon;
     }
     public Disque(Point centre, double rayon,String nom) {
         this(centre,rayon);
         this.nom =nom;
     }

     @Override
     public double getAire() {
         return Math.PI*rayon*rayon;
     }

     @Override
     public double getPerimeter() {
         return 2*Math.PI*rayon;
     }
 }
 class Rectangle extends Figure{
    private double longueur;
    private double largeur;

     public Rectangle() {
     }

     public Rectangle(double longueur, double largeur) {
         this.longueur = longueur;
         this.largeur = largeur;
     }
     public Rectangle(double longueur, double largeur,String nom) {
         this(longueur,longueur);
         this.nom = nom;
     }

     @Override
     public double getPerimeter() {
         return 2*(longueur+longueur);
     }

     @Override
     public double getAire() {
         return longueur*longueur;
     }
 }