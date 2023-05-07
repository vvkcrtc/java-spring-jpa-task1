package ru.netology.springjpatask1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.springjpatask1.repository.Person;

import java.util.List;
import java.util.Optional;

//@Repository
public interface PersonRepository
        extends JpaRepository<Person, Long> {

}
