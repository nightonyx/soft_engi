package nightonyx;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Service {

    @RequestMapping("/")
    @ResponseBody
    public ProgrammersDay getDay(@RequestParam int year) {
        if (year < 1) {
            return new ProgrammersDay(HttpStatus.BAD_REQUEST.value(), "Incorrect year!");
        } else {
            return new ProgrammersDay(
                    HttpStatus.OK.value(),
                    ProgrammersDay.createDate(year)
            );
        }
    }
}

