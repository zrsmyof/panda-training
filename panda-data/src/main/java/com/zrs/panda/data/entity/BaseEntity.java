package com.zrs.panda.data.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Version;
import java.io.Serializable;
import java.util.UUID;

@Getter
@ToString
@EqualsAndHashCode
public abstract class BaseEntity implements Serializable {
    @Id
    @Column(
            name = "ID",
            nullable = false,
            length = 36
    )
    @GeneratedValue(
            generator = "uuid"
    )
    private UUID id;

    @Version
    private int version;
}
