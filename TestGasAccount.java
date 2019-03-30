/*
 * A unit test program to test the gas account constructors, values and methods. 
 */
package gasmenu;

/**
 **This is a test programme for the GasAccount, it will test all the methods in the GasAccount object class, for valid, negative and zero values. It will
 * test all the string methods for valid and null values. It will test the constructors by the creation of instances of objects - testGas & testNew.
 * Values will be added to the testBus & testNew parameters for testing and manipulating.
 * D3 - new parameter introduced - email - Update to this program 26.5.17 - this has not been tested, however does work well.
 * @author niall curley CUR16117920
 */
public class TestGasAccount {
    public static void main(String args[]){
    //test for construction
        System.out.println("Test 1 - GasAccount Constructor Test");//output for constructor test
        System.out.println("************************************");
        GasAccount testGas = new GasAccount (181818,"Pauline Hanna","11 Beechcroft Manor",4732.0,"paulinehanna@live.co.uk");// actual values entered into parameters for new instnce
        System.out.println("Gas Account object constructed.");// output that constructor has worked
        System.out.println();//clear space
        
        System.out.println("Test 2 - GasAccount Overloaded Constructor Test");//output for constructor test
        System.out.println("***********************************************");
        GasAccount testNew = new GasAccount (100,"Sharon Healy","77 Ormonde Park");// actual values entered into parameters for new instnce
        System.out.println("Gas Account object constructed.");// output that constructor has worked
        System.out.println();//clear space
        
        System.out.println("Test 3 - GasAccount Get Account Reference No Test");//output for Getter account 
        System.out.println("*************************************************");
        int acc = testGas.getAccRefNo();//getter called from object class GasAccount
        System.out.println("Account Reference No: "+acc);//account number declared
        System.out.println();// clear space
        
        System.out.println("Test 4 - GasAccount Set New Account Reference No Test");//output for account reference number
        System.out.println("********************************************************");
        System.out.println("Value of Account Number Before: "+testNew.getAccRefNo());//declaring original acccount number before change
        testNew.setIntAccRefNo(102543);//new value entered into setter parameter
        int newAcc = 102543;//variable created with value for account number
        System.out.println("New Account Reference To Be Entered: " +newAcc);//output to be entered
        System.out.println("New Account Reference No: " +testNew.getAccRefNo());//account number that has been reset output
        System.out.println();//clear space
        
        System.out.println("Test 5 - GasAccount Create New Account Ref To Be Set WITH NEGATIVE VALUE Test");//new account being set test
        System.out.println("*****************************************************************************");
        System.out.println("Value of Account Number Before: "+testNew.getAccRefNo());//value of account number
        testNew.setIntAccRefNo(-102543);//negative value entered into setter parameter
        int negVal = -102543;//amount declared
        System.out.println("Negative Account Reference Entered: " +negVal);
        System.out.println("Account Reference No: " +testNew.getAccRefNo());//account number that has been changed 
        System.out.println();//clear space
        
        System.out.println("Test 6 - GasAccount Create New Account Reference WITH ZERO VALUE Test");//create new account with zero test
        System.out.println("********************************************************");
        testNew.setIntAccRefNo(0);//zero value being set into perameter
        System.out.println("Value of Account Number Before: "+testNew.getAccRefNo());//value of account 
        int negAcc = 0;//variable given zero value for output
        System.out.println("Value To Be Entered Into Account: "+negAcc );//output zero value
        System.out.println("New Account Reference No: " +testNew.getAccRefNo());//output value for reference
        System.out.println();//clear space
        
        System.out.println("Test 7 - GasAccount Get Customer Name Test");//output for customer name
        System.out.println("*******************************************");
        String n = testGas.getName();//getter for name
        System.out.println("Customer Name: "+n);//output with customer name
        System.out.println();//clear space
        
        System.out.println("Test 8 - GasAccount Set Customer Name Test");//output for customer name
        System.out.println("*******************************************");
        n = testGas.getName();//getter for name
        System.out.println("Original Customer Name: "+n);//output for customer name
        testGas.setStrName("Pauline Conway");//string entered into parameter
        System.out.println("Customer New Name: "+testGas.getName());//getter used in output
        System.out.println();//clear space
        
        System.out.println("Test 9 - GasAccount Set Customer Name With NULL Value Test");//null value test output
        System.out.println("**********************************************************");
        n = testGas.getName();//getter for name
        System.out.println("Original Customer Name: "+n);//output for name
        testGas.setStrName("");//null value entered
        System.out.println("Customer New Name: "+testGas.getName());//getter for name used in output
        System.out.println();//clear space
        
        System.out.println("Test 10 - GasAccount Get Customer Address Test");//output for address test
        System.out.println("**********************************************");
        String a = testGas.getAddress();//getter for address
        System.out.println("Customer Address: "+a);//output with address
        System.out.println();//clear
        
        System.out.println("Test 11 - GasAccount Set Customer Address Test");//output for set address 
        System.out.println("**********************************************");
        String getAd = testGas.getAddress();//getter for address
        System.out.println("Original Customer Address: "+getAd);//output with address
        testGas.setStrAddress("44 Eastwick Road");//string entered for setter address
        System.out.println("Customer New Address: "+testGas.getAddress());//getter for address in output
        System.out.println();//clear space
        
        System.out.println("Test 12 - GasAccount Set Customer Address Test - Null Value");//output for setter
        System.out.println("**********************************************");
        String nullAd = testGas.getAddress();//getter for address
        System.out.println("Original Customer Address: "+nullAd);//output with address
        testGas.setStrAddress("");//empty string entered for setter address
        System.out.println("Customer New Address: "+testGas.getAddress());//getter for address in output
        System.out.println();//clear space
        
        System.out.println("Test 13 - GasAccount Get Customer Balance Test");//output for setter
        System.out.println("**********************************************");
        double b = testGas.getBalance();//getter for balance
        System.out.println("Customer Balance £ "+b);//output with customer
        System.out.println();//clear space
        
        System.out.println("Test 14 - GasAccount Set Balance VALID Test");//output for setter for balance
        System.out.println("********************************************************");
        System.out.println("Balance Before £ "+testGas.getBalance());//getter for balance
        testGas.setDblBalance(149.0);//valid values for setter entered into parameter for balance
        System.out.println("New Balance£ " +testGas.getBalance());//output with customer
        System.out.println();//clear space
        
        System.out.println("Test 15 - GasAccount Set Balance WITH ZERO VALUE Test");//output for setter for balance
        System.out.println("********************************************************");
        System.out.println("Balance Before £ "+testGas.getBalance());//getter for balance
        testGas.setDblBalance(0.0);//valid value entered into parameter for setter 
        System.out.println("New Balance£" +testGas.getBalance());//output for getter for balance
        System.out.println();//clear space
        
        System.out.println("Test 16 - GasAccount recordUnits -  Valid Input - Test");//output for entering units, changing balance
        System.out.println("***********************************************************");
        System.out.println("Current Balance £ "+testGas.getBalance());//getter for balance in output
        double unitsAdded = 1768.0;//unit to be added 
        System.out.println("Units Added "+unitsAdded);// output with units
        String result = testGas.recordUnits(1768.0);//valid value entered into parameter
        System.out.println("New Balance £ "+testGas.getBalance());//getter for balance
        System.out.println(result);//string entered 
        System.out.println();//clear space
        
        System.out.println("Test 17 - GasAccount recordUnits - NEGATIVE VALUE - Test");//output test for entering Negative value
        System.out.println("***********************************************************");
        System.out.println("Current Balance £ "+testGas.getBalance());//getter for current balance
        //System.out.println("Current Units "+G1.getUnits());
        double unitsNeg = -1768.0;//variable for negative output
        System.out.println("Units Added "+unitsNeg);//output for negative balance
        result = testGas.recordUnits(-1768.0);//negative amount entered into parameters
        System.out.println("New Balance £ "+testGas.getBalance());//getter for balance
        System.out.println(result);//string entered
        System.out.println();//clear space

        System.out.println("Test 18 - GasAccount recordUnits - ZERO VALUE - Test");//zero output test
        System.out.println("***********************************************************");
        System.out.println("Current Balance £ "+testGas.getBalance());//getter for balance
        double unitsZero = 0.0;//zero value given to variable
        System.out.println("Units Added "+unitsZero);//variable used in output
        result = testGas.recordUnits(0.0);//zero value entered into parameter
        System.out.println("New Balance £ "+testGas.getBalance());//getter for balance in output
        System.out.println(result);//string entered
        System.out.println();//clear space
        
        System.out.println("Test 19 - GasAccount Get Cost of each Unit Test");//getter for unit cost
        System.out.println("***********************************************");
        double c = testGas.getUnitCost();//variable created for getter
        System.out.println("Unit Cost: "+c);//output for unit cost
        System.out.println();//clear space
        
             
        System.out.println("Test 20 - GasAccount Update The Individual Unit Cost VALID Test");//output for each unit cost
        System.out.println("*********************************************************");
        double unit = testGas.getUnitCost();//variable for getter created
        System.out.println("Existing Unit Cost£ "+unit);//output for existing unit cost
        testGas.updateUnitCost(0.35);//Valid value entered into parameter for method 
        double newCost = 0.35;//Variable created for valid amount 
        System.out.println("Change Cost To£ "+newCost);//output for new cost
        unit = testGas.getUnitCost();//varibale for getter created for output
        System.out.println("New Cost of Each Unit Confirmed: "+unit);//output for unit cost
        System.out.println();//clear space
        
        System.out.println("Test 21 - GasAccount Update The Individual Unit Cost with a negative value Test");//negative test output for each unit cost
        System.out.println("*******************************************************************************");
        unit = testGas.getUnitCost();//variable created for each getter for each unit cost
        System.out.println("Existing Unit Cost: "+unit);//output for unit cost
        testGas.updateUnitCost(-0.35);//negative value entered into parameter of method
        newCost = -0.35;//variable created for negative value
        System.out.println("Change Cost To: "+newCost);//output for new cost
        unit = testGas.getUnitCost();//variable for getter for unit cost
        System.out.println("New Cost of Each Unit: "+unit);//output for unit cost
        System.out.println();//clear space
        
        System.out.println("Test 22 - GasAccount Update The Individual Unit Cost with a ZERO value Test");//output for zero test 
        System.out.println("*******************************************************************************");
        unit = testGas.getUnitCost();//variable for getter created
        System.out.println("Existing Unit Cost: "+unit);//output for unit cost
        testGas.updateUnitCost(0.0);//zero value entered into parameter
        newCost = 0.0;//variable created for zero value
        System.out.println("Change Cost To: "+newCost);//output for new cost
        unit = testGas.getUnitCost();//variable created for getter method
        System.out.println("New Cost of Each Unit: "+unit);//output for unit cost
        System.out.println();//clear space
        
        System.out.println("Test 23 - GasAccount Deposit Valid Amount Test");//output for valid deposit test
        System.out.println("*********************************************");
        double origBal = testGas.getBalance();//variable created for getter for balance
        System.out.println("Original Balance £ "+origBal);//output for original balance
        testGas.deposit(20.0);//valid value entered into method with variable created
        double d = 20.0;//variable created for valid value
        System.out.println("Amount to deposit £ "+d );//output for new balance
        origBal = testGas.getBalance();//variable created for getter method
        System.out.println("Remaining Balance £ "+origBal);//variable used in output
        System.out.println();//clear space
        
        System.out.println("Test 24 - GasAccount Deposit An Negetive Amount Test");//test for negative values in deposit
        System.out.println("****************************************************");
        origBal = testGas.getBalance();//variable created for method getter balance
        System.out.println("Balance £ "+origBal);//output for variable balance
        testGas.deposit(-10.0);//negative value entered into parameter of method
        double neg = -10.0;//variable created for negative value
        System.out.println("Amount to Deposit £ "+neg );//varible for negative value used in output
        origBal = testGas.getBalance();//variable created for method getter for balance
        System.out.println("Remaining Balance £ "+origBal);//variable used in output for original balacne
        System.out.println();//clear space
        
        System.out.println("Test 25 - GasAccount Deposit An Zero Amount Test");//zero deposit test
        System.out.println("****************************************************");
        origBal = testGas.getBalance();//variable created for getter method for balance
        System.out.println("Balance £ "+origBal);//variable used in output
        testGas.deposit(0.0);//zero value entered into parameter 
        double zero = 0.0;//variable created for zero value 
        System.out.println("Amount to Deposit £ "+zero );//variable used for out
        origBal= testGas.getBalance();//variable created for getter method for balance
        System.out.println("Remaining Balance £ "+origBal);//variable used in output for balance
        System.out.println();//clear space
        
        System.out.println("Test 26 - GasAccount Get No of Units Used Test");//input test for getter units used
        System.out.println("**********************************************");
        double u = testGas.getUnits();//variable created for getter method
        System.out.println("Units Used: "+u);//variable used in output
        System.out.println();//clear space
        
        System.out.println("Test 27 - GasAccount Set No Of Units Test");//test input used in setter for units used 
        System.out.println("********************************************************");
        System.out.println("Units Before: "+testGas.getUnits());//output for getter method
        testGas.setDblUnits(1836.0);//valid value entered in parameter for setter method
        System.out.println("New Units: " +testGas.getUnits());//getter used in output
        System.out.println();//clear space
        
        System.out.println("Test 28 - GasAccount Set No Of Units WITH ZERO VALUE Test");//test zero input used in setter
        System.out.println("********************************************************");
        System.out.println("Units Before: "+testGas.getUnits());//getter method used in output
        testGas.setDblUnits(0.0);//valid value used in parameter for setter method
        System.out.println("New Units: " +testGas.getUnits());//getter used in output
        System.out.println();//clear space
        
        System.out.println("Test 29 - GasAccount Set No Of Units WITH NEGATIVE VALUE Test");//test negative input
        System.out.println("********************************************************");
        System.out.println("Units Before: "+testGas.getUnits());//getter method used in output
        testGas.setDblUnits(-10.0);//negative value entered into setter
        System.out.println("New Units: " +testGas.getUnits());//getter used in output
        System.out.println();//clear space
        
        
       
}//end of main
    
   
}//end of class
