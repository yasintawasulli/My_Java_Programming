package day07_ifStatement;

public class Grade2 {
    public static void main(String[] args) {

        char grade = 'F';
        String result = "";
        if ( grade == 'A' ) {
            result = "Excellent";
        } else if ( grade == 'B' ) {
            result = "Great";
        } else if ( grade == 'C' ) {
            result = "Good";
        } else if ( grade == 'D' ) {
            result = "passed";
        } else{
            result = "failed";
            System.out.println(result);
        }
    }
}