package com.dzhenetl;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T x);
}
