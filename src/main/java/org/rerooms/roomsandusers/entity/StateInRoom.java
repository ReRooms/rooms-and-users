package org.rerooms.roomsandusers.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class StateInRoom extends AbstractEntity {

    private String userId;

    private Room room;

    private int mmr;

    private int rating;
}
