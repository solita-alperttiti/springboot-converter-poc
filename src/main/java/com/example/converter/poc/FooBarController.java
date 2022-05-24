package com.example.converter.poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooBarController {
    @GetMapping(value = "/example/v1/{fooBar}")
    public String getFooBar(@PathVariable FooBar fooBar) {
        return fooBar.name();
    }

    @GetMapping(value = "/example/v2/{fooBar}")
    public String getFooBarV2(@PathVariable @V2 FooBar fooBar) {
        return fooBar.name();
    }
}
