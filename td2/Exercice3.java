package com.tdtpjava.td2;

public class Exercice3 {
    public static void main(String[] args) {
        Livre livre=new Livre("boitemerveilles","ahmed",10,1940);
        System.out.println(livre.toString());
    }}
    class Livre{
    private String titre;
    private String auteur;
    private double prix;
    private int annee;
    public Livre(){

    }
    public Livre(String titre){
        this();
        this.titre=titre;
    }
    public Livre(String titre,String auteur){
        this(titre);
        this.auteur=auteur;
    }
    public Livre(String titre,String auteur,double prix){
        this(titre,auteur);
        this.prix=prix;
    }
    public Livre(String titre,String auteur,double prix,int annee){
        this(titre,auteur,prix);
        this.annee=annee;
    }
    public Livre(Livre l){
        this(l.titre,l.auteur, l.prix, l.annee);
    }
    public String getTitre(){
        return titre;
    }
    public void setTitre(String auteur){
        this.titre=titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", annee=" + annee +
                '}';
    }



}
