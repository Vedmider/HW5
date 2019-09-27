package com.study;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitCountTest {

    @Test
    public void shouldReturnEightWhenCountByte(){
        int expected = 8;
        int actual = BitCount.countBitsInByte();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn16WhenCountShort(){
        int expected = 16;
        int actual = BitCount.countBitsInShort();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn32WhenCountInt(){
        int expected = 32;
        int actual = BitCount.countBitsInInt();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn64WhenCountLong(){
        int expected = 64;
        int actual = BitCount.countBitsInLong();

        assertEquals(expected, actual);
    }
}
