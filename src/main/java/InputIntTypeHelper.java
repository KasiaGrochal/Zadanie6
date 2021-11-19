public enum InputIntTypeHelper {
    FROM(" from "), UNTIL(" until "), ACTION("");

    private String displayName;

    InputIntTypeHelper(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
