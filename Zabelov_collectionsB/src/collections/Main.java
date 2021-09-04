package collections;

import collections.service.ListOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String... args){
        final int X = -1;
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, -5, 0, -9, 17, 2, 0,30));
        ListOperation.changeElements(list, X);
        System.out.println("Result array: ");
        System.out.println(list);
    }
}
