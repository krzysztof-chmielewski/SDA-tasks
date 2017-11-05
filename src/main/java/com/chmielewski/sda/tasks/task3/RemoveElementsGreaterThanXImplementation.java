package com.chmielewski.sda.tasks.task3;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsGreaterThanXImplementation implements RemoveElementsGreaterThanX {
    @Override
    public List<Integer> removeElementsGreaterThan(List<Integer> list, int x) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : list) {
            if (integer <= x) {
                result.add(integer);
            }
        }

        return result;
    }
}
