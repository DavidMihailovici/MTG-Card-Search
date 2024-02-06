package com.specialtopics.mtgcardsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public List<Card> searchCards(String name, String manaCost, String type, String expansion, String artist) {
        // Find cards by name and expansion
        if (name != null && expansion != null) {
            return cardRepository.findByNameAndExpansion(name, expansion);
        }

        // Find cards by name
        if (name != null) {
            return cardRepository.findByName(name);
        }

        // Find cards by manaCost
        if (manaCost != null) {
            return cardRepository.findByManaCost(manaCost);
        }

        // Find cards by expansion
        if (expansion != null) {
            return cardRepository.findByExpansion(expansion);
        }

        // Find cards by type
        if (type != null) {
            return cardRepository.findByType(type);
        }

        // Find cards by artist
        if (artist != null) {
            return cardRepository.findByArtist(artist);
        }

        // If no specific conditions match, return all cards
        return (List<Card>) cardRepository.findAll();
    }

    public Card getCardById(String card_id) {
        // Use the findById method provided by ElasticsearchRepository
        Optional<Card> optionalCard = cardRepository.findById(card_id);

        // Check if the card exists
        if (optionalCard.isPresent()) {
            return optionalCard.get();
        } else {
            // You may choose to throw an exception or return null depending on your requirements
            throw new RuntimeException("Card not found with ID: " + card_id);
        }
    }

    public void addCard(Card card) {
        // Implement logic to add a new card
        cardRepository.save(card);
    }

    public void updateCard(String card_id, Card card) {
        // Implement logic to update a card
        cardRepository.save(card);
    }

    public void deleteCard(String card_id) {
        // Implement logic to delete a card
        cardRepository.deleteById(card_id);
    }
}