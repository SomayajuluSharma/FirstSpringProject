package dev.stunning.productcatalogservice.Controllers;

import dev.stunning.productcatalogservice.Services.MyFirstService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {
    private MyFirstService myFirstService;
    public MyFirstController(MyFirstService myFirstService){
        this.myFirstService = myFirstService;
    }
    @GetMapping("/")
    public String sayHi(){
        return "Hey There!";
     }
}
