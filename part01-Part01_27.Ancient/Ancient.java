
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;
        
        // Write your program here
        System.out.println("Give a year:");
        userInput = scan.nextLine();
        
        if (Integer.valueOf(userInput) < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
