package org.rerooms.roomsandusers.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class StateInRoom extends AbstractEntity {

    @OneToOne
    private User user;

    @OneToOne
    private Room room;

    private int mmr;

    private int rating;
}
