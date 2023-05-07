package ru.netology.springjpatask1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springjpatask1.repository.Person;
import ru.netology.springjpatask1.service.PersonService;
import ru.netology.springjpatask1.service.PersonServiceImpl;

import java.util.List;

@RestController
public class PersonController {
    //@Autowired
    private PersonService personService;

//    public PersonController(PersonService personService) {
//        this.personService = personService;
//    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") @Validated String city)
    {
        return personService.getPersonsByCity(city);
    }
}
