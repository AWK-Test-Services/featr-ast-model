package com.awk.featr.ast;

import java.util.List;

public class Scenario extends ScenarioDefinition{
    private final List<String> tags;

    public Scenario(String name, String description, List<String> tags, List<Step> steps) {
        super(name, description, steps);

        this.tags = tags;
    }

    public List<String> getTags() {
        return tags;
    }
}
