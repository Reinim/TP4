/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package model;

import controller.FondExistant;
import controller.FondInexistant;
import controller.InstrumentExistant;
import controller.InstrumentInexistant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author riccardild
 */
public class Portefeuille extends Exception {
    private final Map<String, Fonds> mapFond;
    private final Map<String, Instrument> mapInstrument;
    
    public Portefeuille() {
        this.mapFond = new HashMap<>();
        this.mapInstrument = new HashMap<>();
    }
    
   public double rechercheFonds(String key) throws FondInexistant
    {
        
        if( this.mapFond.get(key) != null)
        {
            System.out.println(this.mapFond.get(key).getAmount());
            return this.mapFond.get(key).getAmount();
        }
        
        else {
            throw new FondInexistant();
        }
        
    }
    
    public List<Fonds> rechercheInstrument(String key) throws InstrumentInexistant
    {
        
        if( this.mapInstrument.containsKey(key) )
        {
            return this.mapInstrument.get(key).getValFonds();
        }
        
        else {
            throw new InstrumentInexistant();
        }
        
    }
    
    public void ajouterFonds(String key, double amount) throws FondExistant
    {
        try {
            rechercheFonds(key);
            throw new FondExistant();
        } catch (FondInexistant ex) {
            this.mapFond.put(key, new Fonds(amount));
        }
    }
   
    public void ajouterFondInstrument(String key, Fonds fond) throws InstrumentExistant
    {
       
        try {
            rechercheInstrument(key);
            this.mapInstrument.get(key).ajoutFonds(fond); ///A verifier si ça marche
            throw new InstrumentExistant();
        } catch (InstrumentInexistant ex) {
            ArrayList<Fonds> f = new ArrayList<>();
            mapInstrument.put(key, new Instrument(f));
        }
        
    }
    
    public void supprimerFonds(String key) throws FondInexistant
    {
       try{
           rechercheFonds(key);
       }
       catch(FondInexistant f){
           throw new FondInexistant();
          // System.out.println("Fond non suppressible");
                   
       }
       
       this.mapFond.remove(key);
    }
    
    public void supprimerInstrument(String key) throws InstrumentInexistant
    {
       try{
           rechercheInstrument(key);
       }
       catch(InstrumentInexistant i){
           throw new InstrumentInexistant();
                   
       }
       this.mapInstrument.get(key).getValFonds().removeAll(this.mapInstrument.get(key).getValFonds());
       this.mapInstrument.remove(key);
    }
    
}

