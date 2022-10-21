package com.vickraman.team.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Teams_TBL")
public class Team {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int budget;

}
