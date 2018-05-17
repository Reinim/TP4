/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author riccardild
 */
public class Fonds {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Fonds(double amount) {
        this.amount = amount;
    }
    public Fonds() {
        this.amount = 0;
    }
}
