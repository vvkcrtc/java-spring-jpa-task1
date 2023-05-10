package ru.netology.springjpatask1.repository;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Data
@NoArgsConstructor
@Builder
public class Person {

    @EmbeddedId
    private NameId id;

    private String phone_number;
    @Column(name = "city_of_living")
    private String city;




    public Person(NameId id, String phone_number, String city) {
        this.id = id;
        this.phone_number = phone_number;
        this.city = city;
    }

    public String getName() {
        return id.getName();
    }

    public String getSurname() {
        return id.getSurname();
    }
    public int getAge() {
        return id.getAge();
    }
}
