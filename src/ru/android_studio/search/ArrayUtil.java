package ru.android_studio.search;

import java.util.Arrays;


class ArrayUtil {

    static boolean containsElementInArray(int[] array, int foundValue) {
        System.out.println(Arrays.toString(array));
        int markerIndex = array.length/2;

        if(array.length == 1 && foundValue != array[markerIndex]) {
            return false;
        } else if (foundValue > array[markerIndex]) {
            return containsElementInArray(Arrays.copyOfRange(array, markerIndex, array.length), foundValue);
        } else if (foundValue < array[markerIndex]) {
            return containsElementInArray(Arrays.copyOfRange(array, 0, markerIndex), foundValue);
        } else if (foundValue == array[markerIndex]) {
            return true;
        } else {
            return false;
        }
    }
}
