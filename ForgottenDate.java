
/**
 * OBJECT ORIENTED PROGRAMMING(OOP) SEMISTER PROJECT
 * BY 4th YEAR COMPUTER SCIENCE SECTION A GROUP_4 STUDENTS
 * 
 * GROUP MEMBERS:                       ID
 * 1.ERMIAS ANTIGEGN .................BDU1305648
 * 2.ATSEDEMARIAM MINWUYELET..........BDU1305646
 * 3.ABAYNESH AYAL....................BDU1305793
 * 4.EPHRATA DAGNAW...................BDU1305886
 * 5.ATKLT MISGANAW...................BDU1305808
 * 6.YIGERMAL ALELGN..................BDU1305672
 * 7.AREGAHEGN GETIE..................BDU1305883
 * 8.ABEBE MEKURIAW...................
 * 
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
