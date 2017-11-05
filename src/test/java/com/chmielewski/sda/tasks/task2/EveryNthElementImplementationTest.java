package com.chmielewski.sda.tasks.task2;

import org.hamcrest.core.Is;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertThat;

public class EveryNthElementImplementationTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void forEmptyListReturnsEmptyList() throws Exception {
        assertThat(new EveryNthElementImplementation<>().getEveryNthElement(Collections.emptyList(), 5).size(),
                Is.is(0));
    }

    @Test
    public void forNEqualToZeroThrowsException() throws Exception {
        expectedException.expect(IllegalArgumentException.class);
        new EveryNthElementImplementation<>().getEveryNthElement(Collections.emptyList(), 0);
    }

    @Test
    public void forNNegativeThrowsException() throws Exception {
        expectedException.expect(IllegalArgumentException.class);
        new EveryNthElementImplementation<>().getEveryNthElement(Collections.emptyList(), -1);
    }

    @Test
    public void forSingletonListReturnsOneElement() throws Exception {
        List<Integer> result = new EveryNthElementImplementation<Integer>().getEveryNthElement(Collections.singletonList(5), 12);
        assertThat(result.size(), Is.is(1));
        assertThat(result.get(0), Is.is(5));
    }

    @Test
    public void forThreeElementListAndNEqualToFourReturnsOneElement() throws Exception {
        List<Integer> result = new EveryNthElementImplementation<Integer>().getEveryNthElement(Arrays.asList(7, 8, 9), 3);
        assertThat(result.size(), Is.is(1));
        assertThat(result.get(0), Is.is(7));
    }

    @Test
    public void forNEqualToOneReturnsTheList() throws Exception {
        List<Integer> result = new EveryNthElementImplementation<Integer>().getEveryNthElement(Arrays.asList(10, 7, 8, 9), 1);
        assertThat(result, Is.is(Arrays.asList(10, 7, 8, 9)));
    }
}