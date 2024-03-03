package nassing.togetherwefall.controllers;

import nassing.togetherwefall.entities.game.Game;
import nassing.togetherwefall.entities.player.Player;
import nassing.togetherwefall.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping
    public ResponseEntity<Game> createGame() {
        Game newGame = gameService.createGame();
        return ResponseEntity.ok(newGame);
    }

    @DeleteMapping("/{gameId}")
    public ResponseEntity<Void> deleteGame(@PathVariable long gameId) {
        gameService.deleteGame(gameId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Game>> getAllGames() {
        List<Game> games = gameService.getGames();
        return ResponseEntity.ok(games);
    }

    @PostMapping("/{gameId}/join/{playerAccountId}")
    public ResponseEntity<Player> joinGame(@PathVariable long gameId, @PathVariable long playerAccountId) {
        Player player = gameService.joinGame(gameId, playerAccountId);
        return ResponseEntity.ok(player);
    }
}
