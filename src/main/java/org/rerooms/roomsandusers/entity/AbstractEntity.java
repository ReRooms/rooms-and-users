package org.rerooms.roomsandusers.entity;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractEntity {

    @Id
    private UUID id;

    private long modificationDate;
}
