package com.awk.featr.ast.builder;

import com.awk.featr.ast.ScenarioDefinition;
import com.awk.featr.ast.Step;

import java.util.List;

public interface ScenarioDefinitionBuilder {

    ScenarioDefinitionBuilder withSteps(List<Step> steps);

    ScenarioDefinitionBuilder withDescription(String description);

    ScenarioDefinition build();
}
