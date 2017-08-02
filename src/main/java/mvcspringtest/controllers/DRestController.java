package mvcspringtest.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // -- эта аннотация заменяет @Controller и @ResponseBody для всех методов
public class DRestController {

    @RequestMapping("RestControllerFirst")
    public String restController() {
        return "Hello from first rest controller";
    }
}
