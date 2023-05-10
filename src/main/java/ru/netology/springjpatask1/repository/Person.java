package ru.netology.springjpatask1.repository;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



//@Table(name="persons")
@Entity
@Data
@NoArgsConstructor
@Builder
public class Person {

    @EmbeddedId
    private NameId id;

    private String phone_number;

    private String city_of_living;


//    public Person() {
//
//    }

    public Person(NameId id, String phone_number, String city_of_living) {
        this.id = id;
        this.phone_number = phone_number;
        this.city_of_living = city_of_living;
    }
}
