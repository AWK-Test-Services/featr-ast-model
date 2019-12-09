package com.awk.featr.ast.builder;

import com.awk.featr.ast.Examples;
import com.awk.featr.ast.TableRow;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class ExampleBuilder {

    private String keyword;
    private String name;
    private String description;
    private List<String> tags;
    private TableRow header;
    private List<TableRow> examples;

    public ExampleBuilder(String keyword, String name, TableRow header) {
        this.keyword = requireNonNull(keyword);
        this.name = requireNonNull(name);
        this.description = "";
        this.tags = new ArrayList<>();
        this.header = requireNonNull(header);
        this.examples = new ArrayList<>();
    }

    public ExampleBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public ExampleBuilder withTags(List<String> tags) {
        this.tags = requireNonNull(tags);
        return this;
    }

    public ExampleBuilder withHeader(TableRow header) {
        this.header = requireNonNull(header);
        return this;
    }

    public ExampleBuilder withExamples(List<TableRow> examples) {
        this.examples = requireNonNull(examples);
        return this;
    }

    public Examples build() {
        return new Examples(keyword, name, description, tags, header, examples);
    }
}