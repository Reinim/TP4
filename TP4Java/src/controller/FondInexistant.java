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
public class FondInexistant extends Exception{
   
    public FondInexistant(String exc)
    {
        super(exc);
    }
    public FondInexistant()
    {
        super("Fond Inexistant");
    }
    
}

