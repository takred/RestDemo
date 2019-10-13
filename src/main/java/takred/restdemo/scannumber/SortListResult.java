package takred.restdemo.scannumber;

import java.util.ArrayList;
import java.util.List;

public class SortListResult {
    private final List<Integer> allNumbers;
    private final int desiredNumber;
    private final boolean contains;

    public SortListResult(List<Integer> allNumbers, int desiredNumber, boolean contains){
        this.allNumbers = allNumbers;
        this.desiredNumber = desiredNumber;
        this.contains = contains;
    }

    public List<Integer> getAllNumbers() {
        return allNumbers;
    }

    public SortListResult setAllNumbers(List<Integer> allNumbers) {
        return new SortListResult(allNumbers, desiredNumber, contains);
    }

    public int getDesiredNumber() {
        return desiredNumber;
    }

    public SortListResult setDesiredNumber(int desiredNumber) {
        return new SortListResult(allNumbers, desiredNumber, contains);
    }

    public boolean getContains() {
        return contains;
    }

    public SortListResult setContains(boolean contains) {
        return new SortListResult(allNumbers, desiredNumber, contains);
    }

}
