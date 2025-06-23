package com.nye.progkor.game_organizer.repository;

import com.nye.progkor.game_organizer.models.BuyingList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyingRepo extends JpaRepository<BuyingList, Integer> {
}
