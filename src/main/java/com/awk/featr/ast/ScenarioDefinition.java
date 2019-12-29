package com.awk.featr.ast;

import java.util.List;

import static java.util.Objects.requireNonNull;

public abstract class ScenarioDefinition {

    private final String name;

    private final String description;

    private String type;

    private final List<Step> steps;

    ScenarioDefinition(String name, String description, List<Step> steps) {
        this.name = name;
        this.description = description;
        this.type = this.getClass().getSimpleName();
        this.steps = requireNonNull(steps);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() { return type; }

    public List<Step> getSteps() { return steps; }
}
