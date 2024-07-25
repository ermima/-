
/**
 * OBJECT ORIENTED PROGRAMMING(OOP) SEMISTER PROJECT   
 */

/**
 * LET'S START THE PROGRAM 
 * THIS IS THE MAIN CLASS
 * WITH THE MAIN METHOD 
 * AND THE EXCUTION BEGINS HERE.
 */
package ermias;
/**
 * 
 * @author user
 */
public class ForgottenDate {
    /**
     * lets declare class variables
     */
    final public static int beforJesusChrist=5500;
    public int doubleMonth;
    public String septemberOne;
    public int tnteAon;
    public int year;
    public static int choice;
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println("==========================FORGOTTEN DAY FINDER IN ETHIOPIAN CALENDER"
                + "=========================");
        YourDate lostDate = new YourDate();
        System.out.println("Your forgotten date: "+lostDate.yourDate());
        
    }
    
}
