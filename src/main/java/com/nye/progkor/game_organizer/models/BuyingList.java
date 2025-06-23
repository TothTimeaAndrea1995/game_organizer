package com.nye.progkor.game_organizer.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class BuyingList {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer buyingId;
    private String gameName;
    private String gameGenre;
    private String platform;
    private String store;
}
