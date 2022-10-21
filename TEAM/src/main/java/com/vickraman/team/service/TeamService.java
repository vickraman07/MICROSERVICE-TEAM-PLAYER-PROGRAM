package com.vickraman.team.service;

import com.vickraman.team.entity.Team;
import com.vickraman.team.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepository repository;

    public Team saveTeam(Team team) {
        return repository.save(team);
    }

    public List<Team> saveTeams(List<Team> teams) {
        return repository.saveAll(teams);
    }

    public List<Team> getTeam() {
        return repository.findAll();
    }

    public Team getTeamById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Team getTeamByName(String name) {
        return repository.findByName(name);
    }

    public String deleteTeam(int id) {
        repository.deleteById(id);
        return "team removed !! " + id;
    }

    public Team updateTeam(Team team) {
        Team existingTeam = repository.findById(team.getId()).orElse(null);
        existingTeam.setName(team.getName());
        existingTeam.setBudget(team.getBudget());
        return repository.save(existingTeam);

    }
}
