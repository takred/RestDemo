package takred.restdemo.scannumber;

import java.util.List;

public class ScanOnCopy {
    public int frequency(List<Integer> numbers, int number){
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == number){
                count++;
            }
        }
        return count;
    }
}
