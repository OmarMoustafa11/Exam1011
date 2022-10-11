package Exam1011;

public enum Size {
    S("small"),M("medium"),L("large"),X("XLarge");

    private final String description;

    public String getDescription() {
        return description;
    }

    Size(String description) {
        this.description = description;
    }
    String Size;


}
