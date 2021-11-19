import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MovieLibrary {
    public List<Movie> movieList;

    public MovieLibrary() {
        movieList = new ArrayList<>();
    }

    public Movie getRandomMovie() {
        int randomNumber = new Random().nextInt(movieList.size());
        Movie randomMovie = movieList.get(randomNumber);
        return randomMovie;
    }

    public List<Movie> getMovieListWithSpecificActor() {
        String fullName = UserInputHandler.getInputFullName();
        List<Movie> moviesWithActor = movieList.stream()
                .filter(x -> x.findActorInActorList(fullName))
                .collect(Collectors.toList());
        return moviesWithActor;
    }

    public List<Movie> getMovieListByDateRange() {
        int startRange = UserInputHandler.getInputInt2(InputIntTypeHelper.FROM);
        int endRange = UserInputHandler.getInputInt2(InputIntTypeHelper.UNTIL);
        List<Movie> movieListByDateRange = movieList.stream()
                .filter(x-> x.getYearOfProduction()>=startRange)
                .filter(x-> x.getYearOfProduction()<=endRange)
                .collect(Collectors.toList());
        return movieListByDateRange;
    }
}

