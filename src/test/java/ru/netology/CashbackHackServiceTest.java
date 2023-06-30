package ru.netology;

import static org.junit.Assert.assertEquals;



public class CashbackHackServiceTest {

    org.junit.Test
    public void shouldRemainTheAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    org.junit.Test
    public void shouldCalculateWith900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    org.junit.Test
    public void shouldCalculateLessThen1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual, expected);
    }

}

