package ru.netology.springjpatask1.service;


import org.springframework.stereotype.Service;
import ru.netology.springjpatask1.repository.NameId;
import ru.netology.springjpatask1.repository.Person;
import ru.netology.springjpatask1.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {

        this.personRepository = personRepository;
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(new NameId("name1", "surname1", 27), "1111111", "Moscow"));
        persons.add(new Person(new NameId("name2", "surname2", 24), "2222222", "Moscow"));
        persons.add(new Person(new NameId("name3", "surname3", 34), "3333333", "Moscow"));
        persons.add(new Person(new NameId("name4", "surname4", 37), "2223344", "Orel"));
        persons.add(new Person(new NameId("name5", "surname5", 35), "5553333", "Kursk"));
        persons.add(new Person(new NameId("name6", "surname6", 32), "3333333", "Tula"));
        personRepository.saveAll(persons);

    }


    @Override
    public List<Person> getPersonsByCity(String city) {
        return personRepository.findByCity(city);
    }

    @Override
    public List<Person> getPersonsByAge(int age) {
        return personRepository.findPersonByAgeBefore(age);
    }

    @Override
    public Person getPersonsByFullName(String name, String surname) {
        return personRepository.findPersonByNameAndSurname(name, surname);
    }


}
