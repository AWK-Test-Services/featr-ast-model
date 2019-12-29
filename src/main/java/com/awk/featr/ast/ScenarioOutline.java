package com.awk.featr.ast;

import java.util.List;

public class ScenarioOutline extends ScenarioDefinition {
    private final List<String> tags;
    private final Examples examples;

    public ScenarioOutline(String name, String description, List<String> tags, List<Step> steps, Examples examples) {
        super(name, description, steps);
        this.tags = tags;
        this.examples = examples;
    }

    public List<String> getTags() { return tags; }
    public Examples getExamples() { return examples; }
}
