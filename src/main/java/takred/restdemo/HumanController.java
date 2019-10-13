package takred.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/people")
public class HumanController {
    List<Human> allHuman;
    public HumanController(){
        Human a1 = new Human();
        a1.setName("Илья");
        a1.setSurname("Putin");
        Human a2 = new Human();
        a2.setName("Илья");
        a2.setSurname("Putin");
        Human a3 = new Human();
        a3.setName("C");
        a3.setSurname("Cch");
        Human a4 = new Human();
        a4.setName("D");
        a4.setSurname("Dch");
        allHuman = List.of(a1, a2, a3, a4);
    }
    @GetMapping(value = "/{surname}")
    public List<Human> people(@PathVariable("surname") String surname) {
        List<Human> sortHuman = new ArrayList<>();
        for (int i = 0; i < allHuman.size(); i++) {
            if (allHuman.get(i).getSurname().equals(surname)){
                sortHuman.add(allHuman.get(i));
            }
        }

//        return sortHuman;
        return allHuman.stream()
                .filter(h -> h.getSurname().equals(surname))
                .collect(Collectors.toList())
                ;
    }
    @GetMapping(value = "/unique/{surname}")
    public List<String> uniqueNames(@PathVariable("surname") String surname){
        return allHuman.stream()
                .filter(h -> h.getSurname().equals(surname))
                .map(Human::getName)
                .distinct()
                .collect(Collectors.toList());
    }
}
