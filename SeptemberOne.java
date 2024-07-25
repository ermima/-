
package ermias;
/**
 * A class with name SeptemberOne 
 * that returns the day of Ethiopian new year
 * for any years given from the user
 * 
 */
import static ermias.ForgottenDate.beforJesusChrist;
import java.util.Scanner;

public class SeptemberOne extends ForgottenDate {
    public int meteneRabet;
    public int Remainder;
    
    SeptemberOne(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter year:");
        year=scanner.nextInt();  
        meteneRabet= (beforJesusChrist+year)/4;
        Remainder = (meteneRabet+beforJesusChrist+year)%7;      
    }
    public String SeptOne(){
        switch (Remainder) {
            case 1 : septemberOne = "Tuesday";
            break;
            case 2 : septemberOne = "Wednsday";
            break;
            case 3 : septemberOne = "Thursday";
            break;
            case 4 : septemberOne = "Friday";
            break;
            case 5 : septemberOne = "Saturday";
            break;
            case 6 : septemberOne = "Sunday";
            break;
            case 0 : septemberOne = "Monday";
            break;
            default : {
            }
        }
        return septemberOne;
    }
    /**
     * A method that returns tnteAon
     * tnteAon is a first day of world created 
     * according to the believes in Ethiopian orthodox tewahido
     * and Ethiopian calender experts. 
     * tnteAon used to get the forgotten date
     * @return 
     */
    public int tnteAon(){
         switch (septemberOne) {
            case "Wednsday" : tnteAon = 1;
             break;
            case "Thursday" : tnteAon = 2;
             break;
            case "Friday" : tnteAon = 3;
             break;
            case "Saturday" : tnteAon = 4;
             break;
            case "Sunday" : tnteAon = 5;
             break;
            case "Monday" : tnteAon = 6;
             break;
            case "Tuesday" : tnteAon = 0;
             break;
            default : {
            }
        } 
         return tnteAon;
     }
}
