/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author riccardild
 */
public class Portefeuille extends Exception {
    Map<String, Fonds> mapFond;
    Map<String, Instrument> mapInstrument;
     

    public Portefeuille() {
        this.mapFond = new HashMap<>();
        this.mapInstrument = new HashMap<>();
    }
    
   /* Fonds rechercheFonds(String key)
    {
       
       try {

    

  } catch (ArithmeticException e) {

    System.out.println("Division par zéro !");

  }
       return this.mapFond.get(key);
    }*/
}
