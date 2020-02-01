package com.awk.featr.ast;

import java.util.List;

import static java.util.Objects.requireNonNull;

public class Document {
    private final String id;
    private final Feature feature;
    private final String language;
    private final String comment;
    private final List<GherkinError> errors;

    public Document(String id, Feature feature, String language, String comment, List<GherkinError> errors) {
        this.id = requireNonNull(id);
        this.feature = requireNonNull(feature);
        this.language = requireNonNull(language);
        this.comment = comment;
        this.errors = errors;
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

    public List<GherkinError> getErrors() { return errors; }
}
