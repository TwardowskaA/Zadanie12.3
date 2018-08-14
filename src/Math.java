import java.io.*;
import java.util.*;

public class Math {

    public static File file(String name) {
        File file = new File(name);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }


    public static Map<Integer, Integer> counter(File file) throws FileNotFoundException {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextInt()) {
                int x = scan.nextInt();
                if (map.containsKey(x)) {
                    int value = map.get(x);
                    map.put(x, ++value);
                } else {
                    map.put(x, 1);
                }
            }
        }
        return map;
    }
}








