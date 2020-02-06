package com.awk.featr.ast.builder;

import com.awk.featr.ast.Document;
import com.awk.featr.ast.Feature;
import com.awk.featr.ast.GenericGherkinError;
import com.awk.featr.ast.GherkinError;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static java.util.Objects.requireNonNull;

public class DocumentBuilder {

    private String id;
    private Feature feature;
    private String language;
    private String comment;
    private List<GherkinError> errors;

    public DocumentBuilder(String language) {
        this.id = UUID.randomUUID().toString();
        this.feature = null;
        this.language = language;
        this.comment = "";
        this.errors = new ArrayList<>();
    }

    public DocumentBuilder withId(String id) {
        this.id = requireNonNull(id);
        return this;
    }

    public DocumentBuilder withFeature(Feature feature) {
        this.feature = requireNonNull(feature);
        return this;
    }

    public DocumentBuilder withLanguage(String language) {
        this.language = requireNonNull(language);
        return this;
    }

    public DocumentBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public DocumentBuilder addError(GherkinError error) {
        this.errors.add(error);
        return this;
    }

    public DocumentBuilder addException(Exception exception) {
        this.errors.add(new GenericGherkinError(exception.getMessage()));
        return this;
    }

    public Document build() {
        if ( feature == null ) {
            feature = new FeatureBuilder("No Feature").build();
            errors.add(new GenericGherkinError("No Feature found in this file."));
        }
        return new Document(id, feature, language, comment, errors);
    }
}
