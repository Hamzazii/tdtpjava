package com.tdtpjava.td3;

public class Exercice4 {
    public static void main(String[] args) {
Immeuble immeuble=new Immeuble("Smaala",19);
        System.out.println(immeuble);
        Batiment batiment=new Maison("somwhere",5);
        System.out.println(batiment);
        immeuble.setAdresse("oblock");
        System.out.println(immeuble.getAdresse());
    }
}
class Batiment{
    private String adresse;
    public Batiment(){

    }
    public Batiment(String adresse){
        this.adresse=adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Batiment{" +
                "adresse='" + adresse + '\'' +
                '}';
    }
}
class Maison extends Batiment{
    private int nbChambres;
    public Maison(){

    }
    public Maison(String adresse,int nbChambres){
        super(adresse);
        this.nbChambres=nbChambres;
    }

    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "nbChambres=" + nbChambres +
                '}';
    }
}
class Immeuble extends Batiment{
    private int nbAppart;
    public Immeuble(){

    }

    public Immeuble(String adresse, int nbAppart) {
        super(adresse);
        this.nbAppart = nbAppart;
    }

    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        return "Immeuble{" +
                "nbAppart=" + nbAppart +
                '}';
    }
}