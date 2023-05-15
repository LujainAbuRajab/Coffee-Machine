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
public class EspressoDoublebeans extends Exception {
    public EspressoDoublebeans(String message) {
        super(message);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMessage() {
        return "Please you must enter MORE than or equal to 14gm of beans" ; //To change body of generated methods, choose Tools | Templates.
    }
    
}
