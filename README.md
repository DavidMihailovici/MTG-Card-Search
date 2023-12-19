The MTG Card Database is a comprehensive and well-organized database of Magic: The Gathering cards which includes many important details regarding each card. It allows users to search for cards by name or by different criteria and to view the cards’ image and information. The admins can add, delete, and edit cards and their attached information.
Use Cases
 User:
•	Search card by different criteria: name, mana cost, card type, expansion, illustration artist
•	View cards and their attached information
•	View a random card from the database
Admin (in addition to user use cases):
•	Add new card (included information: card image, name, mana cost, card type, rules text, expansion, illustration artist)
•	Edit card information (card image, name, mana cost, card type, rules text, expansion, illustration artist)
•	Delete card
 
Endpoints:
1.	Search card by different criteria:
•	/cards?name={card_name}
•	/cards?manaCost={mana_cost}
•	/cards?type={card_type}
•	/cards?expansion={expansion_name}
•	/cards?artist={artist_name}
2.	View cards and their attached information:
•	/cards/{card_id}
3.	View a random card from the database:
•	/cards/random
4.	Add new card:
•	POST /cards
•	Request body contains information: 
{
    "name": "Card Name",
    "manaCost": "{mana_cost}",
    "type": "Card Type",
    "rulesText": "Rules Text",
    "expansion": "Expansion Name",
    "artist": "Illustration Artist",
    "image": "Card Image URL"
}
5.	Edit card information:
•	PUT /cards/{card_id}
•	Request body with updated information similar to the add card endpoint.
6.	Delete card:
•	DELETE /cards/{card_id}

