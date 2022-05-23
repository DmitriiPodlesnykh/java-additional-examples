package com.luxoft.podlesnykh.example;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClassExample {
    private final List<String> strings;

    public ImmutableClassExample(List<String> strings) {
        this.strings = new ArrayList<>(strings);
    }

    public List<String> getStrings() {
        return new ArrayList<>(strings);
    }
}
