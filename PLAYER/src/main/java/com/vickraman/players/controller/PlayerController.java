package com.vickraman.players.controller;

import com.vickraman.players.entity.Player;
import com.vickraman.players.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService service;

    @PostMapping("/addPlayer")
    public Player addPlayer(@RequestBody Player passanger) {
        return service.savePassanger(passanger);
    }

    @PostMapping("/addPlayers")
    public List<Player> addPlayers(@RequestBody List<Player> player) {
        return service.savePlayers(player);
    }

    @GetMapping("/players")
    public List<Player> findAllPlayers() {
        return service.getPlayer();
    }

    @GetMapping("/playersById/{id}")
    public Player findPlayerById(@PathVariable int id) {
        return service.getPlayerById(id);
    }

    @GetMapping("/player/{name}")
    public Player findPlayerByName(@PathVariable String name) {
        return service.getPlayerByName(name);
    }

    @PutMapping("/update")
    public Player updatePlayer(@RequestBody Player passanger) {
        return service.updatePlayer(passanger);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePlayer(@PathVariable int id) {
        return service.deletePlayer(id);
    }


}
