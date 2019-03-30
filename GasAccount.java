     package gasmenu;
     /**
     * This Gas Account object class, contains properties and methods, for a Gas Account.
     * Two constructors have been used for two types of Gas Accounts, first one for existing 
     * customer, second one for new customers. Methods will enable depositing of amounts
     * in pounds, the entering in of units used in order to calculate customer balance.
     * The cost of each unit will be set at 0.02, and can also be reset. All customer details 
     * in properties can be accessed and reset.
     * 
     * @author Niall Curley
     * @product GasAccount
     * @version 1.0
     * @created 14/03/2017
     * @modified 29/03/2017
     */
    public class GasAccount {
    private int intAccRefNo;//account reference number
    private String strName;//account holders name
    private String strAddress;//address of account holder
    private double dblBalance;//balance in £
    private double dblUnits;//quantity of units
    private double dblUnitCost = 0.02;//price per unit 
    private String sendEmail;//D3 - account holders email
    //Field Variables
    //Properties of Gas Account
    
    /**
     * This constructor method sets the details of the Gas Account to four parameters, account 
     * number, name, address and units used. It will receive input by the parameters
     * in GasMenu. Through creation of an instance.
     * 
     * @param intNewAccRefNo//The Account reference number.
     * @param strNewName //The customers name.
     * @param strNewAddress //The customers Address
     * @param dblNewUnits //The units that the customer has accumulated in the account.
     */
    
    public GasAccount (int intNewAccRefNo, String strNewName, String strNewAddress,
        double dblNewUnits, String newSendEmail){
    //initializing
    this.intAccRefNo = intNewAccRefNo;//new account number
    this.strName = strNewName;//new customer name
    this.strAddress = strNewAddress;//new customer address
    this.dblUnits = dblNewUnits;//number of units
    this.sendEmail = newSendEmail;
    this.dblBalance = dblNewUnits * dblUnitCost;/*calculation for balance,units 
    used and cost per individual unit*/
    
    
}//end of constructor Gas Account

    /**
    * This overloaded constructor method sets the details of the Gas Account to three 
    * parameters, account number, name and address. It will allow input through the
    * parameters in the Gas Menu through creation of an instance.
    * @param intNewAccRefNo //The customers new account number.
    * @param strNewName //The name of the customer.
    * @param strNewAddress //The address of the customer.
    */
    public GasAccount (int intNewAccRefNo, String strNewName, String strNewAddress)
{
    //initializing of constructor for a new customer
        this.intAccRefNo = intNewAccRefNo;//Customer account number initialized
        this.strName = strNewName;//Customers name initialized
        this.strAddress = strNewAddress;//Customers address initialized
        this.dblBalance = 0.0;//Customer balance set to zero
        this.dblUnits = 0.0;//Amount of units used by new customer set to zero
        this.dblUnitCost = 0.02;//Cost of each unit
        this.dblBalance = 0.0; //Calculation for balance
    
     
    }//End of method Gas Account - overloaded constructor


    /**
    * This void method allows the user to enter an amount through a parameter to pay off 
    * their balance. The deposited amount will be subtracted from the Balance. The 
    * if statement will only allow positive values. The values are entered through
    * the parameter in Gas Menu.
    * @param dblDepositAmount //The amount deposited by the customer, 
    */
    public void deposit (double dblDepositAmount){
        if(dblDepositAmount>0.0) //If statement wont allow negative values
        dblBalance = dblBalance - dblDepositAmount;//Calculation subtracts amount from balance
          
    }//End of deposit method deposit

    /**
     * This method allows for the units used by customer to be calculated to produce 
     * the new balance. These values entered can only be positive and transaction will
     * be returned as a string, positive value will return a string "Transaction Successful". 
     * Any negative values will be returned as an "Error - Must BE Positive Value".
     * 
     * @param dblUnitsUsed //units used by customer for calculating balance.
     * @return String "Transaction Successful", "Error - Must BE Positive Value".
     */
    public String recordUnits (double dblUnitsUsed){ 
    
  
    /*if else statment used to determine if valid or invalid inputs have been 
    input, inputs must be positive*/
    
    if (dblUnitsUsed<=0.0){
           
        return "Error - Must Be Positive Value";//Invalid input type
    }
     /*calculation for adding current uints
        used to balance, by multiplying units used with each unit cost */
    else {
         
         
        
        double dblCalBal;//Calculate balance
        dblCalBal = dblUnitsUsed * dblUnitCost;
        dblBalance = dblBalance + dblCalBal;
        
        
     
        return "Transaction Successful";//Valid String Output type
        
    }//end of if else statement
    
}//end of method recordUnits

    /**
    * This method allows the return of customer account number.
    * @return intAccRefNo customers reference number
    */
    public int getAccRefNo(){
        return intAccRefNo;//return account holder reference number
    }//end of method getAccRefNo

    /**
     * This void method will be used for setting the customer account number.
     * @param intAccRefNo //customer account number.
     */
    public void setIntAccRefNo(int intAccRefNo) {
        
        //if statement contains condtion that only allows account over zero.
        if(intAccRefNo>0){
        this.intAccRefNo = intAccRefNo;//paremeter initializes with value from instance.
        }// end of if statment
    }//end of method setIntAccRefNo

    /**
    * This method allows for the return of customers name.
    * @return String customer name
    */
    public String getName(){
        return strName;//returns account holders name
    }//end of method getName

    /**
     * This void method sets the customer name.
     * @param strName//customers name
     */
    public void setStrName(String strName) {
        
        //if statement with condtion for checking valid entry
        if(strName != null){
        this.strName = strName;
        }// end of if statement
        
    }//end of setStringName
    
    
    /**
    * This method allows for the return of the customers address.
    * @return String - customers address  - strAddress
    */
    public String getAddress(){
        return strAddress;//returns address
    }//end of method getAddress

    /**
     * This void method sets the address
     * @param strAddress //Customers address
     */
    public void setStrAddress(String strAddress) {
        
        //if statement with condition for valid input
        if(strAddress != null){
        this.strAddress = strAddress;// initializing parameter from instance
        }//if statement ended
        
    }//end of method setStrAddress
  
    /**
    * This method allows for return of the customers balance
    * @return double customer balance
    */
    public double getBalance(){
        return dblBalance;//returns balance
    }//end of method getBalance

    /**
     * This void method sets the balance
     * @param dblBalance //account balance
     */
    public void setDblBalance(double dblBalance) {
         if (dblBalance!=0.0){// Validation - must be greater than zero
        this.dblBalance = dblBalance;
         }//End of if statement
    }//end of void method setDblBalance
    
    /**
    * This method allows for the return of the cost of each unit.
    * @return  Cost Per Unit
    */
    public double getUnitCost(){
        return dblUnitCost;//returns unit cost
    }//end of method getUnitCost
    
    
    /**
    * This method allows for the return of number units used by the customer.
    * @return double dblUnits - units used by customer
    */
    public double getUnits(){
         return dblUnits;//returns units used
    }//end of method getUnits

    /**
     * This void method sets the number of units used
     * @param dblUnits //Units used by customer
     */
    public void setDblUnits(double dblAddUnits) {
        //if statement with condtion for validation - input must be over 0.0.
        if(dblAddUnits>0.0){
        dblUnits = dblUnits + dblAddUnits;
        //dblUnits = dblUnits + dblAddUnits;//Calculation subtracts amount from balance
        }//end of if statement
    }//end of method setDblUnits
 
    /**
    * This void method allows for the resetting of the unit cost to that inside the parameter.
    *  
    * @param dblNewUnitCost //The cost of the unit
    */
    public void updateUnitCost(double dblNewUnitCost){
    
    //if statement has conditon to only accept valid input - positive values
    if (dblNewUnitCost>0.0){// if statement only accepts positive values
        this.dblUnitCost = dblNewUnitCost;//Parameter entered changes unit cost
     
        
        }//end of if statement
    }//end of method updateUnitCost
    /**
     * D3 - This method was not part of the original specification but is a suggestion for improvement.
     * It is a getter for the customers email address.
     * @return 
     */
    public String getEmail(){
        return sendEmail;
    }
    /**
     * D3 - This method was not part of the original specification but is a suggestion for improvement.
     * It is a setter for the customers email address.
     * @param newSendEmail 
     */
    public void setEmail(String newSendEmail){
        //if statement with condition for valid input
        if(newSendEmail != null){
        this.sendEmail = newSendEmail;// initializing parameter from instance
        }//if statement ended
    }
}//end of class Gas Account
