package com.creppyfm.videogames.controller;

import com.creppyfm.videogames.model.Game;
import com.creppyfm.videogames.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<Game>> getAllGames() {
        return new ResponseEntity<List<Game>>(gameService.findAllGames(), HttpStatus.OK);
    }

    @GetMapping("/{gameId}")
    public ResponseEntity<Optional<Game>> getSingleGame (@PathVariable String gameId) {
        return new ResponseEntity<Optional<Game>>(gameService.findGameByGameId(gameId), HttpStatus.OK);
    }
}
