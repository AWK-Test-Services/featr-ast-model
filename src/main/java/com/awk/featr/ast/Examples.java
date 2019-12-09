package com.awk.featr.ast;

import java.util.List;

public class Examples {
    private final String keyword;
    private final String name;
    private final String description;
    private final List<String> tags;
    private final TableRow header;
    private final List<TableRow> examples;

    public Examples(String keyword, String name, String description, List<String> tags, TableRow header, List<TableRow> examples) {
        this.keyword = keyword;
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.header = header;
        this.examples = examples;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTags() {
        return tags;
    }

    public TableRow getHeader() {
        return header;
    }

    public List<TableRow> getExamples() {
        return examples;
    }
}
