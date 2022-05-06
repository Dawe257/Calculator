package com.dzhenetl;


public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);

        // Деление на ноль
        // В качестве решения возвращаю 0 чтобы избежать исключения
        int c = calc.divide.apply(a, b);

        calc.println.accept(c);
    }
}
