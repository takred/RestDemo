package takred.restdemo.scannumber;

import java.util.ArrayList;
import java.util.List;

public class SortList {
    public List<Integer> sort(List<Integer> allNumbers){
        List<Integer> sortNumbers = new ArrayList<>();
        int minNumber;
        int maxNumber = 0;
        int countInSort = 0;
        int countInAll = 0;
        ScanOnCopy scanOnCopy = new ScanOnCopy();
        for (int i = 0; i < allNumbers.size(); i++) {
            if (allNumbers.get(i) > maxNumber){
                maxNumber = allNumbers.get(i);
            }
        }
        for (int i = 0; i < allNumbers.size(); i++) {
            minNumber = maxNumber;
            System.out.println(i);
            for (int j = 0; j < allNumbers.size(); j++) {
                if (sortNumbers.size() > 0 && sortNumbers.get(sortNumbers.size() - 1) < allNumbers.get(j) && minNumber > allNumbers.get(j)){
                    System.out.println("зашло!");
                    minNumber = allNumbers.get(j);
                } else if (sortNumbers.size() == 0 && minNumber > allNumbers.get(j)){
                    minNumber = allNumbers.get(j);
                }
            }
            countInAll = scanOnCopy.frequency(allNumbers, minNumber);
            countInSort = scanOnCopy.frequency(sortNumbers, minNumber);
            if (countInSort == 0){
                for (int j = 0; j < countInAll - countInSort; j++) {
                    sortNumbers.add(minNumber);
                }
            }
        }
        return sortNumbers;
    }
}
