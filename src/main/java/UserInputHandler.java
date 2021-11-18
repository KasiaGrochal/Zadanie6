import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHandler {


    public static int getInputInt(){
        Scanner scanner = new Scanner(System.in);
        int input =0;
        for (int i=0; i<1;i++){
            try {
                input= scanner.nextInt();
            } catch (InputMismatchException e) {
                i--;
                System.out.println("Invalid input, please type in an integer value.");
                scanner.nextLine();
            }
        }
        return input;
    }

    public static String getInputString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
