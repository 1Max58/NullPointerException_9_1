package com.example;

public class NullPointerExceptionTest {
    private void nothing() {

    }
    static void genException() {
        NullPointerExceptionTest nullPointerExceptionTest = null;
        nullPointerExceptionTest.nothing();
    }
}
