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
//                System.out.println(allNumbers.get(border - 1) + "  " + allNumbers.get(border) + "  " + allNumbers.get(border + 1));
                if (border != 0 && border != allNumbers.size() - 1 && (allNumbers.get(border - 1) == number || allNumbers.get(border) == number || allNumbers.get(border + 1) == number)){
                    System.out.println("Нашёл! 0");
                    return true;
                } else if (border == 0 && (allNumbers.get(border) == number || allNumbers.get(border + 1) == number)){
                    System.out.println("Нашёл! 1");
                    return true;
                } else if (border == allNumbers.size() - 1 &&(allNumbers.get(border - 1) == number || allNumbers.get(border) == number)){
                    System.out.println("Нашёл! 2");
                    return true;
                }
            }
            System.out.println("Что-то нет такого.");
            return false;
        }
}
