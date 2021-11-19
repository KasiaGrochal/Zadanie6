public class MenuHandler {


    public static void getMenu(){
        PrintToUserHelper.printMenu();
    }


    public static int getAction() {
        return UserInputHandler.getInputInt2(InputIntTypeHelper.ACTION);
    }
    public static void shutDown(){
        PrintToUserHelper.printShutDownInfo();
        System.exit(0);
    }

}
