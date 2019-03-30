/*
 
 */
package gasmenu;

/**
 *This is a test programme for the BusinessAccount, it will test all the methods in the extended business account, for valid, negative and zero 
 * values. It will test the constructor by the creation of the instance of an object - testBus. Values will be added to the testBus parameters for
 * testing and manipulating.
 * @author CUR16117920
 */
public class TestBusinessAccount {
    
    public static void main(String args[]){
        
        System.out.println("Test 1 - BusinessAccount (with inherited parameters) - Constructor Test");// output for Constructor test
        System.out.println("************************************");
        BusinessAccount testBus = new BusinessAccount (39583,"Saiorse Hamilton","99 Eagletop Way",7892.0,10.0, "saiorsehamilton@live.co.uk");//creation of new instance in parameters
        System.out.println("Business Account object constructed");//output to confirm creation of new object
        System.out.println();// clear space
        
        System.out.println("Test 2 - BusinessAccount (Get Discount) -  Test");// test output for getter discount
        System.out.println("*************************************************");
        double getDis = testBus.getDiscount();//calling method from extended business account class
        System.out.println("Get Discount: "+getDis+ "%");// output for discount
        System.out.println();//clear space
        
        System.out.println("Test 3 - BusinessAccount (Set Discount) WITH VALID INPUT Test");//test output for setter discount
        System.out.println("*****************************************************************************");
        System.out.println("Discount Before: "+testBus.getDiscount()+"%");//calling method from extended business account class
        testBus.setDblNewDiscount(15.0);//setting of value in parameter 
        double valInput = 15.0;
        System.out.println("Valid Input Entered: " +valInput+ "%");//output of getter for discount
        System.out.println("New Discount: " +testBus.getDiscount()+"%");//output of getter for discount
        System.out.println();//clear space
        
        System.out.println("Test 4 - BusinessAccount (Set Discount) WITH ZERO INPUT Test");//test output for setter discount
        System.out.println("*****************************************************************************");
        System.out.println("Discount Before: "+testBus.getDiscount()+"%");//calling method from extended business account class
        testBus.setDblNewDiscount(0.0);//setting of value in parameter 
        valInput = 0.0;
        System.out.println("Valid Input Entered: " +valInput+ "%");//output of getter for discount
        System.out.println("New Discount: " +testBus.getDiscount()+"%");//output of getter for discount
        System.out.println();//clear space
        
        System.out.println("Test 5 - BusinessAccount (Set Discount) WITH NEGATIVE INPUT Test");//test output for setter discount
        System.out.println("*****************************************************************************");
        System.out.println("Discount Before: "+testBus.getDiscount()+"%");//calling method from extended business account class
        testBus.setDblNewDiscount(-10.0);//setting of value in parameter 
        valInput = -10.0;
        System.out.println("Valid Input Entered: " +valInput+ "%");//output of getter for discount
        System.out.println("New Discount: " +testBus.getDiscount()+"%");//output of getter for discount
        System.out.println();//clear space
        
        System.out.println("Test 6 - GasAccount recordUnits - VALID VALUE - Test");//test outputs for valid value
        System.out.println("***********************************************************");
        System.out.println("Current Balance £ "+testBus.getBalance());//original balance declared
        double unitsZero = 1000.0;//valid value for units added
        System.out.println("Units Added "+unitsZero);//output for valid value
        testBus.recordUnits(1000.0);// valid value entered into parameter
        System.out.println("New Balance £ "+testBus.getBalance());//balance out
        System.out.println();//clear space
        
        System.out.println("Test 7 - GasAccount recordUnits - NEGATIVE VALUE - Test");//test outputs for neg value
        System.out.println("***********************************************************");
        System.out.println("Current Balance £ "+testBus.getBalance());//original balance declared
        unitsZero = -100.0;//neg value for units added
        System.out.println("Units Added "+unitsZero);//output for neg value
        testBus.recordUnits(-100.0);//negative test value entered 
        System.out.println("New Balance £ "+testBus.getBalance());//balance output
        System.out.println();// clear space
        
        System.out.println("Test 8 - GasAccount recordUnits - ZERO VALUE - Test");//test outputs for zero value
        System.out.println("***********************************************************");
        System.out.println("Current Balance £ "+testBus.getBalance());//original balance declared
        unitsZero = 0.0;//zero value for units added
        System.out.println("Units Added "+unitsZero);//output of zero value
        testBus.recordUnits(0.0);//zero test value entered into parameter
        System.out.println("New Balance £ "+testBus.getBalance());// balance output
        System.out.println();//clear space
        
        
    
    
    }//end of main
    
    
}//end of class
