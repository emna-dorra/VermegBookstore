/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mybookstore;

import java.sql.Date;


public class Livre {
    
    String titre;
    String auteur;
    double prix;
    Date date_sortie;
    
    
    public Livre()  {
        this.titre = null;
        this.auteur = null;
        this.prix = 0;
        this.date_sortie =null;
    }


    public Livre(String titre, String auteur, double prix, Date date_sortie) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.date_sortie = date_sortie;
    }
    

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
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

    public Date getDate_sortie() {
        return date_sortie;
    }

    public void setDate_sortie(Date date_sortie) {
        this.date_sortie = date_sortie;
    }

    @Override
    public String toString() {
        return "Livre{" + "titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + ", date_sortie=" + date_sortie + '}';
    }  
    
}
