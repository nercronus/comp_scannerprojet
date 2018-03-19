package joueurscanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Formation
 */
public class Joueur {
    
   private String nom;
   private String prenom;
   private int age;
   private String pseudo;
   private String mdp;
   private String genre;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Joueur(String nom, String prenom, int age, String pseudo, String mdp, String genre) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.pseudo = pseudo;
        this.mdp = mdp;
        this.genre = genre;
    }
    
    public Joueur() {
        nom = "";
        prenom = "";
        age = 0;
        mdp = "";
        genre = "";
    }
    
}
