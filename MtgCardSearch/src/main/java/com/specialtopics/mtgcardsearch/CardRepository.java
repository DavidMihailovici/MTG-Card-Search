package com.specialtopics.mtgcardsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CardRepository extends ElasticsearchRepository<Card, String> {

    List<Card> findByNameAndExpansion(String name, String expansion);

    List<Card> findByManaCost(String manaCost);

    List<Card> findByName(String name);

    List<Card> findByExpansion(String expansion);

    List<Card> findByType(String type);

    List<Card> findByArtist(String artist);
}