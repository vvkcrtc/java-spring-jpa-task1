package ru.netology.springjpatask1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.springjpatask1.repository.Person;
import ru.netology.springjpatask1.repository.PersonRepository;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    //@Autowired
    private PersonRepository personRepository;

//    public PersonServiceImpl(PersonRepository personRepository) {
//        this.personRepository = personRepository;
//    }

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
