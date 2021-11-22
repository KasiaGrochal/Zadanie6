import handlers.ListDirectory;
import handlers.MenuHandler;
import handlers.PrintToUserHandler;
import movieFactory.LibrariesManager;


public class Main {

    public static void main(String[] args)  {

        LibrariesManager librariesManager = new LibrariesManager(ListDirectory.ADULTS);

        while (true) {
            PrintToUserHandler.printMenu();

            switch (MenuHandler.getAction()) {
                case 1:
                    PrintToUserHandler.printMovieTitleFromMovieList(librariesManager.getMovieLibrary().getMovieListWithinDateRange());
                    break;
                case 2:
                    PrintToUserHandler.printDetailsForRandomMovie(librariesManager.getMovieLibrary().getRandomMovie());
                    break;
                case 3:
                    PrintToUserHandler.printMovieTitleFromMovieList(librariesManager.getMovieLibrary().getMovieListWithSpecificActor());
                    break;
                case 4:
                    MenuHandler.shutDown();
                default:
                    PrintToUserHandler.printInvalidInput();
            }
        }
    }
}
