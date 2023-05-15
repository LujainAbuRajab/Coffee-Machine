
package coffeemachinegiu;

import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner( System.in );
        CoffeeMachine coffee=new CoffeeMachine();
        String MainMenu = "\t WELLCOME! \n"
                        + "Choose the number of the operation : \n"
                        + "1. Order COFFEE\n"
                        + "2. the store\n"
                        + "3. clean\n"
                        + "4. Information \n"
                        + "5. EXIT";
        
        String InfoMenu = " \t informtion Menu \n"
                        + "1. information of Coffeine \n"
                        + "2. The History \n"
                        + "3. EXIT ";
        
        String CoffeineMenu =" \t Coffeine \n"
                        + "1. Coffeine in single espresso\n"
                        + "2. Coffeine in double espresso\n"
                        + "3. Coffeine in single amricano\n"
                        + "4. Coffeine in double amricano\n"
                        + "5. Coffeine in All cupes\n"
                        + "6. EXIT ";
        
        String HistoryMenu = "\t the History \n"
                        + "1. Number of cupes in single espresso\n"
                        + "2. Number of cupes in double espresso\n"
                        + "3. Number of cupes in single espresso\n"
                        + "4. Number of cupes in double amricano\n"
                        + "5. Number of All cupes \n"
                        + "6. EXIT ";
        
        String CoffeMenu = "\t  Coffee Menu \n"
                    + "Choose the type of coffee you want:\n"
                    + "1. Americano\n"
                    + "2. Espresso\n"
                    + "3. EXIT";
        
        String ShotsMenu = "Choose the number of shots you want: \n"
                     + "1. Single shot\n"
                     + "2. Double shot\n"
                     + "3. EXIT";
        
        String gredensList = "Enter the degree of grinding you want: \n"
                + "PS: IT should be between(1-10) ";
        do{
        if(coffee.getWast().getCapacity()<=10){
            System.out.println(MainMenu);
            switch(cin.nextInt()){
                case 1:                                                         //Order COFFEE
                    System.out.println(CoffeMenu);
                    //-----------------------------coffe type-----------------------------------------
                    switch(cin.nextInt()){
                        
                        case 1:                                                         //Americano                              
                            System.out.println(ShotsMenu);                                  //shots
                            //---------------------------shots---------------------------------------
                            switch(cin.nextInt()){
                                case 1:
                                    System.out.println(gredensList);
             
                                    try {
                                        coffee.getGredens().setTheGredens(cin.nextInt());
                                    } catch (OutOfBoundGriding ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    try{
                                        coffee.amricanoSingeWater();
                                    }catch(AmricanoSinglewater e){
                                        System.out.println(e.getMessage());
                                        System.out.println("Do You want to fill the water tank?");
                                        String flag=cin.next();
                                        if(flag.equalsIgnoreCase("yes")){
                                            System.out.println("Enter the amount of water you need to fill: (range:30 ml-1000 ml)");
                                            try{
                                                coffee.getWater().setAmontOfWater(cin.nextInt());
                                            }catch(OutOfwater e1){
                                                System.out.println(e1.getMessage());                                               
                                            }
                                        }
                                    } 
                                    try{
                                        coffee.amricanoSingleBeans(); 
                                    }catch(AmricanoSingltbeans e){
                                        System.out.println(e.getMessage());
                                        System.out.println("Do You want to fill the beans tank? (yes/no) ");
                                        String flag=cin.next();
                                        if(flag.equalsIgnoreCase("yes")){
                                            System.out.println("Enter the amount of beans you need to fill: (range: 7 gm-500 gm)\n"
                                                                +"PS: Your order will not be fulfilled after the store has been filled. Order again!");
                                            try{
                                            coffee.getBeans().setAmountOfBeans(cin.nextInt());
                                            }catch(OutOfBeans e1){
                                                System.out.println(e1.getMessage());                                               
                                            }
                                        }
                                    }
                                    break;
                                case 2:                                                         //double
                                    System.out.println(gredensList);
                                    try {
                                        coffee.getGredens().setTheGredens(cin.nextInt());
                                    } catch (OutOfBoundGriding ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    try{
                                        coffee.amricanoDoubleWater();
                                    }catch(AmricanoDoublewater e){
                                        System.out.println(e.getMessage());
                                        System.out.println("Do You want to fill the water tank?");
                                        String flag=cin.next();
                                        if(flag.equalsIgnoreCase("yes")){
                                            System.out.println("Enter the amount of water you need to fill: (range:30 ml-1000 ml)");
                                            try{
                                            coffee.getWater().setAmontOfWater(cin.nextInt());
                                            }catch(OutOfwater e1){
                                                System.out.println(e1.getMessage());                                               
                                            }
                                        }
                                    }
                                    
                                    try{
                                        coffee.amricanoDoubleBeans();
                                    }catch(AmricanoDoublebeans e){
                                        System.out.println(e.getMessage());
                                        System.out.println("Do You want to fill the beans tank?");
                                        String flag=cin.next();
                                        if(flag.equalsIgnoreCase("yes")){
                                            System.out.println("Enter the amount of beans you need to fill: (range: 7 gm-500 gm)"
                                                    + "PS: Your order will not be fulfilled after the store has been filled. Order again!");
                                            try{
                                            coffee.getBeans().setAmountOfBeans(cin.nextInt());
                                            }catch(OutOfBeans e1){
                                                System.out.println(e1.getMessage());                                               
                                            }
                                        }
                                    }
                                    break;
                                case 3:                                                         //exit
                                    System.exit(0);
                                    break;
                            }
                            break;
                            
                        case 2:                                                         //Espresso
                            System.out.println(ShotsMenu);                              //shots
                            switch(cin.nextInt()){
                                case 1:                                                         //single
                                    System.out.println(gredensList);
                                    try {
                                        coffee.getGredens().setTheGredens(cin.nextInt());
                                    } catch (OutOfBoundGriding ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    try{
                                        coffee.expressoSingleWater();
                                    }catch(EspressoSinglewater e){
                                        System.out.println(e.getMessage());
                                        System.out.println("Do You want to fill the water tank?(yes/no)");
                                        String flag=cin.next();
                                        if(flag.equalsIgnoreCase("yes")){
                                            System.out.println("Enter the amount of water you need to fill: (range:30 ml-1000 ml)");
                                            try{
                                            coffee.getWater().setAmontOfWater(cin.nextInt());
                                            }catch(OutOfwater e1){
                                                System.out.println(e1.getMessage());                                               
                                            }
                                        }
                                    }
                                    try{
                                        coffee.expressoSingleBeans();
                                    }catch(EspressosSinglebeans e){
                                        System.out.println(e.getMessage());
                                        System.out.println("Do You want to fill the beans tank?(yes/no)");
                                        String flag=cin.next();
                                        if(flag.equalsIgnoreCase("yes")){
                                            System.out.println("Enter the amount of beans you need to fill: (range: 7 gm-500 gm)"
                                                    + "PS: Your order will not be fulfilled after the store has been filled. Order again!");
                                            try{
                                            coffee.getBeans().setAmountOfBeans(cin.nextInt());
                                            }catch(OutOfBeans e1){
                                                System.out.println(e1.getMessage());                                              
                                            }
                                        }
                                    }
                                    break;
                                case 2:                                                         //double
                                    System.out.println(gredensList);
                                    try {
                                        coffee.getGredens().setTheGredens(cin.nextInt());
                                    } catch (OutOfBoundGriding ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    try{
                                        coffee.expressoDoubleWater();
                                    }catch(EspressoDoublewater e){
                                        System.out.println(e.getMessage());
                                        System.out.println("Do You want to fill the water tank?(yes/no)");
                                        String flag=cin.next();
                                        if(flag.equalsIgnoreCase("yes")){
                                            System.out.println("Enter the amount of water you need to fill: (range:30 ml-1000 ml)");
                                            try{
                                            coffee.getWater().setAmontOfWater(cin.nextInt());
                                            }catch(OutOfwater e1){
                                                System.out.println(e1.getMessage()); 
                                                    
                                            }
                                            
                                        }
                                    }
                                    try{
                                        coffee.expressoDoubleBeans();
                                    }catch(EspressoDoublebeans e){
                                        System.out.println(e.getMessage());
                                        System.out.println("Do You want to fill the beans tank?(yes/no)");
                                        String flag=cin.next();
                                        if(flag.equalsIgnoreCase("yes")){
                                            System.out.println("Enter the amount of beans you need to fill: (range: 7 gm-500 gm)"
                                                    + "PS: Your order will not be fulfilled after the store has been filled. Order again!");
                                            try{
                                            coffee.getBeans().setAmountOfBeans(cin.nextInt());
                                            }catch(OutOfBeans e1){
                                                System.out.println(e1.getMessage());                                               
                                            }
                                        }
                                    }
                                    break;
                                case 3:                                                         //exit
                                    System.exit(0);
                                    break;
                            }
                            break;
                        //--------------------------end shots--------------------------------------------    
                        case 3:                                                         //Exit
                            System.exit(0);
                            break;
                    }
                    break;
                    //-----------------------------end coffe-----------------------------------------------
                case 2:                                                         //store
                    System.out.println("- The beans ratio in beans tank is: "
                            +coffee.getBeans().getAmountOfBeans()
                            +"\n"+"- The water ratio in water tank is: "
                            +coffee.getWater().getAmontOfWater());
                    break;
                case 3:                                                         //clean
                    System.out.println(coffee.clean());
                    break;
                case 4:                                                         //exit
    //----------------------------------information----------------------------------------------------
                    System.out.println(InfoMenu);
                    switch(cin.nextInt()){
                        case 1:
            //----------------------------coffeine---------------------------------
                            System.out.println(CoffeineMenu);
                            switch(cin.nextInt()){
                                case 1:
                                    System.out.println("The coffein in single espresso in all cupes today is: "
                                            + coffee.getCoffeineSingleE());
                                    break;
                                case 2:
                                    System.out.println("- The coffein in double espresso in all cupes today is: "
                                            + coffee.getCoffeineDoubleE());
                                    break;
                                case 3:
                                    System.out.println("- The coffein in single amricano in all cupes today is: "
                                            + coffee.getCoffeineSingleA());
                                    break;
                                case 4:
                                    System.out.println("- The coffein in double amricano in all cupes today is: "
                                            + coffee.getCoffeineDoubleA());
                                    break;
                                case 5:
                                    System.out.println("- The coffein in all cupes today is: "
                                            + coffee.getCoffeine());
                                    break;
                                case 6:
                                    System.exit(0);
                                    break;
                            }
                            break;
                        case 2:
    //-----------------------------------history------------------------------------------------
                            System.out.println(HistoryMenu);
                            switch(cin.nextInt()){
                                case 1:
                                    System.out.println("- The number of cupes for single espresso today is: "
                                            + coffee.getWater().getCountSingleE());
                                    break;
                                case 2:
                                    System.out.println("- The number of cupes for double espresso today is: "
                                            + coffee.getWater().getCountDoubleE());
                                    break;
                                case 3:
                                    System.out.println("- The number of cupes for single amricano today is: "
                                            + coffee.getWater().getCountSingleA());
                                    break;
                                case 4:
                                    System.out.println("- The number of cupes for double amricano today is: "
                                            + coffee.getWater().getCountDoubleA());
                                    break;
                                case 5:
                                    System.out.println("- The number of cupes today is: "
                                            + coffee.getWater().getCount());
                                    break;
                                case 6:
                                    System.exit(0);
                                    break;
                            }
                            break;
                      
                        case 3:
                            System.exit(0);
                            break;    
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
            }else{
                System.out.println("You should clean the machine! \n Do you want to clean the machine? (yes/no) ");
                String flag=cin.next();
                if(flag.equalsIgnoreCase("yes"))
                    System.out.println(coffee.clean()); 
            }
        }while(true);
    }
    
    
    
}
