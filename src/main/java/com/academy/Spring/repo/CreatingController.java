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
        Person person1 = new Person();
        person1.setId(1);
        person1.setNames("Max");

        Person person2= Person.builder()
                .id(1).names("Pero")
                .build();

        return person1;

        // Personperson = personRepository.findById(7);
    }
}
