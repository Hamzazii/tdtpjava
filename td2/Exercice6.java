package com.tdtpjava.td2;

public class Exercice6 {
    public static void main(String[] args) {
 Banque banque=new Banque(1,500,"W123");
        System.out.println(banque);
       banque.retirer(600);
        System.out.println(banque);
    }
}
class Banque{
    int NCompte;
     float Solde;
     String CIN;

    public Banque(int NCompte, float solde, String CIN) {
        this.NCompte = NCompte;
        Solde = solde;
        this.CIN = CIN;
    }
    void deposer(float Somme){
       this.Solde+=Somme;
    }
    void retirer(float Somme){
        if(Solde>=Somme)
            this.Solde-=Somme;


    }

    public String toString() {
        return "Banque{" +
                "NCompte=" + NCompte +
                ", Solde=" + Solde +
                ", CIN='" + CIN + '\'' +
                '}';
    }

}