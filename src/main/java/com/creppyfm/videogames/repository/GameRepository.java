package com.creppyfm.videogames.repository;

import com.creppyfm.videogames.model.Game;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GameRepository extends MongoRepository<Game, ObjectId> {
    Optional<Game> findGamesByGameId (String gameId);

    Optional<Game> findGameByGameId(String gameId);
}
