package com.tdtpjava.td3;

public class Exercice7 {
    public static void main(String[] args) {
Patron patron=new Patron("messi","leo",40);
        System.out.println(patron);
TravailleurCommission travailleurCommission=new TravailleurCommission("neymar","dasilva",45,10);
travailleurCommission.setQuantite(3);
        travailleurCommission.gains();
        System.out.println(travailleurCommission);
        TravailleurHoraire travailleurHoraire=new TravailleurHoraire("suarez","luis",35);
        travailleurHoraire.setHeures(6);
        travailleurHoraire.gains();
        System.out.println(travailleurHoraire);
    }
}
abstract class Employe{
    private String nom,prenom;

    public Employe() {
    }

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
    public abstract double gains();
}
class Patron extends Employe{
   private double salaire;

    @Override
    public double gains() {
        return salaire;
    }

    public Patron() {
    }

    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "salaire=" + salaire +
                '}';
    }
}
class TravailleurCommission extends Employe{
    private double salaire;
   private double commission;
   private int quantite;
    @Override
    public double gains() {
        return salaire=(commission*quantite)+salaire;
    }

    public TravailleurCommission() {
    }

    public TravailleurCommission(String nom, String prenom, double salaire,double commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission=commission;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "TravailleurCommission{" +
                "salaire=" + salaire +
                ", commission=" + commission +
                ", quantite=" + quantite +
                '}';
    }
}
class TravailleurHoraire extends Employe{
    private double retribution;
    private int heures;

    public TravailleurHoraire() {
    }

    @Override
    public double gains() {
        return retribution=retribution*heures;
    }

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
    }

    public double getRetribution() {
        return retribution;
    }

    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    @Override
    public String toString() {
        return "TravailleurHoraire{" +
                "retribution=" + retribution +
                ", heures=" + heures +
                '}';
    }
}