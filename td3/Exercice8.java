package com.tdtpjava.td3;

public interface Exercice8 {
    public static void main(String[] args) {
        Patronn patronn=new Patronn("messi","leo",40);
        System.out.println(patronn);
        TravailleurCommissionn travailleurCommissionn=new TravailleurCommissionn("neymar","dasilva",45,10);
        travailleurCommissionn.setQuantite(3);
        travailleurCommissionn.gains();
        System.out.println(travailleurCommissionn);
        TravailleurHorairee travailleurHorairee=new TravailleurHorairee("suarez","luis",35);
        travailleurHorairee.setHeures(6);
        travailleurHorairee.gains();
        System.out.println(travailleurHorairee);
    }
}
interface ActionEmploye{
    public double gains();
}
 class Employee{
    private String nom,prenom;

    public Employee() {
    }

    public Employee(String nom, String prenom) {
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

}
class Patronn extends Employe implements ActionEmploye{
    private double salaire;

    @Override
    public double gains() {
        return salaire;
    }

    public Patronn() {
    }

    public Patronn(String nom, String prenom, double salaire) {
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
class TravailleurCommissionn extends Employe implements ActionEmploye{
    private double salaire;
    private double commission;
    private int quantite;
    @Override
    public double gains() {
        return salaire=(commission*quantite)+salaire;
    }

    public TravailleurCommissionn() {
    }

    public TravailleurCommissionn(String nom, String prenom, double salaire,double commission) {
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
class TravailleurHorairee extends Employe implements ActionEmploye{
    private double retribution;
    private int heures;

    public TravailleurHorairee() {
    }

    @Override
    public double gains() {
        return retribution=retribution*heures;
    }

    public TravailleurHorairee(String nom, String prenom, double retribution) {
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