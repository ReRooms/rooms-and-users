package org.rerooms.roomsandusers.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Room extends AbstractEntity {

    private String name;

    @ManyToMany
    private List<User> users;
}
