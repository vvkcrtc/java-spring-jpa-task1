package ru.netology.springjpatask1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PersonRepository
        extends JpaRepository<Person, Long> {
    List<Person> findByCity(String City);


}
