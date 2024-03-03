package nassing.togetherwefall.services;

import jakarta.transaction.Transactional;
import nassing.togetherwefall.entities.game.Game;
import nassing.togetherwefall.entities.player.Player;
import nassing.togetherwefall.repositories.GameRepository;
import nassing.togetherwefall.repositories.PlayerAccountRepository;
import nassing.togetherwefall.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private final GameRepository gameRepository;
    private final PlayerRepository playerRepository;
    private final PlayerAccountRepository playerAccountRepository;

    @Autowired
    public GameService(GameRepository gameRepository, PlayerRepository playerRepository,
                       PlayerAccountRepository playerAccountRepository) {
        this.gameRepository = gameRepository;
        this.playerRepository = playerRepository;
        this.playerAccountRepository = playerAccountRepository;
    }

    @Transactional
    public Game createGame() {
        return gameRepository.save(new Game());
    }

    @Transactional
    public void deleteGame(long gameId) {
        gameRepository.deleteById(String.valueOf(gameId));
    }

    public List<Game> getGames() {
        return gameRepository.findAll();
    }

    public Player joinGame(long gameId, long playerAccountId) {
        Game game = gameRepository.findById(String.valueOf(gameId)).orElseThrow();
        List<Player> players = playerAccountRepository.findById(playerAccountId).orElseThrow().getPlayers();

        //Checks if a PlayerAccount has a player on this server
        for (Player player : players) {
            if (player.getGame().getId() == gameId) {
                return player;
            }
        }

        //If not, creates a new player
        //TODO: Create a base for the player on the map
        //TODO: Add survivors and items to the Player
        Player player = new Player();
        player.setGame(game);
        player.setPlayerAccount(playerAccountRepository.findById(playerAccountId).orElseThrow());
        return playerRepository.save(player);
    }
}
