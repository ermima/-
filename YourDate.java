
package ermias;

/**
 * A class with name YourDate 
 *      ->return forgotten date
 * inherits from ForgottenDate class 
 * 
 * @author user
 */
public class YourDate extends ForgottenDate {
    public String yourDate;
    private int check;
    private int remainder;
    public int amet;
    SeptemberOne sept = new SeptemberOne();
    ForgottenDayNumber ye_eletu_ken = new ForgottenDayNumber();
    DoubleMonth atsfeWorha = new DoubleMonth();
    public String yourDate(){ 
        System.out.println("Ethiopian new year of "+sept.year+" is on "+sept.SeptOne());
        System.out.println("TnteAon: "+sept.tnteAon());
        System.out.println("Remainder: "+sept.Remainder);
        System.out.println("rabet: "+sept.meteneRabet);
        //System.out.println("Tnte Aon: "+dayOfLight.tnteAon);
        System.out.println("Atsfe Worha: "+atsfeWorha.doubleMonth);
        System.out.println("You select "+ye_eletu_ken.dayNumber+"/"+atsfeWorha.doubleMonth/2+"/"+sept.year +": ");                       
        check = sept.tnteAon() + atsfeWorha.doubleMonth()+ye_eletu_ken.dayNumber;
        remainder = check%7;
        switch (remainder) {
            case 1 : yourDate = "Sunday";
            break;
            case 2 : yourDate = "Monday";
            break;
            case 3 : yourDate = "Tuesday";
            break;
            case 4 : yourDate = "Wednsday";
            break;
            case 5 : yourDate = "Thursday";
            break;
            case 6 : yourDate = "Friday";
            break;
            case 0 : yourDate = "Saturday";
            break;
            default :{
            }
        }
        return yourDate;
    }
}
