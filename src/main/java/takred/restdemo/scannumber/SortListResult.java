package takred.restdemo.scannumber;

import java.util.ArrayList;
import java.util.List;

public class SortListResult {
    private List<Integer> allNumbers;
    private int desiredNumber;
    private boolean contains;

    public List<Integer> getAllNumbers() {
        return allNumbers;
    }

    public void setAllNumbers(List<Integer> allNumbers) {
        this.allNumbers = allNumbers;
    }

    public int getDesiredNumber() {
        return desiredNumber;
    }

    public void setDesiredNumber(int desiredNumber) {
        this.desiredNumber = desiredNumber;
    }

    public boolean getContains() {
        return contains;
    }

    public void setContains(boolean contains) {
        this.contains = contains;
    }

}
