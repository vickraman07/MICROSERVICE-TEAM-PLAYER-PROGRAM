package com.vickraman.players.service;

import com.vickraman.players.entity.Player;
import com.vickraman.players.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository repository;

    public Player savePassanger(Player player) {
        return repository.save(player);
    }

    public List<Player> savePlayers(List<Player> players) {
        return repository.saveAll(players);
    }

    public List<Player> getPlayer() {
        return repository.findAll();
    }

    public Player getPlayerById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Player getPlayerByName(String name) {
        return repository.findByName(name);
    }

    public String deletePlayer(int id) {
        repository.deleteById(id);
        return "player removed !! " + id;
    }

    public Player updatePlayer(Player player) {
        Player existingPlayer = repository.findById(player.getId()).orElse(null);
        existingPlayer.setName(player.getName());
        existingPlayer.setAge(player.getAge());
        existingPlayer.setPlayerType(player.getPlayerType());
        existingPlayer.setBiddingAmount(player.getBiddingAmount());

        return repository.save(existingPlayer);
    }
}
