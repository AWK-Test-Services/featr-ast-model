package com.awk.featr.ast;

import static java.util.Objects.requireNonNull;

public class Document {
    private final String id;
    private final Feature feature;
    private final String language;
    private final String comment;

    public Document(String id, Feature feature, String language, String comment) {
        this.id = requireNonNull(id);
        this.feature = requireNonNull(feature);
        this.language = requireNonNull(language);
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public Feature getFeature() {
        return feature;
    }

    public String getLanguage() {
        return language;
    }

    public String getComment() {
        return comment;
    }
}
