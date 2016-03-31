package hello;
import java.util.concurrent.atomic.AtomicLong;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Greetting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Greetting(counter.incrementAndGet(), String.format(template, name));
    }
    
    @RequestMapping("/greeting")
    public Greetting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greetting(counter.incrementAndGet(),
                            String.format(template, name));
    }

}