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
public class Match extends AbstractEntity {

    @OneToOne
    private User user1;

    @OneToOne
    private User user2;
}
