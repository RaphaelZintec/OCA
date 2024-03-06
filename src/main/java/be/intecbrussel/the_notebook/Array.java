package be.intecbrussel.the_notebook;

import java.util.Arrays;

class Array {

    public static void main(String[] args) {
        String[] array1 = new String[5];
        String[] array2 = new String[5];

        processStringArray(array1, array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

    public static void processStringArray(String[] array1, String[] array2){
        array1[0] = "100";
        array2 = array1;
    }


}