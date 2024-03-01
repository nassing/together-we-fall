package nassing.togetherwefall.services;

import jakarta.transaction.Transactional;
import nassing.togetherwefall.entities.Game;
import nassing.togetherwefall.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional
    public Game createGame(String name) {
        Game game = new Game();
        game.setName(name);
        return gameRepository.save(game);
    }
}
