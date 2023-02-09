package com.udacity.jdnd.course3.critter.user.data;

import org.hibernate.annotations.Nationalized;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * MappedSuperclass because you do not need to query Users, just its child classes.
 */

@MappedSuperclass
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Nationalized
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
