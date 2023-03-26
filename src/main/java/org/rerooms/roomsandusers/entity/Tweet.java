package org.rerooms.roomsandusers.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Tweet extends AbstractEntity {

    @ManyToOne
    private User user;

    private String text;

    private int likes;

    @OneToMany
    private List<Tweet> replies;

    @ManyToOne
    private Room room;
}
