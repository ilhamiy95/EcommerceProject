package com.example.site_ecom.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum categ {
    MEUBLES, DECORS;
    public static List<String> getValues() {
        return Stream.of(categ.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }
}
