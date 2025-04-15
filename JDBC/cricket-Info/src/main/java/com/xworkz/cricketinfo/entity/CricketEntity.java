package com.xworkz.cricketinfo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name="cricketinfo")
@Entity
@Setter
@Getter
@ToString

public class CricketEntity {
    @Id
    @Column(name = "player_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int player_id;
    @Column(name="name")
    private String name;
    @Column(name = "jerseyNumber")
    private int jerseyNumber;
    @Column(name="height")
    private float height;
    @Column(name="age")
    private int age;
    @Column(name="location")
    private String location;
    @Column(name="country")
    private String country;
    @Column(name="iplTeam")
    private String iplTeam;
    @Column(name="orderOfPlayer")
    private String orderOfPlayer;
    @Column(name="internationalScores")
    private int internationalScores;
}
