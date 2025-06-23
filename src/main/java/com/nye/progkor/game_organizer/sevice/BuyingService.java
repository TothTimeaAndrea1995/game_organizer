package com.nye.progkor.game_organizer.sevice;

import com.nye.progkor.game_organizer.models.BuyingList;
import com.nye.progkor.game_organizer.repository.BuyingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyingService {

    @Autowired
    BuyingRepo buyingRepo;

    public List<BuyingList> getAllBuying() {

        return buyingRepo.findAll();

    }
}
