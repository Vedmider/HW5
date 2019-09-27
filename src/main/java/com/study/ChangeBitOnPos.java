package com.study;

public class ChangeBitOnPos {

    private final static int max_position_value = 31;

    public static void main(String[] args) {
        int number = getNumberToChange(args[0]);
        int pos = getPosition(args[1]);

        if (!isPositionValid(pos) || number == 0 || pos == 0) {
            return;
        }
        number = changeBitOnPositionToOne(number, pos);
        changeBitOnPositionToZero(number, pos);
    }

    public static int getNumberToChange(String numberArgument) {
        try {
            return Integer.parseInt(numberArgument);
        } catch (NumberFormatException e) {
            System.out.println("Argument 1 is not an int. Please enter valid value");
            return 0;
        }
    }

    public static int getPosition(String positionArgument) {
        try {
            return Integer.parseInt(positionArgument);
        } catch (NumberFormatException e) {
            System.out.println("Argument 2 is not an int. Please enter valid value");
            return 0;
        }
    }

    public static int changeBitOnPositionToOne(int number, int position) {
        number |= 1 << position - 1;
        System.out.println("Number changed to - " + Integer.toBinaryString(number));
        return number;
    }

    public static int changeBitOnPositionToZero(int number, int position) {
        number &= ~(1 << position - 1);
        System.out.println("Number changed to - " + Integer.toBinaryString(number));
        return number;
    }

    public static boolean isPositionValid(int position) {
        if (position > max_position_value) {
            System.out.println("Your position is greater than 31. Enter valid position");
            return false;
        }
        return true;
    }


}
