package collections;

import collections.service.CatalogOperation;

import java.io.File;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String... args) {

        File file = new File("C:\\Program Files");
        System.out.println(CatalogOperation.callReadFiles(file));

    }
}
