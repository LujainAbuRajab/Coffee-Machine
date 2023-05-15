package coffeemachinegiu;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class loggerclass implements logger{
        static FileWriter pr;
        
        public void log(String msg){
            try {
                pr = new FileWriter(new File("log.txt"),true);
                pr.write(msg);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                Logger.getLogger(loggerclass.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                try {
                    pr.close();
                } catch (IOException ex) {
                    Logger.getLogger(loggerclass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
}
