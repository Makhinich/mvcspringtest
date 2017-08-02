package mvcspringtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Slava on 01.08.2017.
 */

@Controller
public class AControllerWithResponseBody {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody  // -- можно повесить эту аннотацию сразу на весь класс
    public String hello() {
        return "Hello";
    }

    // с тегом (при использовании @ResponseBody обозреватель читает возвращаемую строку так, как если бы он читал боди HTML)
    @RequestMapping(value = "/helloWithTeg", method = RequestMethod.GET)
    @ResponseBody
    public String helloWithTeg() {
        return "<h1>Hello with teg</h1>";
    }

    //    когда имя передаем как параметр
    // в урл обозревателя вводим http://localhost:8080/helloWithParam?param=sss   -- вместо sss любое имя
    // Также параметр может передаваться в теле запроса, методом Пост. Пример будет ниже.
    @RequestMapping(value = "/helloWithParam")
    @ResponseBody
    public String helloWithParam(@RequestParam(value = "param", defaultValue = "") String name) {
        return "Hello " + name + " !!!" + " helloWithParam";
    }

    //     когда имя часть юрл
    // в урл обозревателя вводим http://localhost:8080/helloWithPathVariable/sss   -- вместо sss любое имя
    @RequestMapping(value = "/helloWithPathVariable/{var}")
    @ResponseBody
    public String helloWithPathVariable(@PathVariable("var") String name) {
        return "Hello " + name + " !!!" + " helloWithPathVariable";
    }
}
