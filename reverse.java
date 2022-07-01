import java.util.Scanner;

/**
 * reverse
 */
public class reverse {

    public static void main(String[] args) {
        //a program to reverse a number
        int num; 
        Scanner entry = new Scanner(System.in);   
        System.out.println("Enter a number: ");
        num = entry.nextInt();
        int reverse = 0;
        while(num != 0) {
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse of the number is: " + reverse);
    }
}