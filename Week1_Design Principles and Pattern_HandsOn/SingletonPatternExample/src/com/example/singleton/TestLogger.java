package com.example.singleton;

public class TestLogger {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("Are both instances the same? " + (logger1 == logger2));

        logger1.log("This is a test message from logger1");
        logger2.log("This is a test message from logger2");

        System.out.println("Logger1 hashCode: " + logger1.hashCode());
        System.out.println("Logger2 hashCode: " + logger2.hashCode());
    }
}
