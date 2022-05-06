package com.dzhenetl;

@FunctionalInterface
public interface Predicate<T> {
    boolean apply(T x);
}
