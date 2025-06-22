package com.nye.progkor.game_organizer.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer gameId;
    private String gameName;
    private String gameGenre;
    private String platform;
    private String store;

}
