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
        
        
        monPortefeuille.ajouterFondInstrument("YOLO", new Fonds(8700));
        monPortefeuille.ajouterFondInstrument("YOLO", new Fonds(9432));
        monPortefeuille.ajouterFondInstrument("YOLO", new Fonds(3330));
        monPortefeuille.ajouterFondInstrument("YOLO", new Fonds(3530));
        monPortefeuille.ajouterFondInstrument("YOLO", new Fonds(10330));
        monPortefeuille.ajouterFonds("YOLO", 666);
        monPortefeuille.triCollection("YOLO");
        System.out.println(monPortefeuille.rechercheInstrument("YOLO"));
        System.out.println(monPortefeuille.rechercheFonds("YOLO"));
        
    }
    void afficherInstrument()
    {
        System.out.println("");
    }
}
