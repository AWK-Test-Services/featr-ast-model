package com.awk.featr.ast;

import java.util.List;

public class Scenario extends ScenarioDefinition{
    private final List<String> tags;
    private final List<Step> steps;

    public Scenario(String name, String description, List<String> tags, List<Step> steps) {
        super(name, description);

        this.steps = steps;
        this.tags = tags;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<Step> getSteps() {
        return steps;
    }
}
