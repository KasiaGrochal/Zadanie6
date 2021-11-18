import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MovieLibrary {
    public List<Movie> movieList;

    public MovieLibrary() {
        movieList = new ArrayList<>();
    }


    public void printRandomMovieDetails() {
        int randomNumber = new Random().nextInt(movieList.size());
        Movie randomMovie = movieList.get(randomNumber);
        System.out.println(randomMovie.toString());
    }

    public void printMoviesByDateRange() {
        System.out.println("Please type in from which year you'd like to search:");
        int startRange = UserInputHandler.getInputInt();
        System.out.println("Please type in until which year you'd like to search:");
        int endRange = UserInputHandler.getInputInt();
        boolean found = false;
        System.out.println("\nList of movies produced from year " + startRange + " to " + endRange + ":");
        for (Movie movie : movieList) {

            if ((movie.getYearOfProduction() >= startRange) && movie.getYearOfProduction() <= endRange) {
                System.out.println("\t" + movie.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movie was found :(");
        }
    }

    public void getMovieByActorName() {
        System.out.println("First name: ");
        String firstName = UserInputHandler.getInputString();
        System.out.println("Last name: ");
        String lastName = UserInputHandler.getInputString();
        boolean found = false;
        for (Movie movie : movieList) {
            if (movie.checkMovieByActorName(firstName, lastName)) {
                System.out.println(movie.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No move was found for: " + firstName + " " + lastName);
        }
    }

}

