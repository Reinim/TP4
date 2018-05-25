/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.*;

/**
 *
 * @author riccardild
 */
public class Controleur {
    Portefeuille monPortefeuille = new Portefeuille();
    // Ici affichage onsole et controle des fonctionalités
    public void init() throws FondExistant, InstrumentInexistant, FondInexistant {
        
          
        try {
            monPortefeuille.ajouterFondInstrument("YOLO", new Fonds(9700));
        } catch (InstrumentExistant ex) {
            
        }
        
       // System.out.println(monPortefeuille.rechercheInstrument("YOLO"));
                
       // System.out.println(monPortefeuille.rechercheFonds("YOLO"));
    }
     void afficherInstrument()
    {
        System.out.println("");
    }
}
