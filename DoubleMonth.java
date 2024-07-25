
package ermias;

import java.util.Scanner;

/**
    * A class with name DoubleMonth 
    * that is used to accept Month of the forgotten day from user
    * it accept the month in number
    * and return it's double value(twice month).
    * 
 * @author user
 */
public class DoubleMonth extends ForgottenDate {
    DoubleMonth(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the month of Forgotten date(enter in number):");
        doubleMonth = 2*scanner.nextInt();
    }
    public int doubleMonth(){
        return doubleMonth;
    }
}
