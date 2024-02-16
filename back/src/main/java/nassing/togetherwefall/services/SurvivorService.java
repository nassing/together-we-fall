package nassing.togetherwefall.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nassing.togetherwefall.entities.Inventory;
import nassing.togetherwefall.entities.Player;
import nassing.togetherwefall.entities.Survivor;
import nassing.togetherwefall.repositories.SurvivorRepository;
import nassing.togetherwefall.repositories.InventoryRepository;
import nassing.togetherwefall.repositories.PlayerRepository;

@Service
public class SurvivorService {
    private final SurvivorRepository survivorRepository;
    private final InventoryRepository inventoryRepository;
    private final PlayerRepository playerRepository;

    @Autowired
    public SurvivorService(SurvivorRepository survivorRepository, InventoryRepository inventoryRepository, PlayerRepository playerRepository) {
        this.survivorRepository = survivorRepository;
        this.inventoryRepository = inventoryRepository;
        this.playerRepository = playerRepository;
    }

    @Transactional
    public Survivor createSurvivor(String name, long playerId) {
        Player player;
        if (playerId == 0) {
            player = playerRepository.save(new Player());
            player.setName(generatePlayerName(player));
            player = playerRepository.save(player);
        } else {
            player = findPlayer(playerId);
        }

        Inventory inventory = inventoryRepository.save(new Inventory());
        
        Survivor survivor = new Survivor();
        survivor.setName(name);
        survivor.setInventory(inventory);
        survivor.setPlayer(player);
        
        return survivorRepository.save(survivor);
    }

    private Player findPlayer(long playerId) {
        return playerRepository.findById(playerId).orElseThrow(() -> new IllegalStateException("Player with id " + playerId + " does not exist"));
    }

    private String generatePlayerName(Player player) {
        return "Player" + player.getId();
    }

}