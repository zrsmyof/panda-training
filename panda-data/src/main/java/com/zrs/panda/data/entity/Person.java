package com.zrs.panda.data.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PERSON")
public class Person extends BaseEntity {

    private static final long serialVersionUID = -8594823000159488200L;

    /**
     * Person's name
     */
    @Column(name = "NAME", nullable = false)
    private String name;

    /**
     * Person's surname
     */
    @Column(name = "SURNAME", nullable = false)
    private String surname;

    /**
     * Person's middle name
     */
    @Column(name = "MIDDLE_NAME")
    private String middleName;

    /**
     * Person's age
     */
    @Column(name = "AGE")
    private Integer age;

    /**
     * Person's birthdate
     */
    @Column(name = "BIRTHDATE")
    private LocalDate birthdate;

    /**
     * Person's phone
     */
    @Column(name = "PHONE")
    private String phone;
}
