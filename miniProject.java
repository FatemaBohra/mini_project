import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        // Mini project
        Scanner userInput = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber;

        do {
            System.out.print("Please guess a number (0-100): ");
            userNumber = userInput.nextInt();

            if (userNumber < 0) {
                break;
            } else if (userNumber == myNumber) {
                System.out.println("Yayyy...correct number!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is large");

            } else {
                System.out.println("Your number is small");
            }
        } while (userNumber >= 0);

        System.out.print("My number was: ");
        System.out.println(myNumber);
    }
}
