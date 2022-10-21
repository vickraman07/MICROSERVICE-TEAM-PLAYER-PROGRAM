package com.vickraman.team.controller;

import com.vickraman.team.entity.Team;
import com.vickraman.team.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/team")
public class TeamController {
    @Autowired
    private TeamService service;

    @PostMapping("/addTeam")
    public Team addTeam(@RequestBody Team team) {
        return service.saveTeam(team);
    }

    @PostMapping("/addTeams")
    public List<Team> addTeams(@RequestBody List<Team> team) {
        return service.saveTeams(team);
    }

    @GetMapping("/teams")
    public List<Team> findAllTeams() {
        return service.getTeam();
    }

    @GetMapping("/teamsById/{id}")
    public Team findTeamById(@PathVariable int id) {
        return service.getTeamById(id);
    }

    @GetMapping("/team/{name}")
    public Team findTeamByName(@PathVariable String name) {
        return service.getTeamByName(name);
    }

    @PutMapping("/update")
    public Team updateTeam(@RequestBody Team passanger) {
        return service.updateTeam(passanger);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTeam(@PathVariable int id) {
        return service.deleteTeam(id);
    }


}
