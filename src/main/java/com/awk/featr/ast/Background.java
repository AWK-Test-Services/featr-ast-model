package com.awk.featr.ast;

import java.util.List;

public class Background extends ScenarioDefinition {
    private final List<Step> steps;

    public Background(String name, List<Step> steps, String description) {
        super(name, description);
        this.steps = steps;
    }

    public List<Step> getSteps() {
        return steps;
    }
}
