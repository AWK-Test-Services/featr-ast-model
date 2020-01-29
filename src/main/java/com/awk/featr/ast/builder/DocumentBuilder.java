package com.awk.featr.ast.builder;

import com.awk.featr.ast.Document;
import com.awk.featr.ast.Feature;
import java.util.UUID;

import static java.util.Objects.requireNonNull;

public class DocumentBuilder {

    private String id;
    private Feature feature;
    private String language;
    private String comment;
    private Exception error;

    public DocumentBuilder(String id, Feature feature, String language) {
        this.id = UUID.randomUUID().toString();
        this.feature = requireNonNull(feature);
        this.language = language;
        this.comment = "";
        this.error = null;
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

    public DocumentBuilder withError(Exception error) {
        this.error = requireNonNull(error);
        return this;
    }

    public Document build() {
        return new Document(id, feature, language, comment, error);
    }
}
