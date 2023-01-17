package ch01_familiarize_with_design_patterns.part02_adapter.dong_min.practice;

import java.io.IOException;

public class MainClient {

    public static void main(String[] args) {
        FileIOTarget f = new FilePropertiesAdapter();

        try {
            f.readFromFile("file.txt");
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile("newFile.txt");
            System.out.println("newfile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
