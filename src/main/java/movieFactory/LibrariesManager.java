package movieFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import handlers.ListDirectory;

import java.io.IOException;
import java.net.URL;

public class LibrariesManager {

    public MovieLibrary movieLibrary;

    public LibrariesManager(ListDirectory listDirectory) {
        try {
            MovieLibrary movieLibrary = new ObjectMapper().readValue(new URL(listDirectory.getUrl()), MovieLibrary.class);
            this.movieLibrary = movieLibrary;
        } catch (IOException e) {
            System.err.println("Invalid path for " + listDirectory + " movie library.");
            System.exit(-1);
        }
    }

    public MovieLibrary getMovieLibrary() {
        return movieLibrary;
    }
}

