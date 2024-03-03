package nassing.togetherwefall.services;

import jakarta.transaction.Transactional;
import nassing.togetherwefall.entities.game.Server;
import nassing.togetherwefall.entities.player.Player;
import nassing.togetherwefall.repositories.ServerRepository;
import nassing.togetherwefall.repositories.PlayerAccountRepository;
import nassing.togetherwefall.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerService {
    private final ServerRepository serverRepository;
    private final PlayerRepository playerRepository;
    private final PlayerAccountRepository playerAccountRepository;

    @Autowired
    public ServerService(ServerRepository serverRepository, PlayerRepository playerRepository,
                         PlayerAccountRepository playerAccountRepository) {
        this.serverRepository = serverRepository;
        this.playerRepository = playerRepository;
        this.playerAccountRepository = playerAccountRepository;
    }

    @Transactional
    public Server createServer() {
        return serverRepository.save(new Server());
    }

    @Transactional
    public void deleteServer(long serverId) {
        serverRepository.deleteById(String.valueOf(serverId));
    }

    public List<Server> getServers() {
        return serverRepository.findAll();
    }

    public Player joinServer(long serverId, long playerAccountId) {
        Server server = serverRepository.findById(String.valueOf(serverId)).orElseThrow();
        List<Player> players = playerAccountRepository.findById(playerAccountId).orElseThrow().getPlayers();

        //Checks if a PlayerAccount has a player on this server
        for (Player player : players) {
            if (player.getServer().getId() == serverId) {
                return player;
            }
        }

        //If not, creates a new player
        //TODO: Create a base for the player on the map
        //TODO: Add survivors and items to the Player
        Player player = new Player();
        player.setServer(server);
        player.setPlayerAccount(playerAccountRepository.findById(playerAccountId).orElseThrow());
        return playerRepository.save(player);
    }
}
