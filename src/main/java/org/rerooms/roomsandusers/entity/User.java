package org.rerooms.roomsandusers.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User extends AbstractEntity {

    private String userName;

    @Transient
    private List<Hobby> hobbies;

    private String description;

    @OneToOne
    private Geolocation geolocation;

    private byte age;

    @ManyToMany
    private List<Room> rooms;

    public void setAge(byte age) {
        if (age < 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be greater than 0");
        }
    }
}
