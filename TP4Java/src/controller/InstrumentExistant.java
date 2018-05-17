/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author theo
 */
public class InstrumentExistant extends Exception{
   
    public InstrumentExistant(String exc)
    {
        super(exc);
    }
    public InstrumentExistant()
    {
        super("Instrument Existant");
    }
    
}
