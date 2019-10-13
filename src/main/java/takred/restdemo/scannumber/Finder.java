package takred.restdemo.scannumber;

import java.util.List;

public class Finder implements A{
    @Override
    public boolean contains(List<Integer> allNumbers, int number){
        for (int i = 0; i < allNumbers.size(); i++) {
            if (allNumbers.get(i) == number){
                return true;
            }
        }
        return false;
    }
}
