package com.tdtpjava.td2;

public class Exercice5 {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(2,2);
        System.out.println(rectangle);

        /*System.out.println(rectangle.perimetre());
        System.out.println(rectangle.isCarre());
        System.out.println(rectangle.toString());*/
    }
}

    class Rectangle{
    private int longueur;
    private int largeur;
    public Rectangle() {

    }
    public Rectangle(int longueur) {
        this.longueur = longueur;    }

   public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
public Rectangle(Rectangle r){
        this(r.getLongueur(), r.getLargeur());
}
    public int getLongueur() {
        return largeur;
    }


    public void setLongueur(int longueur) {
        if(longueur>=0)
        this.longueur = longueur;
        else
         this.longueur=0;
    }

    public int getLargeur() {

        return largeur;
    }

    public void setLargeur(int largeur) {
        if(largeur>=0)
        this.largeur = largeur;
        this.largeur=0;
    }
    public int perimetre(){

        return 2*(longueur+largeur);
    }
    public int aire(){
        return longueur*largeur;
    }
    public boolean isCarre(){
        return largeur==longueur;
}

        @Override
        public String toString() {
            return "Rectangle{" +
                    "longueur=" + longueur +
                    ", largeur=" + largeur +
                    ",isCarre=" +(isCarre() ? "Oui" : "Non")+
                    '}';
        }
    }
