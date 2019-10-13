package takred.restdemo.scannumber;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping(value = "/sortList")
public class SortListController {
    @RequestMapping(value = "/{listNumbersLength}")
    public List<SortListResult> sortList(@PathVariable("listNumbersLength") int listNumbersLength) {
        List<Integer> allNumbers = new ArrayList<>();
        List<SortListResult> twoSortListResult = new ArrayList<>();
//        for (int j = 0; j < 1000; j++) {
//            allNumbers = new ArrayList<>();
        allNumbers = new ArrayList<>(List.of(98, 28, 39, 82, 12, 45, 83, 31, 53, 72, 56, 48, 75, 74, 93, 50, 49, 41, 21, 42, 1, 18, 4, 24, 72, 82, 38, 31, 73, 46, 20, 48, 94, 0, 35, 91, 68, 35, 41, 23, 37, 29, 6, 4, 79, 2, 84, 55, 25, 56, 11, 43, 89, 90, 90, 85, 73, 46, 9, 15, 32, 49, 86, 89, 5, 16, 6, 40, 19, 93, 81, 78, 3, 26, 8, 7, 98, 5, 3, 70, 95, 98, 0, 67, 95, 72, 79, 43, 24, 81, 5, 56, 18, 96, 60, 36, 16, 52, 58, 59));
//            for (int i = 0; i < listNumbersLength; i++) {
//                allNumbers.add(ThreadLocalRandom.current().nextInt(0, 100));
//            }
            A finder = new Finder();
            A finderBisection = new FinderBisection();
            SortListResult sortListResult = new SortListResult(allNumbers, 98, false);
            twoSortListResult = getTwoObject(sortListResult.getAllNumbers(), sortListResult.getDesiredNumber());
            twoSortListResult.get(0).setAllNumbers(new SortList().sort(twoSortListResult.get(0).getAllNumbers()));
            twoSortListResult.get(1).getAllNumbers().sort(Comparator.naturalOrder());
            twoSortListResult.set(0, twoSortListResult.get(0).setContains(finder.contains(twoSortListResult.get(0).getAllNumbers(), twoSortListResult.get(0).getDesiredNumber())));
            twoSortListResult.set(1, twoSortListResult.get(1).setContains(finderBisection.contains(twoSortListResult.get(1).getAllNumbers(), twoSortListResult.get(1).getDesiredNumber())));
            if (twoSortListResult.get(0).getContains() != twoSortListResult.get(1).getContains()) {
                return twoSortListResult;
            }
//        }
//        List<Integer> sortNumbers = new SortList().sort(allNumbers);
//        List<Integer>
//        allNumbers.sort(Comparator.naturalOrder());

//        System.out.println(allNumbers);
//        System.out.println(allNumbers.size());
//        System.out.println(sortNumbers);
//        System.out.println(sortNumbers.size());

//        System.out.println(finder.contains(allNumbers, 36));
//        System.out.println(finderBisection.contains(sortNumbers, 36));
        return twoSortListResult;
    }

    public List<SortListResult> getTwoObject(List<Integer> allNumbers, int desiredNumber) {
        List<SortListResult> twoObject = new ArrayList<>();
        SortListResult sortListResult = new SortListResult(allNumbers, desiredNumber, false);
        twoObject.add(sortListResult);
        sortListResult = new SortListResult(allNumbers, desiredNumber, false);
        twoObject.add(sortListResult);
        return twoObject;
    }
}
