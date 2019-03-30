 
package gasmenu;

/**
 *This BusinessAccount Class is an extension of the GasAccount class. It allows 
 * for a business account to have a reduced discount on the total cost of units used. 
 * This discount is initially set at 10% but can be reset according to method setDblDiscount.
 * The method recordUnits will override the superclass method to calculate the balance of
 * a GasAccount object with the object’s discount applied to the cost of the new units
 * which in turn will be added to current balance of a BusinessAccount object.
 * This method will return a string value, ' Transaction Successful ' or Error - must 
 * be positive value.
 * @author CUR16117920
 */
public class BusinessAccount extends GasAccount{
    private double dblNewDiscount = 10.0;
    
    /**
     *
     * @param intNewAccRefNo//customer reference number.
     * @param strNewName //customer new name.
     * @param strNewAddress //customers new address
     * @param dblNewUnits //units used by customer
     * @param dblNewDiscount //discount given to customer
     */
    public BusinessAccount (int intNewAccRefNo, String strNewName, String strNewAddress,
            double dblNewUnits, double dblNewDiscount, String newSendEmail ){
    //
    super(intNewAccRefNo,strNewName,strNewAddress,dblNewUnits, newSendEmail);
    this.dblNewDiscount = dblNewDiscount;
    }

    /**
     * This void method is for setting the discounted amount
     * @param dblNewDiscount //discount amount
     */
    public void setDblNewDiscount(double dblNewDiscount) {
         if (dblNewDiscount>0.0){// Validation - must be greater than zero
        this.dblNewDiscount = dblNewDiscount;
         }//End of if statement
        //this.dblNewDiscount = dblNewDiscount;// initialized for parameter
    }//end of method setDblNewDiscount

    /**
     * The method is for returning the discounted amount.
     * @return double dblNewDiscount
     */
    public double getDiscount(){
    
        return dblNewDiscount;//discounted amount
    }//end of method getDiscount
    
    /**
     * This method is for accepting input through the parameter dblUnitsUsed and 
     * will calculate the discount which will be added to the original
     * balance.It will return a String value that will indicate whether the transaction 
     * has been successful or Error.
     * @param dblUnitsUsed //units used by customer
     * @return String recordUnits
     */
    @Override
    public String recordUnits(double dblUnitsUsed){
        
        
     if (dblUnitsUsed<0.0){//validation - less than zero - Error
           
        return "Error - Must Be Positive Value";//Invalid input type
    }
     /*calculation for adding current uints
        used to balance, by multiplying units used with each unit cost */
    else {
         //double totalCost = 0.0;
         //double disAm;
         //double newTotal;
         
         //calculate total cost - units*unitsUsed
         double totalCost = getUnitCost() * dblUnitsUsed;
         //calculate discount
         double disAm = (totalCost/100)* dblNewDiscount;
         //adding newTotal to balance
         double newTotal = totalCost - disAm;
         double balance = getBalance() + newTotal;
         //setting new balance
         setDblBalance (balance);
         
         
        return "Transaction Successful";//Valid input type - String
        }
   
    }//End of Method recordUnits   
}//End of Class 
