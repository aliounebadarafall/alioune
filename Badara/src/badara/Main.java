/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badara;

import entities.Client;
import entities.CompteCheque;
import entities.CompteEpargne;
import java.util.Date;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Client cl1=new Client();
        cl1.setNom("Diop");
        cl1.setPrenom("Moussa");
        
        System.out.println(cl1.getId()+" "+cl1.getNom()+" "+cl1.getPrenom());
        // TODO code application logic here
        
        Client cl2=new Client("Diop","Moussa");
       
        System.out.println(cl2.toString());    
    
        
        CompteCheque c1=new CompteCheque();
        c1.setClient(cl2);
        c1.setSolde(2000);
        c1.setNumero("0000");
        c1.setCreateAt(new Date());
        
        System.out.println(c1.toString());
        
                c1.depot(1000);
        System.out.println(c1.toString());
                c1.retrait(1000);
        System.out.println(c1.toString());
        
        
        CompteEpargne ce1=new CompteEpargne();
        ce1.setClient(cl2);
        ce1.setSolde(10000);
        ce1.setNumero("00001");
        ce1.setCreateAt(new Date());
                
        System.out.println(c1.toString());
        
            c1.depot(10000);
        System.out.println(c1.toString());
                c1.retrait(10000);
        System.out.println(c1.toString());
    }
    
}
