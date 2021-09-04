package collections.service;

import java.util.Collections;
import java.util.List;

public class ListOperation {

    public static void changeElements(List<Integer> list, int X){
        int j = 0;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) < X) {
                if (i != j)
                    Collections.swap(list,i,j);
                j++;

            }
        }

        j = list.size() - 1;
        for (int i = list.size() -1; list.get(i) >= 0; i--) {

            if (list.get(i) > X) {
                if (i != j)
                    Collections.swap(list,i,j);
                j--;

            }
        }
    }
}
