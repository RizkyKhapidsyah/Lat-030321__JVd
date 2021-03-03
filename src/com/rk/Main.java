package com.rk;

public class Main {

    private static int value = 20;
    public static int s = 15;
    public static int temp = 10;

    public static class Nested {
        private void display() {
            System.out.println("Hasilnya adalah  = " + temp + s + value);
        }
    }

    public static void main(String[] args) {
        Main.Nested inner = new Main.Nested();
        inner.display();
    }
}
