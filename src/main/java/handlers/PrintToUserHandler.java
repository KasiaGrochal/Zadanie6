package handlers;

import movieFactory.Movie;

import java.util.List;

public class PrintToUserHandler {

    public static void askForFullName() {
        System.out.println("Please type actor's full name:");
    }

    public static void askForYearRange(InputIntTypeHandler yearRange) {
        System.out.println("Please type in" + yearRange.getDisplayName() + "which year you'd like to search:");
    }

    public static void printNoMovieWasFound() {
        System.out.println("No movie was found");
    }

    public static void printSearchResult() {
        System.out.println("List of movies that were found:");
    }

    public static void printDetailsForRandomMovie(Movie movie) {
        System.out.println("Lottery machine has picked a movie for you: ");
        printMovieDetails(movie);
    }

    public static void printInvalidInput() {
        System.out.println("Invalid input, please try again");
    }

    public static void printShutDownInfo() {
        System.out.println("Closing the app...");
    }

    public static void printMovieTitle(String movieTitle) {
        System.out.println("\t" + movieTitle);
    }

    public static void printMovieTitleFromMovieList(List<Movie> movieList) {
        if (movieList.isEmpty()) {
            PrintToUserHandler.printNoMovieWasFound();
        } else {
            PrintToUserHandler.printSearchResult();
            for (Movie movie : movieList) {
                PrintToUserHandler.printMovieTitle(movie.getTitle());
            }
        }
    }

    public static void printMovieDetails(Movie movie) {
        System.out.println(FormatTextHandler.formatMovieText(movie));
    }

    public static void printMenu() {
        System.out.println(
                "\nPlease type an integer in order to process the corresponding action\n" +
                        "\t1 - Search movie list by date range.\n" +
                        "\t2 - Print the details of a random movie.\n" +
                        "\t3 - Search movie list by actor's full name.\n" +
                        "\t4 - Close the application.");
    }
}
