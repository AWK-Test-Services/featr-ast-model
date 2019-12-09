package com.awk.featr.ast;

public class DocString extends StepArgument {
    private final String content;
    private final String type;

    public DocString(String content, String type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public String getType() {
        return type;
    }
}
