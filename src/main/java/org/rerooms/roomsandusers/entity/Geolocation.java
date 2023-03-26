package org.rerooms.roomsandusers.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Geolocation extends AbstractEntity {

    private String city;

    private String country;
}
