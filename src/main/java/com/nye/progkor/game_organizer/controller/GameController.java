package com.nye.progkor.game_organizer.controller;

import com.nye.progkor.game_organizer.models.GameList;
import com.nye.progkor.game_organizer.sevice.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping("gameList")
    public List<GameList> getAllGame(){

        return gameService.getAllGame();

        //return "Ezek az én játékaim"; --> Teszt

    }

}