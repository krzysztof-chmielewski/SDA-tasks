package com.chmielewski.sda.tasks.task6;

import org.hamcrest.core.Is;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertThat;

public class InvertMapImplementationTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void forEmptyMapReturnsEmptyMapReturnsTrue() throws Exception {
        assertThat(new InvertMapImplementation<>().invert(Collections.emptyMap()).size(), Is.is(0));
    }

    @Test
    public void forOneElementMapReturnsOneElementMap() throws Exception {
        Map<Integer, String> result = new InvertMapImplementation<String, Integer>().invert(Collections.singletonMap("abc", 2));
        assertThat(result, Is.is(Collections.singletonMap(2, "abc")));
    }

    @Test
    public void forTwoElementMapMapWithUniqueValuesReturnsInvertedMap() throws Exception {
        Map<String, Integer> input = new HashMap<>();
        input.put("QWE", 123);
        input.put("ABC", 987);
        Map<Integer, String> result = new InvertMapImplementation<String, Integer>().invert(input);
        Map<Integer, String> expectedResult = new HashMap<>();
        expectedResult.put(123, "QWE");
        expectedResult.put(987, "ABC");
        assertThat(result, Is.is(expectedResult));
    }

    @Test
    public void forTwoElementMapMapWithNonUniqueValuesThrowsException() throws Exception {
        expectedException.expect(IllegalArgumentException.class);
        Map<String, Integer> input = new HashMap<>();
        input.put("QWE", 987);
        input.put("ABC", 987);
        new InvertMapImplementation<String, Integer>().invert(input);
    }

}