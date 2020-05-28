package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shoudAmountUnderBoundary() {
        int actual = service.remain(400);
        int expected = 600;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountEqualsBoundary() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountAboveBoundary() {
        int actual = service.remain(2600);
        int expected = 400;

        assertEquals(actual, expected);
    }

}
