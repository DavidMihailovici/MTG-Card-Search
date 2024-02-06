package com.specialtopics.mtgcardsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping
    public List<Card> searchCards(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String manaCost,
            @RequestParam(required = false) String type,
            @RequestParam(required = false) String expansion,
            @RequestParam(required = false) String artist
    ) {
        // Implement search logic in CardService
        return cardService.searchCards(name, manaCost, type, expansion, artist);
    }

    @GetMapping("/{card_id}")
    public Card getCardById(@PathVariable String card_id) {
        // Implement logic to get card by ID in CardService
        return cardService.getCardById(card_id);
    }

    @PostMapping
    public void addCard(@RequestBody Card card) {
        // Implement logic to add a new card in CardService
        cardService.addCard(card);
    }

    @PutMapping("/{card_id}")
    public void updateCard(@PathVariable String card_id, @RequestBody Card card) {
        // Implement logic to update a card in CardService
        cardService.updateCard(card_id, card);
    }

    @DeleteMapping("/{card_id}")
    public void deleteCard(@PathVariable String card_id) {
        // Implement logic to delete a card in CardService
        cardService.deleteCard(card_id);
    }
}