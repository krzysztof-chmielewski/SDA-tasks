package com.chmielewski.sda.tasks.task1;

import java.util.ArrayList;
import java.util.List;

public class EveryThirdElementImplementation<T> implements EveryThirdElement<T> {
    public List<T> getEveryThirdElement(List<T> list) {
        List<T> result = new ArrayList<>(list.size() / 3 + 1);
        for (int i = 0; i < list.size(); i++) {
            if (i % 3 == 0) {
                result.add(list.get(i));
            }
        }

        return result;
    }
}
