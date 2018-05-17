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
public class FondExistant extends Exception{
   
    public FondExistant(String exc)
    {
        super(exc);
    }
    public FondExistant()
    {
        super("Fond Existant");
    }
    
}

