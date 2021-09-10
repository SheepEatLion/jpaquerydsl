package com.example.jpaquerydsl.service.domain;


import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {

    @Id
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;

    @Builder
    public Team(String name) {
        this.name = name;
    }
}
