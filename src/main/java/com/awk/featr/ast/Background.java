package com.awk.featr.ast;

import java.util.List;

public class Background extends ScenarioDefinition {
    public Background(String name, List<Step> steps, String description) {
        super(name, description, steps);
    }
}
