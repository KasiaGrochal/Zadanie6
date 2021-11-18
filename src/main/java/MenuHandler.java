public class MenuHandler {

    public static void printMenu() {
        System.out.println(
                "\nPlease type an integer in order to process the corresponding action\n" +
                        "\t1 - Search movie list by date range.\n" +
                        "\t2 - Print the details of a random movie.\n" +
                        "\t3 - Search movie list by actor's full name.\n" +
                        "\t4 - Close the application.");
    }

    public static int getAction() {
        int action = UserInputHandler.getInputInt();
        return action;
    }

}
