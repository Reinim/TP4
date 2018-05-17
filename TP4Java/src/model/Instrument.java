/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package model;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author riccardild
 */
public class Instrument {
    private List<Fonds> valFonds;
    
    public List<Fonds> getValFonds() {
        return valFonds;
    }
    
    public Instrument() {
        this.valFonds = new ArrayList<>();
    }
    
    public Instrument(ArrayList<Fonds> valFonds) {
        this.valFonds = valFonds;
    }
    
    public void ajoutFonds(Fonds obj) {
        valFonds.add(obj);
    }
    
    public void triCollection () {
        Collections.sort(valFonds);
    }
    
}
