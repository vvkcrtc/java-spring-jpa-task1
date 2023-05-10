package ru.netology.springjpatask1.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springjpatask1.repository.Person;
import ru.netology.springjpatask1.service.PersonService;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") @Validated String city) {
        return personService.getPersonsByCity(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> getPersonsByAge(@RequestParam("age") @Validated int age) {
        return personService.getPersonsByAge(age);
    }

    @GetMapping("/persons/by-fullname")
    public Person getPersonsByAge(@RequestParam("name") @Validated String name, @RequestParam("surname") @Validated String surname) {
        return personService.getPersonsByFullName(name, surname);
    }
}
