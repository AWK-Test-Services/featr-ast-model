package com.awk.featr.ast.builder;

import com.awk.featr.ast.Examples;
import com.awk.featr.ast.ScenarioOutline;
import com.awk.featr.ast.Step;

import java.util.ArrayList;
import java.util.List;

public class ScenarioOutlineBuilder implements ScenarioDefinitionBuilder {

    private String name;
    private List<Step> steps;
    private String description;
    private List<String> tags;
    private Examples examples;

    public ScenarioOutlineBuilder(String name) {
        this.name = name;
        this.steps = new ArrayList<>();
        this.description = "";
        this.tags = new ArrayList<>();
    }

    @Override
    public ScenarioOutlineBuilder withSteps(List<Step> steps) {
        this.steps = steps;
        return this;
    }

    @Override
    public ScenarioOutlineBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public ScenarioOutlineBuilder withExamples(Examples examples) {
        this.examples = examples;
        return this;
    }

    public ScenarioOutlineBuilder withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public ScenarioOutline build() {
        return new ScenarioOutline(name, description, tags, steps, examples);
    }
}