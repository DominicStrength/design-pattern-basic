package part02_adapter.practice;

import java.io.*;
import java.util.Properties;

public class FilePropertiesAdapter extends Properties implements FileIOTarget {
    @Override
    public void readFromFile(String filename) throws IOException {
        // src 폴더 내부에 있는 파일이면 src/패키지이름/파일 로 경로 지정할 수 있다. (FileNotFoundException...)
        String path = "src\\ch01_familiarize_with_design_patterns\\part02_adapter\\dong_min\\practice\\" + filename;
        BufferedReader br = new BufferedReader(new FileReader(path));
        load(br);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        String path = "src\\ch01_familiarize_with_design_patterns\\part02_adapter\\dong_min\\practice\\" + filename;
        BufferedWriter br = new BufferedWriter(new FileWriter(path));
        store(br, "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
