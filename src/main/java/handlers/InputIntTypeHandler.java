package handlers;

public enum InputIntTypeHandler {
    FROM(" from "), UNTIL(" until "), ACTION("");

    private final String displayName;

    InputIntTypeHandler(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
