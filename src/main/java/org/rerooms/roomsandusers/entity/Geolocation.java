package org.rerooms.roomsandusers.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Geolocation extends AbstractEntity {

    private String city;

    private String country;
}
