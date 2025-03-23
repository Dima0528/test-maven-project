package com.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void sumShouldReturn3() {
        int expected = 3;

        int actual = Main.sum(1, 2);

        Assert.assertEquals(expected, actual);
    }
}