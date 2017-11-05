package com.chmielewski.sda.tasks.task4;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertThat;

public class RemoveIfContainsUppercaseLettersImplementationTest {
    @Test
    public void forEmptyListReturnsEmptyList() throws Exception {
        assertThat(new RemoveIfContainsUppercaseLettersImplementation().removeIfContainsUppercaseLetters(Collections.emptyList()).size(),
                Is.is(0));
    }

    @Test
    public void forOneLowercaseWordReturnsIt() throws Exception {
        List<String> result = new RemoveIfContainsUppercaseLettersImplementation().removeIfContainsUppercaseLetters(Collections.singletonList("abc123"));
        assertThat(result.size(), Is.is(1));
        assertThat(result.get(0), Is.is("abc123"));

    }

    @Test
    public void forOneUppercaseWordReturnsEmptyList() throws Exception {
        List<String> result = new RemoveIfContainsUppercaseLettersImplementation().removeIfContainsUppercaseLetters(Collections.singletonList("ABC123"));
        assertThat(result.size(), Is.is(0));
    }

    @Test
    public void forTwoToRemoveAndThreeToRemainReturnsThreeElementList() throws Exception {
        List<String> result = new RemoveIfContainsUppercaseLettersImplementation().removeIfContainsUppercaseLetters(
                Arrays.asList("REMOVE123ME123", "do_not_remove_me123", "A", "abc", "123asdqwe"));
        assertThat(result.size(), Is.is(3));
        assertThat(result, Is.is( Arrays.asList("do_not_remove_me123", "abc", "123asdqwe")));
    }
}