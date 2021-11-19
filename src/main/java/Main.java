import com.fasterxml.jackson.databind.ObjectMapper;
import handlers.MenuHandler;
import handlers.PrintToUserHandler;
import movieFactory.MovieLibrariesManager;
import movieFactory.MovieLibrary;

import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {

        MovieLibrary movieLibrary = new ObjectMapper().readValue(new URL(MovieLibrariesManager.listForAdults), MovieLibrary.class);

        while (true) {
            MenuHandler.getMenu();

            switch (MenuHandler.getAction()) {
                case 1:
                    PrintToUserHandler.printMovieTitleFromMovieList(movieLibrary.getMovieListByDateRange());
                    break;
                case 2:
                    PrintToUserHandler.printDetailsForRandomMovie(movieLibrary.getRandomMovie());
                    break;
                case 3:
                    PrintToUserHandler.printMovieTitleFromMovieList(movieLibrary.getMovieListWithSpecificActor());
                    break;
                case 4:
                    MenuHandler.shutDown();
                default:
                    PrintToUserHandler.printInvalidInput();
            }
        }
    }
}
