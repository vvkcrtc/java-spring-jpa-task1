package ru.netology.springjpatask1.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@NoArgsConstructor
public class NameId implements Serializable {
    @Column(name="age",nullable = false)
    private int age;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "surname")
    private String surname;



//    public NameId() {
//
//    }

    public NameId(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int hashCode() {
        return Objects.hash(getName(), getSurname(),getAge());
    }
}
