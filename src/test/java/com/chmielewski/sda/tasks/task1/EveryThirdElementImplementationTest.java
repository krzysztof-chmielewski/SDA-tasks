package com.chmielewski.sda.tasks.task1;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class EveryThirdElementImplementationTest {
    @Test
    public void forEmptyListReturnsEmptyList() throws Exception {
        assertThat(new EveryThirdElementImplementation<>().getEveryThirdElement(Collections.emptyList()).size(),
                Is.is(0));
    }

    @Test
    public void forSingletonListReturnsOneElement() throws Exception {
        List<Integer> result = new EveryThirdElementImplementation<Integer>().getEveryThirdElement(Collections.singletonList(5));
        assertThat(result.size(), Is.is(1));
        assertThat(result.get(0), Is.is(5));
    }

    @Test
    public void forThreeElementListReturnsOneElement() throws Exception {
        List<Integer> result = new EveryThirdElementImplementation<Integer>().getEveryThirdElement(Arrays.asList(7, 8, 9));
        assertThat(result.size(), Is.is(1));
        assertThat(result.get(0), Is.is(7));
    }

    @Test
    public void forFourElementListReturnsOneElement() throws Exception {
        List<Integer> result = new EveryThirdElementImplementation<Integer>().getEveryThirdElement(Arrays.asList(10, 7, 8, 9));
        assertThat(result.size(), Is.is(2));
        assertThat(result.get(0), Is.is(10));
        assertThat(result.get(1), Is.is(9));
    }
}