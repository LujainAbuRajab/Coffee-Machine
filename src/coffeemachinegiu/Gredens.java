package coffeemachinegiu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Gredens {
    int TheGredens;

    public Gredens() {
        this.TheGredens = 1;
    }

    public int getTheGredens() {
        return TheGredens;
    }

    public void setTheGredens(int TheGredens) throws OutOfBoundGriding {

        this.TheGredens = TheGredens;
        if(this.TheGredens<1){
            this.TheGredens = 1;
            throw new OutOfBoundGriding("Please you must enter MORE than or equal to 1!");
        }
        else if (this.TheGredens>10){
            this.TheGredens = 1;
            throw new OutOfBoundGriding("Please you must enter LESS than or equal to 10 !"); 
        }
    }
    
}
