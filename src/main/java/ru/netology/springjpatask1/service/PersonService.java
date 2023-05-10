package ru.netology.springjpatask1.service;

import ru.netology.springjpatask1.repository.Person;

import java.util.List;

public interface PersonService {
    List<Person> getPersonsByCity(String city);

    List<Person> getPersonsByAge(int age);

    Person getPersonsByFullName(String name, String surname);
}
