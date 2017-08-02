package mvcspringtest.controllers;


import mvcspringtest.entity.TestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CControllerWithForms {

    //переход на страницу с формой. С этой страницы данные могут отправляться двумя разными методами (Гет и Пост) в
    // метод, который мы писали ранее - helloWithParam()
    @RequestMapping(value = "form")
    public String form() {
        return "three";
    }

    // Переход на страницу с формой, которая возвращает из формы готовый объект (spring form фрейморк)
    // объект передается в следующий метод
    @RequestMapping(value = "formCreateObject")
    public String formCreateObject() {
        return "four";
    }

    // А этот метод просто печатает объект, который получил из формы
    @RequestMapping(value = "entityPrinter")
    @ResponseBody
    public String entityPrinter(TestEntity newEntity) {
        return newEntity.toString();
    }
}