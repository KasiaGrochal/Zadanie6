package handlers;

import models.InputIntType;

public class MenuHandler {

    public static int getAction() {
        return UserInputHandler.getInputInt(InputIntType.ACTION);
    }

    public static void shutDown() {
        PrintToUserHandler.printShutDownInfo();
        System.exit(0);
    }

}
