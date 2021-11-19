import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHandler {

    public static int getInputInt2(InputIntTypeHelper yearRange) {
        Scanner scanner = new Scanner(System.in);
        switch (yearRange) {
            case FROM:
                PrintToUserHelper.askForYearRange(InputIntTypeHelper.FROM);
                break;
            case UNTIL:
                PrintToUserHelper.askForYearRange(InputIntTypeHelper.UNTIL);
                break;
            case ACTION:
                break;
        }
        int input = 0;
        for (int i = 0; i < 1; i++) {
            try {
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                i--;
                PrintToUserHelper.printInvalidInput();
                scanner.nextLine();
            }
        }
        return input;
    }

    public static String getInputFullName() {
        Scanner scanner = new Scanner(System.in);
        PrintToUserHelper.askActorFullName();
        return scanner.nextLine();
    }
}
