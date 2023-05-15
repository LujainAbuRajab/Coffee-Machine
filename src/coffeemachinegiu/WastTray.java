/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachinegiu;


/**
 *
 * @author Lenovo
 */
public class WastTray {
    private  int Capacity;
    private boolean clean;

    public WastTray(int Capacity, boolean clean) {
        this.Capacity = Capacity;
        this.clean = clean;
    }

    public WastTray() {
        this.Capacity = 0;
        this.clean = true;
    }
    
    public  int getCapacity() {
        return Capacity;
    }

    public  void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
    public void capacity(int shout){
        if(shout==1)
            this.Capacity++;
        else
            this.Capacity += 2;
    }
    
}
