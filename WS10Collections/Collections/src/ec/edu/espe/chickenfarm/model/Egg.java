/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Pablo Yanez CodeMasters ESPE-DCCO
 */
public class Egg {
    
    private int id; 

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    public Egg(int id) {
        this.id = id;
    }
    
}
