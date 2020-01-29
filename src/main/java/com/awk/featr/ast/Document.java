package com.awk.featr.ast;

import static java.util.Objects.requireNonNull;

public class Document {
    private final String id;
    private final Feature feature;
    private final String language;
    private final String comment;
    private final Exception error;

    public Document(String id, Feature feature, String language, String comment, Exception error) {
        this.id = requireNonNull(id);
        this.feature = requireNonNull(feature);
        this.language = requireNonNull(language);
        this.comment = comment;
        this.error = error;
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

    public Exception getError() { return error; }
}
