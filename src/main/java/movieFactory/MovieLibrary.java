package movieFactory;

import handlers.InputIntTypeHandler;
import handlers.UserInputHandler;

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
        return movieList.get(randomNumber);
    }

    public List<Movie> getMovieListWithSpecificActor() {
        String fullName = UserInputHandler.getInputFullName();
        return movieList.stream()
                .filter(x -> x.findActorInActorList(fullName))
                .collect(Collectors.toList());
    }

    public List<Movie> getMovieListByDateRange() {
        int startRange = UserInputHandler.getInputInt2(InputIntTypeHandler.FROM);
        int endRange = UserInputHandler.getInputInt2(InputIntTypeHandler.UNTIL);
        return movieList.stream()
                .filter(x -> x.getYearOfProduction() >= startRange)
                .filter(x -> x.getYearOfProduction() <= endRange)
                .collect(Collectors.toList());
    }
}

