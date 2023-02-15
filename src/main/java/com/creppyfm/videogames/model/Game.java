package com.creppyfm.videogames.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "videogames")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    @Id
    private ObjectId id;

    private String gameId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    //manual reference relationship
    @DocumentReference
    private List<Review> reviewIds;

    public Game(String gameId,
                String title,
                String releaseDate,
                String trailerLink,
                String poster,
                List<String> backdrops,
                List<String> genres) {
        this.gameId = gameId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.backdrops = backdrops;
        this.genres = genres;
    }
}
