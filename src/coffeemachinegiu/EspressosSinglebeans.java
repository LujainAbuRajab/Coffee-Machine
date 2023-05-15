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
public class EspressosSinglebeans extends Exception{
    public EspressosSinglebeans(String message) {
        super(message);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMessage() {
        return "Please you must enter MORE than or equal to 7gm of beans!"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
