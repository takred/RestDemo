package takred.restdemo.scannumber;

import java.util.List;

public class FinderBisection implements A {
    public boolean contains(List<Integer> allNumbers, int number){
        int border = allNumbers.size() / 2;
        for (int i = 0; i < allNumbers.size(); i++) {
            if (number < allNumbers.get(border)){
                border = border / 2;
            } else {
                border = border + ((allNumbers.size() - border) / 2);
            }
            System.out.println(allNumbers.get(border) + allNumbers.get(border + 1));
            if (allNumbers.get(border) == number || allNumbers.get(border + 1) == number){
                System.out.println("Нашёл!");
                return true;
            }
        }
        System.out.println("Что-то нет такого.");
        return false;
    }
}
