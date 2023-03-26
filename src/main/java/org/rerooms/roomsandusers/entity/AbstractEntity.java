package org.rerooms.roomsandusers.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractEntity {

    private UUID id;

    private long modificationDate;
}
