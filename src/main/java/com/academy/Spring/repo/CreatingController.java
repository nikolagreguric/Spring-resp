package com.academy.Spring.repo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class CreatingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="n", required = false, defaultValue = "World") String someName, Model model) {

        someName.toUpperCase();
        model.addAttribute("inputName", someName.toUpperCase());

        return "greeting";
    }
    @GetMapping("/person")
    @ResponseBody
    public Person personJson(){
        Person person = new Person();
        person.setId(1);
        person.setNames("Max");

        return person;

        // Personperson = personRepository.findById(7);
    }
}
