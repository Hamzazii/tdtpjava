package com.tdtpjava.td3;

public class Exercice2 {
    public static void main(String[] args) {
PointNom pointNom=new PointNom(1,2,'A');
pointNom.affCoordNOM();
    }
}
class PointB{
    public PointB(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy){
        x += dx;
        y += dy;
    }
    public void affCoord(){
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
class PointNom extends PointB{
    char nom;
    public PointNom(int x,int y,char nom){
        super(x,y);
        this.nom=nom;
    }

    public void affCoordNOM(){
        System.out.println("Coordonnees de "+nom+" : "+"(" + getX() + "," + getY()+")");
    }

}