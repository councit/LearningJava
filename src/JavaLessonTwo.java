import java.util.Scanner;

public class JavaLessonTwo {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Your favorite number: ");

        if (userInput.hasNextInt()) {
            int numberEntered = userInput.nextInt();

            System.out.println("Your entered " + numberEntered);

            int numEnteredTimes2 = numberEntered + numberEntered;


        } else {

            System.out.println("Enter an integer next time");

        }
    }

}
