import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
       MovieLibrary movieLibrary = new ObjectMapper().readValue(new URL("file:src/main/resources/test.json"), MovieLibrary.class);

        while (true){
            MenuHandler.printMenu();

            switch (MenuHandler.getAction()){
                case 1: movieLibrary.printMoviesByDateRange();
                break;
                case 2: movieLibrary.printRandomMovieDetails();
                break;
                case 3: movieLibrary.getMovieByActorName();
                break;
                case 4:
                    System.out.println("Closing the app...");
                    System.exit(0);
                    default:
                    System.err.println("Action not found");
            }
        }
    }
}
