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
public class Fonds implements Comparable<Fonds>{
    private double amount;
    
    public Fonds() {
        this.amount = 0;
    }
    
    public Fonds(double amount) {
        this.amount = amount;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    @Override
    public int compareTo(Fonds o) {
        if(this.getAmount() == o.getAmount()){
            return 0;
        }
        else if(this.getAmount() < o.getAmount()){
            return 1;
        }
        else{
            return -1;
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Fonds)) {
            return false;
        }
        Fonds obj = (Fonds) o;
        return (this.getAmount() == obj.getAmount());
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        return hash;
    }
    
}
