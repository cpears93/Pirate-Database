package com.codeclan.example.pirateservice.models;

import javax.persistence.*;

@Entity
@Table(name = "pirates")
    public class Pirate {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name ="first_name")
        private String firstName;

        @Column(name ="last_name")
        private String lastName;

        @Column
        private int age;

    public Pirate(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Pirate() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}

