package com.study;

import java.util.Scanner;

public class InputScanner {

    public String[] scan() {
        String[] args = new String[2];

        Scanner sc = new Scanner(System.in);

        args[0] = sc.next();
        args[1] = sc.next();
        return args;
    }
}
