package com.awk.featr.ast;

public abstract class ScenarioDefinition {

    private final String name;

    private final String description;

    private String type;

    ScenarioDefinition(String name, String description) {
        this.name = name;
        this.description = description;
        this.type = this.getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() { return type; }

}
