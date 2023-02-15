package com.creppyfm.videogames.service;

import com.creppyfm.videogames.model.Game;
import com.creppyfm.videogames.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAllGames() {
        return gameRepository.findAll();
    }

    public Optional<Game> findGameByGameId(String gameId) {
        return gameRepository.findGameByGameId(gameId);
    }
}
