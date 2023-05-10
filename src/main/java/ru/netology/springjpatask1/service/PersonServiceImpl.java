package ru.netology.springjpatask1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.springjpatask1.repository.NameId;
import ru.netology.springjpatask1.repository.Person;
import ru.netology.springjpatask1.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {

        this.personRepository = personRepository;
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(new NameId("name1","surname1",22),"1111111","Moscow"));
        persons.add(new Person(new NameId("name2","surname2",22),"2222222","Moscow"));
        persons.add(new Person(new NameId("name3","surname3",22),"3333333","Moscow"));
        personRepository.saveAll(persons);


    }

    @Override
    public List<Person> getPersonsByCity(String city) {
        return (List<Person>)
                personRepository.findAll();
    };
    @Override
    public List<Person> getPersonsByAge(int age) {
        return (List<Person>)
                personRepository.findAll();
    };

    @Override
    public List<Person> getPersonsByFullName(String name, String surname) {
        return (List<Person>)
                personRepository.findAll();
    };


}
