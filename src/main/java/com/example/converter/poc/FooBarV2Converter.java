package com.example.converter.poc;

import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalConverter;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class FooBarV2Converter implements ConditionalConverter, Converter<String, FooBar> {

    @Override
    public boolean matches(TypeDescriptor sourceType, TypeDescriptor targetType) {
        return targetType.hasAnnotation(V2.class);
    }

    @Override
    public FooBar convert(String source) {
        return FooBar.valueOf(fooBarToUpperCase(source));
    }

    private String fooBarToUpperCase(String source) {
        var upper = source.toUpperCase();
        return upper.replace("-", "_");
    }
}
