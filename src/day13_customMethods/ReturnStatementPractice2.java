package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice2 {
    public static void main(String[] args) {
        int number= new Scanner(System.in).nextInt();

        if (number<1||number>7){
            System.err.println("Invalid Number: "+number);
            return;// exit the main mathod
        }
        System.out.println( (number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wedn":
                (number==4)?"Thur":(number==5)?"Friday":(number==6)?"Saturday":"Sunday");

    }

}