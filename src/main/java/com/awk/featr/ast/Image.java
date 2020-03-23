package com.awk.featr.ast;

public class Image {
    private String id;
    private String location;
    private String type;

    public Image(String id, String location, String type) {
        this.id = id;
        this.location = location;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }
}
