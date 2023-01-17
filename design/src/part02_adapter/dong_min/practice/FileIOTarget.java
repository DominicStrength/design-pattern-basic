package ch01_familiarize_with_design_patterns.part02_adapter.dong_min.practice;

import java.io.IOException;

public interface FileIOTarget {

    public void readFromFile(String filename) throws IOException;

    public void writeToFile(String filename) throws IOException;

    public void setValue(String key, String value);

    public String getValue(String key);
}
