package com.nye.progkor.game_organizer.sevice;

import com.nye.progkor.game_organizer.models.GameList;
import com.nye.progkor.game_organizer.repository.GameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepo gameRepo;

    public List<GameList> getAllGame() {

        return gameRepo.findAll();

    }
}
