package org.example.junit.lesson1;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


class NumbersTest {

    @org.junit.Test
    void sum() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(5);
        int expected = 15;

        assertEquals(expected, actual);

    }
}