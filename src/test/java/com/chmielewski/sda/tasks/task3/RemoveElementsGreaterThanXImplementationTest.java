package com.chmielewski.sda.tasks.task3;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertThat;

public class RemoveElementsGreaterThanXImplementationTest {
    @Test
    public void forEmptyListReturnsEmptyList() throws Exception {
        assertThat(new RemoveElementsGreaterThanXImplementation().removeElementsGreaterThan(Collections.emptyList(), 0).size(),
                Is.is(0));
    }

    @Test
    public void clearsListIfEverythingShouldBeRemoved() throws Exception {
        assertThat(new RemoveElementsGreaterThanXImplementation().removeElementsGreaterThan(Arrays.asList(1, 2, 3, 4), 0).size(),
                Is.is(0));
    }

    @Test
    public void returnsTheSameListIfNothingShouldBeRemoved() throws Exception {
        List<Integer> result = new RemoveElementsGreaterThanXImplementation().removeElementsGreaterThan(Arrays.asList(1, 2, 3, 4), 4);
        assertThat(result, Is.is(Arrays.asList(1, 2, 3, 4)));
    }
}