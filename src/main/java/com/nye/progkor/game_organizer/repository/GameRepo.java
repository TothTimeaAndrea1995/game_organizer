package com.nye.progkor.game_organizer.repository;

import com.nye.progkor.game_organizer.models.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepo extends JpaRepository<GameList, Integer> {

}
