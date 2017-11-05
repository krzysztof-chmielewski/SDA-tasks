package com.chmielewski.sda.tasks.task6;

import java.util.Map;

public interface InvertMap<K, V> {
    Map<V, K> invert(Map<K, V> map);
}
