package handlers;

import movieFactory.Movie;

public class FormatTextHandler {

    public static String formatMovieText(Movie movie) {
        return movie.toString().replace("[", "").replace("]", "");
    }
}
