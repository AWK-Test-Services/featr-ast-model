package com.awk.featr.ast.builder;

import com.awk.featr.ast.Step;
import com.awk.featr.ast.StepArgument;

import static java.util.Objects.requireNonNull;

public class StepBuilder {

    private final String keyword;
    private final String text;
    private StepArgument stepArgument;

    public StepBuilder(String keyword, String text) {
        this.keyword = requireNonNull(keyword);
        this.text = requireNonNull(text);
    }

    public StepBuilder withStepArgument(StepArgument stepArgument) {
        this.stepArgument = requireNonNull(stepArgument);
        return this;
    }

    public Step build() {
        return new Step( keyword, text, stepArgument);
    }
}