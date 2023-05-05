package org.rerooms.roomsandusers.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class Tweet extends AbstractEntity {

    private String userId;

    private String text;

    private int likes;

    private List<Tweet> replies;

    private Room room;
}
