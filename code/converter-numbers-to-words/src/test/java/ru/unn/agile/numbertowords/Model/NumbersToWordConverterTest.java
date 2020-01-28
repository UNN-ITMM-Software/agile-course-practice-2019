package ru.unn.agile.numbertowords.Model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.unn.agile.numbertowords.model.ConverterNumbersToWord.convertToWord;


public class NumbersToWordConverterTest {

    @Test
    public void canConvertZero() {
        String convertedNumber = convertToWord(0);
        assertEquals("Zero", convertedNumber);
    }

    @Test
    public void canConvertOne() {
        String convertedNumber = convertToWord(1);
        assertEquals("One", convertedNumber);
    }

    @Test
    public void canConvertTwo() {
        String convertedNumber = convertToWord(2);
        assertEquals("Two", convertedNumber);
    }

    @Test
    public void canConvertThree() {
        String convertedNumber = convertToWord(3);
        assertEquals("Three", convertedNumber);
    }

    @Test
    public void canConvertFive() {
        String convertedNumber = convertToWord(5);
        assertEquals("Five", convertedNumber);
    }

    @Test
    public void canConvertEight() {
        String convertedNumber = convertToWord(8);
        assertEquals("Eight", convertedNumber);
    }

    @Test
    public void canConvertTen() {
        String convertedNumber = convertToWord(10);
        assertEquals("Ten", convertedNumber);
    }

    @Test
    public void canConvertEleven() {
        String convertedNumber = convertToWord(11);
        assertEquals("Eleven", convertedNumber);
    }

    @Test
    public void canConvertETwelve() {
        String convertedNumber = convertToWord(12);
        assertEquals("Twelve", convertedNumber);
    }

    @Test
    public void canConvertThirteen() {
        String convertedNumber = convertToWord(13);
        assertEquals("Thirteen", convertedNumber);
    }

    @Test
    public void canConvertESixteen() {
        String convertedNumber = convertToWord(16);
        assertEquals("Sixteen", convertedNumber);
    }

    @Test
    public void canConverEighteen() {
        String convertedNumber = convertToWord(18);
        assertEquals("Eighteen", convertedNumber);
    }

    @Test
    public void canConvertNineteen() {
        String convertedNumber = convertToWord(19);
        assertEquals("Nineteen", convertedNumber);
    }

    @Test
    public void canConvertTwenty() {
        String convertedNumber = convertToWord(20);
        assertEquals("Twenty ", convertedNumber);
    }

    @Test
    public void canConvertTwentyOne() {
        String convertedNumber = convertToWord(21);
        assertEquals("Twenty One", convertedNumber);
    }

    @Test
    public void canConvertTwentyTwo() {
        String convertedNumber = convertToWord(22);
        assertEquals("Twenty Two", convertedNumber);
    }

    @Test
    public void canConvertTwentyFive() {
        String convertedNumber = convertToWord(25);
        assertEquals("Twenty Five", convertedNumber);
    }

    @Test
    public void canConvertTwentyNine() {
        String convertedNumber = convertToWord(29);
        assertEquals("Twenty Nine", convertedNumber);
    }

    @Test
    public void canConvertThirty() {
        String convertedNumber = convertToWord(30);
        assertEquals("Thirty ", convertedNumber);
    }

    @Test
    public void canConvertThirtyFive() {
        String convertedNumber = convertToWord(35);
        assertEquals("Thirty Five", convertedNumber);
    }

    @Test
    public void canConvertThirtyyNine() {
        String convertedNumber = convertToWord(39);
        assertEquals("Thirty Nine", convertedNumber);
    }

    @Test
    public void canConvertFiftyOne() {
        String convertedNumber = convertToWord(51);
        assertEquals("Fifty One", convertedNumber);
    }

    @Test
    public void canConvertSixtyNine() {
        String convertedNumber = convertToWord(69);
        assertEquals("Sixty Nine", convertedNumber);
    }

    @Test
    public void canConvertSeventySeven() {
        String convertedNumber = convertToWord(77);
        assertEquals("Seventy Seven", convertedNumber);
    }

    @Test
    public void canConvertEighty() {
        String convertedNumber = convertToWord(85);
        assertEquals("Eighty Five", convertedNumber);
    }

    @Test
    public void canConvertNinetyNine() {
        String convertedNumber = convertToWord(99);
        assertEquals("Ninety Nine", convertedNumber);
    }

}