package com.chmielewski.sda.tasks.task5;

import java.util.HashSet;
import java.util.List;

public class CanListBeConvertedToSetImplementation implements CanListBeConvertedToSet {
    @Override
    public boolean canListBeConvertedToSet(List<?> list) {
        return new HashSet<>(list).size() == list.size();
    }
}
