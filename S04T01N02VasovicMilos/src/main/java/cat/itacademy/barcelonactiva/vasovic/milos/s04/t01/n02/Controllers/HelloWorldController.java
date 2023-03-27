package cat.itacademy.barcelonactiva.vasovic.milos.s04.t01.n02.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String getGreetings(@RequestParam(defaultValue = "unknown") String name){
        return "Hello "+name+", you are running a gradle project";
    }

    @GetMapping(value= {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String getGreetings2(@PathVariable Optional<String> name){

        return "Hello "+name.orElseGet(()->"unknown")+", you are running a gradle project";

    }



}
