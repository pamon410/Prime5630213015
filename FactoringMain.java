package factoringmain;

import java.util.Scanner;

public class FactoringMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 1;
        while (number != 0) {           
            System.out.print("Enter Number :");
            number = sc.nextInt();
            factoring x = new factoring();
            x. factoring(number);

        }
    }
}
