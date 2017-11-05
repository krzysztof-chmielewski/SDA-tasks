package com.chmielewski.sda.tasks.task2;

import java.util.List;

public interface EveryNthElement<T> {
    List<T> getEveryNthElement(List<T> list, int n);
}
