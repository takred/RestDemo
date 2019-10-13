package takred.restdemo.scannumber;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<Integer> allNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            allNumbers.add(ThreadLocalRandom.current().nextInt(0, 100));
        }
        Finder finder = new Finder();
        System.out.println(finder.contains(allNumbers, 1));
    }
}
