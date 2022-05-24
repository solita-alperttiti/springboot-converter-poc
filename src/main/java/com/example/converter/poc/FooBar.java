package com.example.converter.poc;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(type = "String", allowableValues = { "foo", "bar" })
public enum FooBar {
    FOO,
    BAR;

    public String toLowerCase() {
        var lower = this.name().toLowerCase();
        return lower.replace("_", "-");
    }
}
