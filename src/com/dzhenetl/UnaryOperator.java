package com.dzhenetl;

@FunctionalInterface
public interface UnaryOperator<T> {
    T apply(T x);
}
