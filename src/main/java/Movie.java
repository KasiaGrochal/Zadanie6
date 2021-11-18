import java.util.List;

public class Movie {
    private String title;
    private List<Actor> actorList;
    private Director director;
    private String genre;
    private int yearOfProduction;


    @Override
    public String toString() {
        return "Title: " + title +
                "\nGenre: " + genre +
                "\nDate: " + yearOfProduction +
                "\nDirector: " + director +
                "\nActors: " + actorList;
    }

    public boolean findActorInActorList(String fullName) {
        for (Actor actor : actorList)
            if ((actor.getFirstName()+" "+actor.getLastName()).equals(fullName)) {
                return true;
            }
        return false;
    }

    public String getTitle() {
        return title;
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public Director getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

}
