
package gasmenu;


import java.awt.Desktop;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 * This program class GasMenu,is an update for an existing Gas Account system. 
 * 
 * It will display a menu list which will give the user options to get all 
 * details of an existing customer account and details for new customers. It will
 * return error message when negative values are entered. It will allow for the
 * setting of new costs per unit. It will also have an exit choice for the user.
 * 
 * Input: It will allow for user input in the menu choice. It will allow for input
 * of a deposited amount in pounds(£),also for inputing of units used and the 
 * calculation of gas units per unit cost. The units used 
 * times unit cost will calculate the balance.
 * 
 * 
 * Output: It will output the customer balance after deposit has been entered. When
 * the user enters an invalid input it will return a string, 'Error - Try Again!'.
 * 
 * Libraries Used: Scanner from - java.util.Scanner
 * 
 * @author Niall Curley
 * @product Gas Account Menu class
 * @version 1.1
 * @created 14/03/2017
 * @modified 26/03/2017
 * Here I am
 */

public class GasMenu {

    
    static Scanner input = new Scanner(System.in);
    /**
     * This void method outputs an option menu for the users guidance
     */
    static void displayMenu(){
        System.out.println("*********Business Account************");//name of account
        System.out.println("*************************************");
        System.out.println("Option 1 : Create New Customer ");//Option for creating a new customer
        System.out.println("Option 2 : Deposit An Amount ");//Option for depositing an amount
        System.out.println("Option 3 : Enter Units Used ");//Option for entering units used by customer
        System.out.println("Option 4 : Display Balance ");//Option for displaying current balance
        System.out.println("Option 5 : Display Full Account Details ");//Option to display customers full account
        System.out.println("Option 6 : Amend Discount ");//Option to amend business discount
        System.out.println("Option 7 : Amend Cost Per Unit ");//Option to amend cost of each unit
        System.out.println("Option 8 : Help For User ");//Option to see short user guide
        System.out.println("Option 9 : Send Email - BALANCE OVERDUE ");//Option to see short user guide
        System.out.println("Option 10: Exit ");//Option to Exit 
        System.out.println();
    }//End of method display menu
    
    
    /**
     * This method allows for entering the choice of an option at least once
     * if input type is wrong it will call an exception 'Error - Try Again!, and
     * offer it again.
     * @return 
     */
    static int getSelection(){
        int choice = 0;//set to zero
        boolean ok = false;// boolean rule
        do {
            System.out.print("Enter choice: ");
            try {// try condition - block
                choice = input.nextInt();//input for user
                ok = true;
            }//end of try 
            catch(Exception ex){//catch statement maintains normal flow of program
                System.out.println("Error - Try Again!");
                input.nextLine();//Clear data for next command
            }//end of catch 
        }//end of do while loop 
        while(ok == false);
        return choice;
    }//end of getSelection method
    
