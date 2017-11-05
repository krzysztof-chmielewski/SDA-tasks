package com.chmielewski.sda.tasks.task2;

import java.util.ArrayList;
import java.util.List;

public class EveryNthElementImplementation<T> implements EveryNthElement<T> {
    @Override
    public List<T> getEveryNthElement(List<T> list, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException(String.format("N must be positive, %s n given.", n));
        }
        List<T> result = new ArrayList<>(list.size() / 3 + 1);
        for (int i = 0; i < list.size(); i++) {
            if (i % n == 0) {
                result.add(list.get(i));
            }
        }

        return result;
    }
}
