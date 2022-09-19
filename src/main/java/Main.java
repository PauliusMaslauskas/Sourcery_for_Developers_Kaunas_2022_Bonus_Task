import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        init();
    }

    public static void init() {
        ArrayList<String> arr = null;
        try (Scanner s = new Scanner(new File("src/main/resources/content.txt"))) {
            arr = new ArrayList<>();
            while (s.hasNext()) {
                arr.add(s.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (String s : arr) {
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(s);
            while (m.find()) {
                int toNumber = Integer.parseInt(m.group());
                if (toNumber >= 10) {
                    System.out.println(s);
                }
            }
        }
    }
}
