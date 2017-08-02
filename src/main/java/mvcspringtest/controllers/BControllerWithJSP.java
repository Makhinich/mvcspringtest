package mvcspringtest.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by Slava on 01.08.2017.
 */
public class BControllerWithJSP {
    @RequestMapping(value = "/helloFromJSP", method = RequestMethod.GET)
    public String helloFromJSP() {
        return "one";  // one -- это имя JSP
    }

    // с моделью Мар. Имя модели можно менять
    @RequestMapping(value = "/modelMap")
    public String modelMap(Map<String, Object> mod) {
        mod.put("ObjectKey", "SomeObject from modelMap");
        return "two";
    }

    // с моделью Мodel. Имя модели можно менять
    @RequestMapping(value = "/modelModel")
    public String modelModel(Model mod) {
        mod.addAttribute("ObjectKey", "SomeObject from modelModel");
        return "two";
    }

    // c ModelAndView
    @RequestMapping(value = "withModelAndView")
    public ModelAndView withModelAndView() {
        ModelAndView modelAndView = new ModelAndView("two"); // сразу имя не обязательно задавать, можно потом
        modelAndView.addObject("ObjectKey", "SomeObject from ModelAndView");
        return modelAndView;
    }
}
