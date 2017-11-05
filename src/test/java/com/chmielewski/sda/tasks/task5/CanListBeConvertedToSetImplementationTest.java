package com.chmielewski.sda.tasks.task5;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertThat;

public class CanListBeConvertedToSetImplementationTest {
    @Test
    public void forEmptyListReturnsTrue() throws Exception {
        assertThat(new CanListBeConvertedToSetImplementation().canListBeConvertedToSet(Collections.emptyList()),
                Is.is(true));
    }

    @Test
    public void forOneElementListReturnsTrue() throws Exception {
        assertThat(new CanListBeConvertedToSetImplementation().canListBeConvertedToSet(Collections.singletonList(new Object())),
                Is.is(true));
    }

    @Test
    public void forTwoElementListWithDuplicatesReturnsFalse() throws Exception {
        assertThat(new CanListBeConvertedToSetImplementation().canListBeConvertedToSet(Arrays.asList("abc", "abc")),
                Is.is(false));
    }

    @Test
    public void forTwoElementListWithoutDuplicatesReturnsTrue() throws Exception {
        assertThat(new CanListBeConvertedToSetImplementation().canListBeConvertedToSet(Arrays.asList("abc", "123")),
                Is.is(true));
    }
}