/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachinegiu;

import java.time.LocalDate;
import sun.util.resources.LocaleData;

/**
 *
 * @author Lenovo
 */
public class CoffeeMachine {
    private Beans1 beans;
    private Water water;
    private WastTray wast;
    private Gredens gredens;
    private static int count;
    LocalDate date = LocalDate.now();

    public CoffeeMachine() {
        beans = new Beans1();
        water = new Water();
        gredens = new Gredens();
        wast=new WastTray();
    }
    public void Start(){
        count++;
    }

    public String clean(){
        wast.setCapacity(0);
        wast.setClean(true);
        return "Clean is done sucessfully";
    }
    public Beans1 getBeans() {
        return beans;
    }
    public void setBeans(Beans1 beans) {
        this.beans = beans;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Gredens getGredens() {
        return gredens;
    }

    public void setGredens(Gredens gredens) {
        this.gredens = gredens;
        
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CoffeeMachine.count = count;
    }


    public void expressoSingleBeans()throws EspressosSinglebeans{
        
        if(beans.getAmountOfBeans()<7)
            throw new EspressosSinglebeans("Please you must enter MORE than or equal to 7gm of beans!");
        
            else{
            wast.capacity(1);
            beans.beansForSingle1Espresso();
            new loggerclass().log("the order is :\t\tSingle Espresso\t"+date+"\tThe caffien:\t"+this.getCoffeineSingleE()+"\n");
            }
    }
    public void expressoDoubleBeans()throws EspressoDoublebeans{
        if(beans.getAmountOfBeans()<14)
            throw new EspressoDoublebeans("Please you must enter MORE than or equal to 14gm of beans!");
        else{
            wast.capacity(2);
            beans.beansForDoubleEspresso();
            new loggerclass().log("the order is :\t\tDouble Espresso\t"+date+"\tThe caffien:\t"+this.getCoffeineDoubleE());
        }
    }
    public void amricanoSingleBeans()throws AmricanoSingltbeans{
        if(beans.getAmountOfBeans()<7)
            throw new AmricanoSingltbeans("Please you must enter MORE than or equal to 7gm of beans!");
        else{
            wast.capacity(1);
            beans.beansForSingle1Americano();
            new loggerclass().log("the order is :\t\tSingle Amricano\t"+date+"\tThe caffien:\t"+this.getCoffeineSingleA());
        }
            
    }
    public void amricanoDoubleBeans()throws AmricanoDoublebeans{
        if(beans.getAmountOfBeans()<14)
            throw new AmricanoDoublebeans("Please you must enter MORE than or equal to 14gm of beans!");
        else{
            wast.capacity(2);
            beans.beansForDoubleAmericano();
            new loggerclass().log("the order is :\t\tDouble Amricano\t"+date+"\tThe caffien:\t"+this.getCoffeineDoubleA());
        }
    }
    public void expressoSingleWater()throws EspressoSinglewater{
        if (water.getAmontOfWater()<30)
            throw new EspressoSinglewater("Please you must enter MORE than or equal to 30ml of water!");
        else
        water.waterForSingle1Espresso();
    }
    public void expressoDoubleWater()throws EspressoDoublewater{
        if (water.getAmontOfWater()<60)
            throw new EspressoDoublewater("Please you must enter MORE than or equal to 60ml of water!");
        else
            water.waterForDoubleEspresso();
    }
    public void amricanoSingeWater()throws AmricanoSinglewater{
        if (water.getAmontOfWater()<170)
            throw new AmricanoSinglewater("Please you must enter MORE than or equal to 170ml of water!");
        else
            water.waterForSingle1Americano();
    }
    public void amricanoDoubleWater()throws AmricanoDoublewater{
        if (water.getAmontOfWater()<220)
            throw new AmricanoDoublewater("Please you must enter MORE than or equal to 220ml of water!");
        else
            water.waterForDoubleAmericano();
    }
    public WastTray getWast() {
        return wast;
    }

    public void setWast(WastTray wast) {
        this.wast = wast;
    }

    public int getCoffeineSingleE() {
            return water.getCountSingleE()*63;
    } 
    
    public int getCoffeineDoubleE() {
            return water.getCountDoubleE()*125;
    }
    
    public int getCoffeineSingleA() {
            return water.getCountSingleA()*14;
    }
    
    public int getCoffeineDoubleA(){
        return water.getCountDoubleA()*150;
    }
    
    public int getCoffeine(){
        return water.getCountSingleE()*63+water.getCountDoubleE()*125+water.getCountSingleA()*14+water.getCountDoubleA()*150;
    }
    public String getinfo(){
        return beans.getinfo()+water.getinfo()+count;
    }
    
}
