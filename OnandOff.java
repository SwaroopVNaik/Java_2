import java.lang.classfile.instruction.SwitchCase;
import java.util.*;

public class OnandOff {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a :");
        int a = sc.nextInt();
        System.out.println("Enter the number b");
        int b = sc.nextInt();

        // // Switch 
        // switch(button){
        //     case 1 : System.out.println("hello");
        //     break;

        //     case 2 : System.out.println("Namaste");
        //     break;

        //     case 3 : System.out.println("Bonjour");
        //     break;

        //     default : System.out.println("Invalid Button");
        // }

        System.out.println("Choose an Operation");
        System.out.println("1 : Addition (+)");
        System.out.println("2 : Substarction (-)");
        System.out.println("3 : Mulitplication (*)");
        System.out.println("4 : division (/)");
        System.out.println("5 : Modulo (%)");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The Sum of a and b is : " + ( a + b));                
                break;
            
            case 2:
                System.out.println("The Difference of a and b is : " + (a - b));
                break;
            
            case 3:
                System.out.println("The Multiplication of a and b is : " + (a * b));
                break;

            case 4:
                System.out.println("The division of a and b is : " + (a / b));
                break;
            
            case 5:
                System.out.println("The modulo of a and b is : " + (a % b));
                break;

            default:
                System.out.println("You have entered a invalid statement !.Check the choice options and try again");
                break;
        }

        System.out.println("Thank you.....!");

    }
}