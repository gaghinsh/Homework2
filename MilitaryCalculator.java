import java.util.Scanner;

public class MilitaryCalculator {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        //receiving military times
        System.out.print("Enter first military time: ");
        String time1 = input.nextLine();
        System.out.print( "Enter second military time: ");
        String time2 = input.nextLine();
        System.out.print("The difference between " + time1 + " and " + time2 + " is " + calculate(time1, time2));
        }

    public static String calculate(String one, String two){
        //split times into hours and minutes respectively
        int t1_hours = Integer.parseInt(one.substring(0,2));
        int t1_minutes = Integer.parseInt(one.substring(3));
        int t2_hours = Integer.parseInt(two.substring(0,2));
        int t2_minutes = Integer.parseInt(two.substring(3));
        //convert each military time into minutes only
        int t1 = t1_hours*60 + t1_minutes;
        int t2 = t2_hours*60 + t2_minutes;
        //find difference in minutes
        int d = (t2-t1 + 24*60)%1440;
        //change minutes back to hours and minutes
        String output = d/60 + " hours and " + d%60 + " minutes";
        return output;
    }
}