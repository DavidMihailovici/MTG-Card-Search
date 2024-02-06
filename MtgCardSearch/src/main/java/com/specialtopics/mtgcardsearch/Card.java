package com.specialtopics.mtgcardsearch;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@AllArgsConstructor
@Getter
@Setter
@Document(indexName = "magiccards")
public class Card {

    @Id
    private String id;
    private String name;
    private String manaCost;
    private String type;
    private String rulesText;
    private String expansion;
    private String artist;
    private String image;


}
