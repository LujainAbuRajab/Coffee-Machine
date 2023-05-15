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
public class Water {
    private int AmontOfWater,checkWater;
    private static int count,countOfSingleE,countOfDoubleE,countOfSingleA,countOfDoubleA;

    public Water() {
        AmontOfWater = 0;
        count=0;
    }

    public Water(int AmontOfWater) throws OutOfwater{
        setAmontOfWater(AmontOfWater);
        count++;
    }

    public int getAmontOfWater() {
        return AmontOfWater;
    }

    public void setAmontOfWater(int AmontOfWater) throws OutOfwater{
        this.checkWater = AmontOfWater;
        if((this.checkWater+this.AmontOfWater)<30){
            throw new OutOfwater("Please you must enter MORE than or equal to 30 ml of Water!");
        }
        else if ((this.checkWater+this.AmontOfWater)>1000){
            throw new OutOfwater("Please you must enter LESS than or equal to 1000 ml of Water!/n"
                    + "ps:1000 ml = 1 liter");
        }
        else 
            this.AmontOfWater = AmontOfWater;
    }
    
    public void waterForSingle1Espresso() {
            countOfSingleE++;
            count++;
            AmontOfWater -= 30;    
    }
    public void waterForDoubleEspresso(){
            countOfDoubleE++;
            count++;
            AmontOfWater -= 60;        
    }
    public void waterForSingle1Americano(){
            countOfSingleA++; 
            count++;
            AmontOfWater -= 170;
            
    }
    public void waterForDoubleAmericano(){
            countOfDoubleA++;
            count++;
            AmontOfWater -= 220;     
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
        return "The amount of Water in the machine is : "+getAmontOfWater();
    }
 
    public boolean isFull(){
        return AmontOfWater <= 1000 && AmontOfWater >= 30;
    }
    public boolean isEmpty(){
        return AmontOfWater == 0;
    }
}
