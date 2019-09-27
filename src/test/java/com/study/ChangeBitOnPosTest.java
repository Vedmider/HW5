package com.study;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ChangeBitOnPosTest {

    @Mock
    private InputScanner scanner;
    private ChangeBitOnPos changeBitOnPos;


    @Test
    public void shouldReturnZeroIfIllegalArgumentOne(){
        String[] args = new String[]{"Argument 1", "Argument 2"};
        when(scanner.scan()).thenReturn(args);
        int expected = 0;
        int actual = ChangeBitOnPos.getNumberToChange(scanner.scan()[0]);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroIfIllegalArgumentTwo(){
        String[] args = new String[]{"Argument 1", "Argument 2"};
        when(scanner.scan()).thenReturn(args);
        int expected = 0;
        int actual = ChangeBitOnPos.getPosition(scanner.scan()[1]);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIntValueForArgumentOne(){
        String[] args = new String[]{"10", "Argument 2"};
        when(scanner.scan()).thenReturn(args);
        int expected = 10;
        int actual = ChangeBitOnPos.getNumberToChange(scanner.scan()[0]);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIntValueOfArgumentTwo(){
        String[] args = new String[]{"Argument 1", "28"};
        when(scanner.scan()).thenReturn(args);
        int expected = 28;
        int actual = ChangeBitOnPos.getPosition(scanner.scan()[1]);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeBitOnPositionToOneWithNumberTwoOnPositionOne(){
        String expected = "11";
        String actual = Integer.toBinaryString(ChangeBitOnPos.changeBitOnPositionToOne(2, 1));

        assertEquals(expected,actual);
    }

    @Test
    public void shouldChangeBitOnPositionToZeroWithNumberTwoOnPositionOne(){
        String expected = "10";
        String actual = Integer.toBinaryString(ChangeBitOnPos.changeBitOnPositionToZero(3, 1));

        assertEquals(expected,actual);
    }

}
