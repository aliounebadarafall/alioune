/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author hp
 */
public class Client {
    //proprietes
    
    private int id;
    private String nom;
    private String prenom;
    private static int cpt;
    
    //methodes
    
    //constructeurs

    
    public Client() {
        id=++cpt;
    }
    public Client(String nom, String prenom) {
        id=++cpt;
        this.nom=nom;
        this.prenom = prenom;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public static int getCpt() {
        return cpt;
    }
    
    //setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    
}
