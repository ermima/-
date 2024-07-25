
package ermias;

import java.util.Scanner;
/**
 * A class with name ForgottenDateNumber
 * that is used to users to enter the date number they forgot to the system.
 * @author user
 */
public class ForgottenDayNumber {
    public int dayNumber;
    ForgottenDayNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter forgotten day number(1 - 30):");
        dayNumber = scanner.nextInt();
    }
    public int dayNumber(){
        return dayNumber;
    }
}
