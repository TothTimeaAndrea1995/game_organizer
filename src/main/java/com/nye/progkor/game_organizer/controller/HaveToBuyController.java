package com.nye.progkor.game_organizer.controller;

import com.nye.progkor.game_organizer.models.BuyingList;
import com.nye.progkor.game_organizer.sevice.BuyingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("buy")
public class HaveToBuyController {

    @Autowired
    BuyingService buyingService;

    @GetMapping("buyingList")
    public List<BuyingList> getAllBuying(){
        return buyingService.getAllBuying();
    }
}
