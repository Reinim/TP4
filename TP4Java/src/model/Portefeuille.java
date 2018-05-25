/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package model;

import controller.FondExistant;
import controller.FondInexistant;
import controller.InstrumentInexistant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author riccardild
 */
public class Portefeuille extends Exception {
    private Map<String, Fonds> mapFond;
    private Map<String, Instrument> mapInstrument;
    
    public Portefeuille() {
        this.mapFond = new HashMap<>();
        this.mapInstrument = new HashMap<>();
    }
    
   public double rechercheFonds(String key) throws FondInexistant
    {
        
        if( this.mapFond.get(key) != null)
        {
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
   
    public void ajouterInstrument(String key, Fonds fond) throws InstrumentInexistant
    {
       
        ArrayList <Fonds> f = new ArrayList<>();
        f.add(fond);
        if(!this.mapInstrument.containsKey(key) )
           {
            this.mapInstrument.put(key, new Instrument(f));
            throw new InstrumentInexistant();
            
           }
        else
        {
           this.mapInstrument.get(key).ajoutFonds(fond); ///A verifier si ça marche
           
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

