package com.example;

public class Main {
    public static void main(String[] args) {
        try {
            NullPointerExceptionTest.genException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
            System.out.println("Standard message is:");
            System.out.println(e); // toString() implicitly called here
            System.out.println("Stack trace:");
            e.printStackTrace();
        }
    }
}
