import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        MovieLibrary movieLibrary = new ObjectMapper().readValue(new URL("file:src/main/resources/test.json"), MovieLibrary.class);

        while (true) {
            MenuHandler.getMenu();

            switch (MenuHandler.getAction()) {
                case 1:
                    PrintToUserHelper.printMovieTitleFromMovieList(movieLibrary.getMovieListByDateRange());
                    break;
                case 2:
                    PrintToUserHelper.printMovieDetails(movieLibrary.getRandomMovie());
                    break;
                case 3:
                    PrintToUserHelper.printMovieTitleFromMovieList(movieLibrary.getMovieListWithSpecificActor());
                    break;
                case 4:
                    MenuHandler.shutDown();
                default:
                    PrintToUserHelper.printInvalidInput();
            }
        }
    }
}
