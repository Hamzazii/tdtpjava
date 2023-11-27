package com.tdtpjava.td3;

public class Exercice5 {
    public static void main(String[] args) {
Triporteur triporteur=new Triporteur(3,3);

    }
}
class Vehicule{
    private int nbPassager;

    public Vehicule(int n) {
        this.nbPassager = n;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "nbPassager=" + nbPassager +
                '}';
    }
}
class Moto extends Vehicule{
    private int nbRoues=2;
    public Moto(int n,int nbRoues){
        super(n);
        this.nbRoues=nbRoues;
    }
}
class Avion extends Vehicule{
    private int nbMoteur;

    public Avion(int nbP){
        super(nbP);
    }
    public Avion(int nbP, int nbM) {
        super(nbP);
        this.nbMoteur = nbM;
    }

}
class Triporteur extends Moto{

    public Triporteur(int n,int nbRoues){
        super(n,3);
    }
}