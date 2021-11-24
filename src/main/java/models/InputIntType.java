package models;

public enum InputIntType {
    FROM(" from "), UNTIL(" until "), ACTION("");

    private final String displayName;

    InputIntType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
