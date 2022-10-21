package com.vickraman.players.repository;

import com.vickraman.players.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
    Player findByName(String name);
}
