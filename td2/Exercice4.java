package com.tdtpjava.td2;

public class Exercice4 {
    public static void main(String[] args) {
        Temps temps = new Temps(13, 15, 40);
        System.out.println(temps.toString());
        temps.ajouterSecondes(30);
        System.out.println(temps.toString());

    }
}
    class Temps{
    int heures;
    int minutes;
    int secondes;
    public Temps(){

    }

    public Temps(int heures) {
        this.heures = heures;
    }

    public Temps(int heures, int minutes) {
        this.heures = heures;
        this.minutes = minutes;
    }

    public Temps(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }
    public Temps(Temps t){
        this(t.getHeures(),t.getMinutes(), t.getSecondes());
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }

    public void ajouterHeures(int heures){
    this.setHeures(getHeures()+heures);
    }
    public void ajouterMinutes(int minutes){
      minutes=getMinutes()+minutes;
      ajouterHeures(minutes/60);
      this.setMinutes(minutes%60);
    }
    public void ajouterSecondes(int secondes){
       secondes+=getSecondes();
       ajouterMinutes(secondes/60);
       this.setSecondes(secondes%60);
    }

    @Override
    public String toString() {
        return "Temps{" +
                "heures=" + heures +
                ", minutes=" + minutes +
                ", secondes=" + secondes +
                '}';
    }






}
