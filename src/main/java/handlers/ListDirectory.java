package handlers;

public enum ListDirectory {
    KIDS ("file:src/main/resources/movieListForKids.json"),
    ADULTS ("file:src/main/resources/movieListForAdults.json");

    private final String url;

    ListDirectory(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
