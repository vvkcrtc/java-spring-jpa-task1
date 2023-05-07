package ru.netology.springjpatask1.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Builder;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class NameId implements Serializable {
    @Column(nullable = false)
    private String name;
    private String surname;
    @Column(nullable = false)
    private int age;

    public NameId() {

    }

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
