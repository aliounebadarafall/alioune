/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author hp
 */
public abstract class Compte {
    //proprietes
    private static int cpt;
    
    private int id;
    protected String numero;
    protected double solde;
    protected Date createAt;
    
    //propietes de navigation
    protected Client client;
    
    //methodes
    
    //constructeurs

    public Compte() {
            cpt++;
            id=cpt;
    }
    //getters

    public static int getCpt() {
        return cpt;
    }
    
    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public Client getClient() {
        return client;
    }
    // setters

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    //methodes metier
    public abstract void depot (double montant);
    public abstract void retrait (double montant);
    public abstract void virement (Compte compteDepot, double montant);

    @Override
    public String toString() {
        return "Compte{" + "id=" + id + ", numero=" + numero + ", solde=" + solde + ", createAt=" + createAt + ", client=" + client + '}';
    }
    
    
    
}
