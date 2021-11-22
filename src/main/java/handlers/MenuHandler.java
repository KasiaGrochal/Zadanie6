package handlers;

public class MenuHandler {

    public static int getAction() {
        return UserInputHandler.getInputInt(InputIntTypeHandler.ACTION);
    }

    public static void shutDown() {
        PrintToUserHandler.printShutDownInfo();
        System.exit(0);
    }

}
