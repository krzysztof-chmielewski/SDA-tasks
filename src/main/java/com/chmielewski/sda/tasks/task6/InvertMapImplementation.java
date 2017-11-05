package com.chmielewski.sda.tasks.task6;

import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class InvertMapImplementation<K, V> implements InvertMap<K, V> {
    @Override
    public Map<V, K> invert(Map<K, V> map) {
        if (new HashSet<>(map.values()).size() != map.size()) {
            throw new IllegalArgumentException("Cannot invert map. Values contain non unique values: " + map.values());
        }

        return map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }
}
