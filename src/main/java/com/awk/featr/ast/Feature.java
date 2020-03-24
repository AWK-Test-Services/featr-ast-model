package com.awk.featr.ast;

import java.util.List;

import static java.util.Objects.requireNonNull;

public class Feature {

    private final String id;
    private final String featureId;

    private final String parentId;

    private final String name;
    private final String description;

    private final Background background;
    private final List<ScenarioDefinition> scenarioDefinitions;

    private final List<String> tags;

    private final String rule;

    public Feature(String id, String featureId, String parentId, String name, String description, List<String> tags, Background background, List<ScenarioDefinition> scenarioDefinitions, String rule) {
        this.id = requireNonNull(id);
        this.featureId = requireNonNull(featureId);
        this.parentId  =requireNonNull(parentId);
        this.name = requireNonNull(name);
        this.description = requireNonNull(description);
        this.tags = tags;
        this.background = background;
        this.scenarioDefinitions = requireNonNull(scenarioDefinitions);
        this.rule = rule;
    }

    public String getId() {
        return id;
    }

    public String getFeatureId() {
        return featureId;
    }

    public String getParentId() {
        return parentId;
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

    public Background getBackground() {
        return background;
    }

    public List<ScenarioDefinition> getScenarioDefinitions() {
        return scenarioDefinitions;
    }

    public String getRule() {
        return rule;
    }
}
