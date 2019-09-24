package model.http;

public enum ViewLocation {
    TEMPLATE("./templates"),
    STATIC("./static");

    private final String location;

    ViewLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}