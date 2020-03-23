package com.awk.featr.ast.builder;

import com.awk.featr.ast.Image;

import java.util.UUID;

import static java.util.Objects.requireNonNull;

public class ImageBuilder {
    private String id;
    private String location;
    private String type;

    public ImageBuilder() {
        this.id = UUID.randomUUID().toString();
    }

    public ImageBuilder withLocation(String location) {
        this.location = requireNonNull(location);
        return this;
    }

    public ImageBuilder withType(String type) {
        this.type = requireNonNull(type);
        return this;
    }

    public Image build() {
        return new Image(id, location, type);
    }
}
