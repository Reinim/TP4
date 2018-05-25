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
    /**
     * Constructeur par défault
     */
    public Fonds() {
        this.amount = 0;
    }
    /**
     * Constructeur avec paramètre
     * @param amount Quantité de fonds
     */
    public Fonds(double amount) {
        this.amount = amount;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    /**
     * Compare deus objets de type Fonds
     * @param o L'objet à comparer
     * @return résultat de la comparaison
     */
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
    /**
     * Compare deux objets de type Fonds
     * @param o Objet à comparer
     * @return résultat de la comparaison
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Fonds)) {
            return false;
        }
        Fonds obj = (Fonds) o;
        return (this.getAmount() == obj.getAmount());
    }
    /**
     * Accompagne l'Override de la méthode equals()
     * @return nouveau hash
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        return hash;
    }
    
    @Override
    public String toString() {
        return "" + this.amount;
    }
}
