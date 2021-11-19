package handlers;

public class MenuHandler {

    public static void getMenu() {
        PrintToUserHandler.printMenu();
    }

    public static int getAction() {
        return UserInputHandler.getInputInt2(InputIntTypeHandler.ACTION);
    }

    public static void shutDown() {
        PrintToUserHandler.printShutDownInfo();
        System.exit(0);
    }

}
