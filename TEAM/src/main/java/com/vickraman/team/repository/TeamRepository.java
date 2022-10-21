package com.vickraman.team.repository;

import com.vickraman.team.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Integer> {
    Team findByName(String name);
}
