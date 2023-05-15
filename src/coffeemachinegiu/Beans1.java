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
public class Beans1 {
    private int AmountOfBeans,checkBeans;
    private static int count,countOfSingleE,countOfDoubleE,countOfSingleA,countOfDoubleA;

    public Beans1() {
        AmountOfBeans = 0;
        count=0;
    }

    public Beans1(int AmountOfBeans)throws OutOfBeans {
        setAmountOfBeans(AmountOfBeans);
        count++;
    }

    public int getAmountOfBeans() {
        return AmountOfBeans;
    }

    /**
     *
     * @param AmountOfBeans
     * @throws OutOfBeans
     */
    public void setAmountOfBeans(int AmountOfBeans) throws OutOfBeans{
        this.checkBeans = AmountOfBeans;
        if((this.checkBeans+this.AmountOfBeans)<7){
            throw new OutOfBeans("Please you must enter MORE than 7gm of beans!");
        }
        else if ((this.checkBeans+this.AmountOfBeans)>500){
            throw new OutOfBeans("Please you must enter LESS than 500gm of beans!");
        }
        else
            this.AmountOfBeans = AmountOfBeans;
    }
    
    public void beansForSingle1Espresso(){
            countOfSingleE++;
            AmountOfBeans -= 7;     
    }
    public void beansForDoubleEspresso(){
            countOfDoubleE++;
            AmountOfBeans -= 14;    
    }
    public void beansForSingle1Americano()throws AmricanoSingltbeans{
            countOfSingleA++;
            AmountOfBeans -= 7;
    }
    public void beansForDoubleAmericano(){
            countOfDoubleA++;
            AmountOfBeans -= 14;
    }
    
    public int getCountSingleE(){
        return countOfSingleE; 
    }
    
    public int getCountDoubleE(){
        return countOfDoubleE; 
    }
     
    public int getCountSingleA(){
        return countOfSingleA; 
    }
      
    public int getCountDoubleA(){
        return countOfDoubleA; 
    }
    
    public int getCount(){
        return count; 
    }
    
    public String getinfo(){
        return  "The amount of Beans in the machine is : " + getAmountOfBeans();
    }
     public boolean Fill(){
        if(AmountOfBeans <= 500 && AmountOfBeans >= 7)
            return true;
        else
            return false;
    }
}
