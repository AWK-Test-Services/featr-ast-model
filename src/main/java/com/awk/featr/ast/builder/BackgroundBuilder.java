package com.awk.featr.ast.builder;

import com.awk.featr.ast.Background;
import com.awk.featr.ast.Step;

import java.util.ArrayList;
import java.util.List;

public class BackgroundBuilder implements ScenarioDefinitionBuilder {

    private String name;
    private List<Step> steps;
    private String description;

    public BackgroundBuilder(String name) {
        this.name = name;
        this.steps = new ArrayList<>();
        this.description = "";
    }

    @Override
    public BackgroundBuilder withSteps(List<Step> steps) {
        this.steps = steps;
        return this;
    }

    @Override
    public BackgroundBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Background build() {
        return new Background(name, steps, description);
    }
}