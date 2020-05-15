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
public class CompteEpargne extends Compte {
    
    private final double TAUX=0.15;

    public CompteEpargne() {
    }

    public double getTAUX() {
        return TAUX;
    }
    
    private Date DateDeblocage;

    public CompteEpargne(Date DateDeblocage) {
        this.DateDeblocage = DateDeblocage;
    }

    public Date getDateDeblocage() {
        return DateDeblocage;
    }
    
    
    

   

    

    @Override
    public void depot(double montant) {
        double montantDepot;
            montantDepot = montant + TAUX*montant;
            solde = solde + montantDepot; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void retrait(double montant) {
        Date today = new Date();// Create a date object
         if(today.compareTo(DateDeblocage) >= 0 ){
             solde = solde - montant; 
         } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void virement(Compte compteDepot, double montant) {
        
         //To change body of generated methods, choose Tools | Templates.
    }
    
}
