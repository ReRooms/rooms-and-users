package org.rerooms.roomsandusers.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Match extends AbstractEntity {

    private User user1;

    private User user2;
}
