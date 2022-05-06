package com.dzhenetl;

@FunctionalInterface
public interface Supplier<T> {
    T get();
}
