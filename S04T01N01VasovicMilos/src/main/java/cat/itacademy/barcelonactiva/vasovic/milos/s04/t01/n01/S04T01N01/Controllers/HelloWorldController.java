package cat.itacademy.barcelonactiva.vasovic.milos.s04.t01.n01.S04T01N01.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String getGreetings(@RequestParam(defaultValue = "unknown") String name){
        return "Hi "+name+", you are running a maven project.";
    }

    @GetMapping(value = {"/HelloWorld2", "HelloWorld2/{name}"})
    public String getGreetings2(@PathVariable(required = false) String name){
        if(name==null){
            name="unknown";
        }
        return "Hi "+name+", you are running a maven project";
    }
    
}
