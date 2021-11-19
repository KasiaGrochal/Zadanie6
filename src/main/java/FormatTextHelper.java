public class FormatTextHelper {

    public static String formatMovieText(Movie movie) {
        return movie.toString().replace("[", "").replace("]", "");

    }
}
