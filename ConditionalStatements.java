import java.util.*;

public class ConditionalStatements {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number a :");
        int a = sc.nextInt();
        System.out.println("Enter the number b : ");
        int b = sc.nextInt();

        if( a ==  b){
            System.out.println("The number a and b is equal");
        }
        else if (a > b){
            System.out.println("The number a is greater then number b");
        }
        else{
            System.out.println("The number b is greater then number a");
        }

    }

}
