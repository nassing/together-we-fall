package nassing.togetherwefall.controllers;

import nassing.togetherwefall.entities.Game;
import nassing.togetherwefall.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/games")
public class GameController {
    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping
    public ResponseEntity<Game> createGame(@RequestBody Map<String, Object> requestData) {
    }

    @GetMapping
    public ResponseEntity<Game> getGame(@PathVariable long gameId) {
    }

    @GetMapping
    public ResponseEntity<Game> getGames() {
    }

    @DeleteMapping
    public ResponseEntity<Game> deleteGame(@PathVariable long gameId) {
    }
}