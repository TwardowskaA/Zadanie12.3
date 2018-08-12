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


    public static void map(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        int i = 1;
        int x = scan.nextInt();
        int powt = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (scan.hasNextInt()) {
            map.put(i, scan.nextInt());
            i++;
            while (map.get(i).equals(x)) {
                powt++;
            }
        }

        System.out.println(x + "-" + "ilość wystąpien:" + powt);
    }


}


