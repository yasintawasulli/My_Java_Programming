package day07_ifStatement;

public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {

        int day = 2;
        if ( day >= 1 && day <= 7 ) {
            if ( day == 1 ) {
                System.out.println("Monday");
            } else if ( day == 2 ) {
                System.out.println("Tuesday");
            } else if ( day == 3 ) {
                System.out.println("Wednesday");
            } else if ( day == 4 ) {
                System.out.println("Thursday");
            } else if ( day == 5 ) {
                System.out.println("Friday");
            } else if ( day == 6 ) {
                System.out.println("Saturday");
            } else if ( day == 7 ) {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Invalid day");
        }
    }
}
