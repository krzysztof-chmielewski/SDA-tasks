package com.chmielewski.sda.tasks.task4;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveIfContainsUppercaseLettersImplementation implements RemoveIfContainsUppercaseLetters {
    @Override
    public List<String> removeIfContainsUppercaseLetters(List<String> list) {
        return list.stream().filter(s -> s.toLowerCase().equals(s)).collect(Collectors.toList());
    }
}
