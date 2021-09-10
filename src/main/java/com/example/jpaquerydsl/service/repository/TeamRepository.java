package com.example.jpaquerydsl.service.repository;

import com.example.jpaquerydsl.service.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
