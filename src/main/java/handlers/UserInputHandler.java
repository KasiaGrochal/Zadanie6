package handlers;

import models.InputIntType;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHandler {

    public static int getInputInt(InputIntType inputType) {
        Scanner scanner = new Scanner(System.in);
        switch (inputType) {
            case FROM:
                PrintToUserHandler.askForYearRange(InputIntType.FROM);
                break;
            case UNTIL:
                PrintToUserHandler.askForYearRange(InputIntType.UNTIL);
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
                PrintToUserHandler.printInvalidInput();
                scanner.nextLine();
            }
        }
        return input;
    }

    public static String getInputFullName() {
        Scanner scanner = new Scanner(System.in);
        PrintToUserHandler.askForFullName();
        return scanner.nextLine();
    }
}
