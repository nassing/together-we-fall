package nassing.togetherwefall.services;

import jakarta.transaction.Transactional;
import nassing.togetherwefall.entities.player.PlayerAccount;
import nassing.togetherwefall.repositories.PlayerAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerAccountService {
    private final PlayerAccountRepository playerAccountRepository;

    @Autowired
    public PlayerAccountService(PlayerAccountRepository playerAccountRepository) {
        this.playerAccountRepository = playerAccountRepository;
    }

    @Transactional
    public void createPlayerAccount(String name, String password) {
        PlayerAccount playerAccount = new PlayerAccount();
        playerAccount.setName(name);
        playerAccount.setPassword(password);
        playerAccountRepository.save(playerAccount);
    }

    public PlayerAccount findPlayerAccount(String name) {
        return playerAccountRepository.findByName(name).orElseThrow(() -> new IllegalStateException("PlayerAccount with name " + name + " does not exist"));
    }
}
