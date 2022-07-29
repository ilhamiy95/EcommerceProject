package com.example.site_ecom.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Sexe {
    Homme, Femme;
    public static List<String> getValues() {
        return Stream.of(Sexe.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }
}
