import handlers.*;
import models.InputIntType;
import movieFactory.LibrariesManager;


public class Main {

    public static void main(String[] args)  {

        LibrariesManager librariesManager = new LibrariesManager(ListDirectory.ADULTS);

        while (true) {
            PrintToUserHandler.printMenu();

            switch (MenuHandler.getAction()) {
                case 1:
                    PrintToUserHandler.
                            printMovieTitleFromMovieList(librariesManager.
                            getMovieLibrary().
                            getMovieListWithinDateRange(UserInputHandler.getInputInt(InputIntType.FROM), UserInputHandler.getInputInt(InputIntType.UNTIL)));
                    break;
                case 2:
                    PrintToUserHandler.printDetailsForRandomMovie(librariesManager.getMovieLibrary().getRandomMovie());
                    break;
                case 3:
                    PrintToUserHandler.
                            printMovieTitleFromMovieList(librariesManager.getMovieLibrary().getMovieListWithSpecificActor(UserInputHandler.getInputFullName()));
                    break;
                case 4:
                    MenuHandler.shutDown();
                default:
                    PrintToUserHandler.printInvalidInput();
            }
        }
    }
}
