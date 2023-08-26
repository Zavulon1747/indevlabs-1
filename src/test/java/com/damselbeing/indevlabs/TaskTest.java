package com.damselbeing.indevlabs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TaskTest {

    @Autowired
    Task task;

    @BeforeEach
    void setUp() {
        task = new Task();
    }

    @Test
    void shouldCheckCommonCase() {
        int[] array = {7,9,10,11,12};
        assertEquals(8, task.findMissingNumber(array));
    }

    @Test
    void shouldCheckOneNumInArray() {
        int[] array = {1};
        assertEquals(2, task.findMissingNumber(array));
    }

    @Test
    void shouldCheckNoNumInArray() {
        int[] array = {};
        assertThrows(IllegalArgumentException.class, ()-> task.findMissingNumber(array));
    }

    @Test
    void shouldCheckNoMissingNum() {
        int[] array = {7,9,10,11,8};
        assertEquals(12, task.findMissingNumber(array));
    }
}