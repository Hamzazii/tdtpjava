package com.tdtpjava.td3;

public class Exercice3 {
    public static void main(String[] args) {
Centre centre=new Centre(3,5,'o');
centre.affCoordNOM();
Cercle cercle=new Cercle(3,7, centre.nom);
cercle.affCoordNOM();
    }
}
class PointC{
    public PointC(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void affiche(){
        System.out.println("Coordonnees : " + x + " " + y);
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    private int x, y;
}
class Centre extends PointC{
    char nom;
    public Centre(int x,int y,char nom){
           super(x,y);
           this.nom=nom;
    }
    public void affNom(){
        System.out.println("le nom est:"+nom);
    }
    public void affCoordNOM() {
        System.out.println("Coordonnees de " + nom + " : " + "(" + getX() + "," + getY() + ")");
    }
}
class Cercle extends Centre{
    public Cercle(int x,int y,char nom){
        super(x,y,nom);
    }
}