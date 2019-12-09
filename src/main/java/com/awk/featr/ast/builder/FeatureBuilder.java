package com.awk.featr.ast.builder;

import com.awk.featr.ast.Background;
import com.awk.featr.ast.Feature;
import com.awk.featr.ast.ScenarioDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static java.util.Objects.requireNonNull;

public class FeatureBuilder {

    private String id;
    private String name;
    private String description;
    private List<String> tags;
    private Background background;
    private List<ScenarioDefinition> scenarioDefinitions;
    private String rule;

    public FeatureBuilder(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = requireNonNull(name);
        this.description = "";
        this.tags = new ArrayList<>();
        this.background = null;
        this.scenarioDefinitions = new ArrayList<>();
    }

    public FeatureBuilder withId(String id) {
        this.id = requireNonNull(id);
        return this;
    }

    public FeatureBuilder withDescription(String description) {
        this.description = requireNonNull(description);
        return this;
    }

    public FeatureBuilder withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public FeatureBuilder withBackground(Background background) {
        this.background = background;
        return this;
    }

    public FeatureBuilder withScenarioDefinitions(List<ScenarioDefinition> scenarios) {
        this.scenarioDefinitions = requireNonNull(scenarios);
        return this;
    }

    public FeatureBuilder withRule(String rule) {
        this.rule = requireNonNull(rule);
        return this;
    }


    public Feature build() {
        return new Feature(id, name, description, tags, background, scenarioDefinitions, rule);
    }
}
