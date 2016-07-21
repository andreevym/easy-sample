package ru.android_studio.search;

public class Main {

    public static void main(String[] args) {
        boolean result = ArrayUtil.containsElementInArray(new int[]{1, 2, 3, 4, 5, 6, 9}, 9);
        System.out.println("result: " + result);
    }
}
