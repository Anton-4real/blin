package collections.service;

import java.io.File;
import java.util.*;

public class CatalogOperation {


    public static List<File> callReadFiles(File baseDirectory){
        List<File> files = new ArrayList<>();
        readFiles(baseDirectory, files);
        return files;
    }
    private static void readFiles(File baseDirectory, List<File> files){

        if (baseDirectory.isDirectory()) {

            if (baseDirectory.listFiles() != null) {
                for (File file : baseDirectory.listFiles()) {
                    files.add(file);
                    if (!file.isFile())
                        readFiles(file, files);
                }
            }
        }
    }
}
