package takred.restdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class HelloController {
    @GetMapping
    @ResponseBody
    public String hello() {
        return "Hello!";
    }
}
