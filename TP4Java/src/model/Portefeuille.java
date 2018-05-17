/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.CustomException;
import java.util.HashMap;
import java.util.Map;

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
    
    double rechercheFonds(String key) throws CustomException
    {
      
           if( this.mapFond.get(key) != null)
           {
               return this.mapFond.get(key).getAmount();
           }
           
           else {
               throw new CustomException();
           }

    }
}

