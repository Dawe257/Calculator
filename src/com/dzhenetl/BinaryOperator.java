package com.dzhenetl;

@FunctionalInterface
public interface BinaryOperator<T> {
    T apply(T x, T y);
}
