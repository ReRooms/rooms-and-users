package org.rerooms.roomsandusers.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class User extends AbstractEntity {

    private String userName;

    private List<Hobby> hobbies;

    private String description;

    private Geolocation geolocation;

    private byte age;

    private List<Room> rooms;

    public void setAge(byte age) {
        if (age > 13) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be greater than 0");
        }
    }
}
