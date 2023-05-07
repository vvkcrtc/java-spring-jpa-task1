package ru.netology.springjpatask1.repository;

import javax.persistence.*;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NamedQuery;
import org.springframework.data.annotation.Id;



//@Table(name="persons")
@Entity
@Data
@Builder
public class Person {

    @EmbeddedId
    private NameId id;

    private String phone_number;

    private String city_of_living;


    public Person() {

    }

    public Person(NameId id, String phone_number, String city_of_living) {
        this.id = id;
        this.phone_number = phone_number;
        this.city_of_living = city_of_living;
    }
}
