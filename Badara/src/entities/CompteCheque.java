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
public class CompteCheque extends Compte{
    private final double FRAIS=200;

    public CompteCheque() {
    }

    public double getFRAIS() {
        return FRAIS;
    }
    

    
    
    
    
    @Override
    public void depot(double montant) {
        solde=solde+montant-FRAIS;
    }

    @Override
    public void retrait(double montant) {
       if(solde>=montant+FRAIS)
        solde=solde-montant-FRAIS;
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void virement(Compte compteDepot, double montant) {
        this.retrait(montant);
        compteDepot.depot(montant);
//To change body of generated methods, choose Tools | Templates.
    }
    
}
