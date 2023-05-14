package ru.netology.springjpatask1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface PersonRepository
        extends JpaRepository<Person, Long> {
    List<Person> findByCity(String City);
    @Query("SELECT p FROM Person p  WHERE p.id.age<(:pAge) ORDER BY p.id.age ASC")
    List<Person> findPersonByAgeBefore(@Param("pAge") int pAge);

    @Query("SELECT p FROM Person p  WHERE p.id.name=(:pName) AND p.id.surname=(:pSurname)")

    Person findPersonByNameAndSurname(@Param("pName") String pName, @Param("pSurname") String pSurname);

    //List<Contact> findByLastNameAndPhoneType()

}
