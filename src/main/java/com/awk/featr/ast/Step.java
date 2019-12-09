package com.awk.featr.ast;

public class Step {
    private final String keyword;
    private final String text;
    private final StepArgument argument;

    public Step(String keyword, String text, StepArgument argument) {
        this.keyword = keyword;
        this.text = text;
        this.argument = argument;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getText() {
        return text;
    }

    public StepArgument getArgument() {
        return argument;
    }
}
