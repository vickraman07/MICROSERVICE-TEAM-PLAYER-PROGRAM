package com.vickraman.players.entity;
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
@Table(name = "PLAYER_TBL")
public class Player {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String playerType;
    private int biddingAmount;

}