    /**
     * This void method outputs the help menu  - It is accessed by choosing option 8. It details
     * step by step details of programs options and operations, valid and invalid inputs.
     * 
     */
    static void helpMenu(){
        System.out.println("****************************Help Menu**********************************");
        System.out.println("*********Customer Must Be Created First By Choosing Option 1***********");
        System.out.println();
        System.out.println("*************************Create New Customer****************************");
        System.out.println("Enter Choice: 1 - Press Enter");
        System.out.println("Enter Reference Number - e.g '10284'- Press Enter");
        System.out.println("Enter Full Name Of Custmer - e.g 'John Taylor' - Press Enter");
        System.out.println("Enter Customer Address - e.g '28 Farnam Road'- Press Enter");
        System.out.println("Enter Units Used - e.g '5468.0'- Press Enter");
        System.out.println("Enter Discount - e.g '12.5'- Press Enter");
        System.out.println();
                            
        System.out.println("*************************Deposit An Amount******************************");
        System.out.println("Enter Choice: 2 - Press Enter");
        System.out.println("Enter The Amount The Customer Wants To Pay Of Their Balance - e.g '25.0'\n - Press Enter");
        System.out.println();
                           
                            
        System.out.println("*************************Enter Units Used*******************************");
        System.out.println("Enter Choice: 3 - Press Enter");
        System.out.println("Enter The Amount Of Units That Customer Has Used - e.g '3784.0'\n - Press Enter");
        System.out.println();
                           

        System.out.println("*************************Display Balance********************************");
        System.out.println("Enter Choice: 4 - Press Enter" );
        System.out.println("Balance Will Be Displayed");
        System.out.println();
                            
        System.out.println("*********************Display Full Account Details************************");
        System.out.println("Enter Choice: 5 - Press Enter");
        System.out.println("Customer Details Will Be Displayed");
        System.out.println();
                            
        System.out.println("**************************Amend Discount*********************************");
        System.out.println("Enter Choice: 6 - Press Enter");
        System.out.println("Enter The Discounted Rate, e.g - '12.5 - Press Enter");
        System.out.println();
                            
        System.out.println("************************Amend Cost Per Unit*******************************");
        System.out.println("Enter Choice: 7 - Press Enter");
        System.out.println("Enter The New Cost Per Unit, e.g - '0.39 - Press Enter");
        System.out.println();
                            
        System.out.println("*******************Help For User**************************");
        System.out.println("Enter Choice: 8 - Press Enter");
        System.out.println("Read Information On Each Option");
        System.out.println();

        System.out.println("*************Send Email BALANCE OVERDUE******************");
        System.out.println("Enter Choice: 9 - Press Enter");
        System.out.println("Confirm customers email and address and press enter and\nsee "
                + "outlook for sending email to customer about outstanding balance");
        System.out.println();
        
        System.out.println("*************************Exit*****************************");
        System.out.println("Enter Choice: 10 - Press Enter");
        System.out.println("This Will Exit The Program");
        System.out.println();
    }
    //new code D3
    public static void mailto(List<String> recipients, String subject,
        String body) throws IOException, URISyntaxException {
    String uriStr = String.format("mailto:%s?subject=%s&body=%s",
            join(",", recipients), // use semicolon ";" for Outlook!
            urlEncode(subject),
            urlEncode(body));
    Desktop.getDesktop().browse(new URI(uriStr));
}

private static final String urlEncode(String str) {
    try {
        return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
    } catch (UnsupportedEncodingException e) {
        throw new RuntimeException(e);
    }
}

public static final String join(String sep, Iterable<?> objs) {
    StringBuilder sb = new StringBuilder();
    for(Object obj : objs) {
        if (sb.length() > 0) sb.append(sep);
        sb.append(obj);
    }
    return sb.toString();
}
    /**
     * This is the main method that will contain the menu for the program. It will 
     * offer a number of options for the users guidance. It will call on methods in
     * the object classes 'GasAccount & BusinessAccount' and will draw on inheritance a
     * & overriding methods.
     * @param args BusinessAccount 
     */
    //public static void main(String args[]){

public static void main(String[] args) throws IOException, URISyntaxException {
    

        
    BusinessAccount acc = null;//null valule for setting parmeters 
         
       
        boolean quit = false;//boolean set to false
        
        do {//do while loop allowing for at least one attempt choosing an option
            displayMenu();//method called to display options
            int value = getSelection();// initalizing getSelection method that has been called 
            
            switch(value){//switch set for options
                case 1  :   try {//try allows user to input in case 1
                                System.out.print("Enter Reference Number: ");
                                int refNo= input.nextInt();//input for reference number
                                System.out.println("Customer Reference No: " + refNo);//output for reference no.

                                System.out.print("Enter Customer Name: ");
                                input.nextLine();//clearing of any input
                                String bName= input.nextLine();//input for string name
                                //acc.setStrName(bName);//instance for depositing amount 
                                //String gName = acc.getName();
                                System.out.println("Customer Name: " +bName);//output for name
                               

                                System.out.print("Enter Customer Address: ");
                                String bAddress= input.nextLine();//input for string address
                                System.out.println("Customer Address: " +bAddress);//output for address
                                
                                //D3 new code for email address
                                System.out.print("Enter Email Customer Address: ");
                                String cusEmail= input.nextLine();//input for string address
                                System.out.println("Customer Email Address: " +cusEmail);//output for address
                                
                                System.out.print("Enter Units Used: ");
                                double busUnits= input.nextDouble();//input for double units used.
                                System.out.println("Current Units Used: " + busUnits);//output for unit used by customer

                                System.out.print("Enter Discount: ");
                                input.nextLine();//clearing of input
                                double busDis= input.nextDouble();//double enter business customer discount
                                System.out.println("Customers Discount: " +busDis+ "%\n\n");//output for customers discount

                                acc = new BusinessAccount(refNo, bName, bAddress, busUnits, busDis, cusEmail);//new instance of an object with null parameters created
                            }//End of Try Statment
                
                            catch(Exception ex){//exception for erroneous input with option to try again
                                System.out.println("Error in input - try again!");
                                input.nextLine();//clear next line
                                System.out.println();

                            }// End of Catch Exception
                            
                                break;//stop of case 1
                            
                case 2  :   try{// try statement for allowing entering of correct input
                                System.out.print("Enter Amount To Deposit: ");
                                input.nextLine();//clearing of last input
                                double depBus = input.nextDouble();//input for entering deposit
                                acc.deposit(depBus);//instance for depositing amount 
                                System.out.printf("Customer Balance: £" + "%1$.2f", acc.getBalance());//method call for get balance from GasAccount
                                System.out.println();
                                System.out.println();

                            
                            }//End of Try Statment
                
                            catch(Exception ex){//catch exception - user must use option 1 first
                                System.out.println("Error - Enter Numeric Value or Create New Customer First 'Option 1'");
                                input.nextLine();//clearing input
                                System.out.println();// space

                            }// End of Catch Exception
                                break;//end of case 2
                            
                case 3  :   try{//allows for entering of correct input
                                System.out.print("Enter Units Used: ");//units used
                                double recUnits = input.nextDouble();//input for number of units
                                acc.recordUnits(recUnits);//number of units entered into parameter of method
                                System.out.printf("Customer Balance: £" + "%1$.2f", acc.getBalance());//method call to display balance in output
                                System.out.println();
                                System.out.println();

                                
                                
                            }//End of Try Statment
                
                            catch(Exception ex){//exception for erroneous input with option Create Customer First
                                System.out.println("Error - Enter Numeric Values Or Create Customer First - Option 1");// output for choice
                                input.nextLine();//input another option
                                System.out.println();
                                

                            }// End of Catch Exception
                                break;//End of case 3
                            
                case 4  :   try{//allows for entering of correct input
                                //double getBal = acc.getBalance();//method call for balance
                                System.out.printf("Customer Balance: £" + "%1$.2f", acc.getBalance());//method call - get balace from object GasAccount
                                //System.out.printf("Your Balance £ "+getBal + "%1$.2f" );//display balance in output
                                System.out.println();//clear line
                                System.out.println();//clear line

                
                            }//End of Try Statment
                
                            catch(Exception ex){//exception for erroneous input with option Create Customer First
                                System.out.println("Error - Create Customer First - Option 1");//output for another option
                                input.nextLine();//enter choice of option
                                System.out.println();//clear space

                            }// End of Catch Exception
                            break;//End of cast 4
                            
                case 5  :   try{//allows for entering of correct input
                                System.out.println("Customer Reference No: " +acc.getAccRefNo());//method call - get reference from object GasAccount
                                System.out.println("Customer Name: " +acc.getName());//method call - get name from object GasAccount
                                System.out.println("Customer Address: " +acc.getAddress());//method call - get address from object GasAccount
                                System.out.println("Customer Email Address: " +acc.getEmail());//D3 - new method call - get Email address from object GasAccount
                                System.out.println("Current Discount: " +acc.getDiscount()+"%");//method call - get discount from object GasAccount
                                System.out.println("Current Units: " +acc.getUnits());//method call - get units from object GasAccount
                                System.out.printf("Customer Balance: £" + "%1$.2f", acc.getBalance());//method call to get balance from GasAccount
                                System.out.println();//clear line
                                System.out.println();//clear line

                            }//End of Try Statment
                
                            catch(Exception ex){//exception for erroneous input with option Create Customer First
                                System.out.println("Error - Create Customer First - Option 1");// output for another option
                                input.nextLine();// enter another choice
                                System.out.println();//clear space

                            }// End of Catch Exception
                                break;//end of case 5
                            
                case 6  :   try{//allows for entering of correct input
                                System.out.print("Enter New Discount Rate: ");//output request for discount
                                double amendRate = input.nextDouble();//input for new rate
                                acc.setDblNewDiscount(amendRate);//parameter valule entered into method from business accout
                                System.out.println("New Discount Rate: " +acc.getDiscount()+"%");//display new discount
                                System.out.println();//clear space
                            }//End of Try Statment
                
                            catch(Exception ex){//exception for erroneous input with option Create Customer First
                                System.out.println("Error - Enter Numeric Value or Create New Customer First 'Option 1");//output for another option 
                                input.nextLine();//enter another choice
                                System.out.println();//clear space

                            }// End of Catch Exception
                                break;//end of case 6
                    
                case 7  :   try{//allows for entering of correct input
                                System.out.print("Enter New Cost Per Unit: ");//output request for new unit cost
                                double amendUnit = input.nextDouble();//input for unit cost
                                acc.updateUnitCost(amendUnit);//parameter value entered into method call from Gas Account
                                System.out.println("New Unit Cost £ " +acc.getUnitCost());//output for balance
                                System.out.println();//clear space
                            }//End of Try Statment
                
                            catch(Exception ex){//exception for erroneous input with option Create Customer First
                                System.out.println("Error - Enter Numeric Value or Create New Customer First 'Option 1");//output for options choice
                                input.nextLine();//input option 
                                System.out.println();//clear space

                            }// End of Catch Exception
                                break;//end of case 7
                            
                             
                            /*case 8 -  This is the output for 'Help For User'. All Options from  1 - 9 are displayed. Customer
                                is given a step by step process of using the different options.
                                */              
                case 8  :   helpMenu();//method call for help menu
                            break;//end of case 8
                            
                            /**
                             * D3 - This is not part of the specifications but is a suggested improvement.
                             * The customer can be sent an email if there account is overdue too long.
                             */
                case 9  :   //System.out.print("Customer Email Address " +acc.getEmail());
                            //input.nextLine();
                            System.out.println("Customers Email Address: "+acc.getEmail());
                            System.out.print("Enter Customers Email Address to Confirm\nExample\nPSage@belfastmet.ac.uk & See Outlook: ");

                            input.nextLine();
                            String sendEmail = input.nextLine();
                            System.out.println();
                            
                            mailto(Arrays.asList(sendEmail), "FLO-GAS    URGENT OUTSTANDING BALANCE",
                            "**************OVERDUE ACCOUNT**************\n\nPLEASE CONTACT OUR ACCOUNTS DEPT TO ARRANGE PAYMENT,\n"
                                + "IF PAYMENT IS NOT MADE WITHIN FIVE WORKING DAYS "
                                + "SERVICES\n MAY BE SUSPENDED\n\n\n\nPlease Contact Our Account Dept\n"
                                + "02890 549135\n\n");
                            break;//end of case 9
                            
                case 10 :   quit = true;//quit boolean for case 10 exit the program 
                            System.out.println("Exited Business Account");//output for exit
                            System.out.println();//clear space
                            System.out.println();//clear space

                            break;//default         
                default :   System.out.println("Error - Please select a number between 1 and 9");//default in case of erroneous input
                            System.out.println();
                            System.out.println();

            }//End Of Switch
        }
        while(quit != true);//end of quit
    }//End of Main
}//End of Class



    
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
         
    
        

        

        
        
        
        
        
        
        
        
        
