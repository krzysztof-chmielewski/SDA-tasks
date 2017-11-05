package com.chmielewski.sda.tasks.task1;

import java.util.List;

public interface EveryThirdElement<T> {
    List<T> getEveryThirdElement(List<T> list);
}
