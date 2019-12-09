package com.awk.featr.ast.builder;

import com.awk.featr.ast.Scenario;
import com.awk.featr.ast.Step;

import java.util.ArrayList;
import java.util.List;

public class ScenarioBuilder implements ScenarioDefinitionBuilder {

    private String name;
    private List<Step> steps;
    private String description;
    private List<String> tags;

    public ScenarioBuilder(String name) {
        this.name = name;
        this.steps = new ArrayList<>();
        this.description = "";
    }

    @Override
    public ScenarioBuilder withSteps(List<Step> steps) {
        this.steps = steps;
        return this;
    }

    @Override
    public ScenarioBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public ScenarioBuilder withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public Scenario build() {
        return new Scenario(name, description, tags, steps);
    }
}