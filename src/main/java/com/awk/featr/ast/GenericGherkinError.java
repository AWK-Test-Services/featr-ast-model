package com.awk.featr.ast;

public class GenericGherkinError implements GherkinError {
    private final String message;

    public GenericGherkinError(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
