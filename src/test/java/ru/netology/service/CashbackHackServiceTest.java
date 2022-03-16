package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

        @Test
        public void shouldPurchase0() {
            int expected = 1000;
            int actual = service.remain(0);
            assertEquals(actual, expected);
        }

        @Test
        public void shouldPurchase1() {
            int expected = 999;
            int actual = service.remain(1);
            assertEquals(actual, expected);
        }

        @Test
        public void shouldPurchase500() {
            int expected = 500;
            int actual = service.remain(500);
            assertEquals(actual, expected);
        }

        @Test
        public void shouldPurchase999() {
            int expected = 1;
            int actual = service.remain(999);
            assertEquals(actual, expected);
        }

        @Test
        public void shouldPurchaseMoreLimit() {
            int expected = 1000;
            int actual = service.remain(3000);
            assertEquals(actual, expected);
        }

        @Test
        public void shouldPurchase1000() {
            int expected = 0;
            int actual = service.remain(1000);
            assertEquals(actual, expected);
        }
    }