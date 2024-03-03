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
    public void createPlayerAccount(String username, String password) {
        PlayerAccount playerAccount = new PlayerAccount();
        playerAccount.setUsername(username);
        playerAccount.setPassword(password);
        playerAccountRepository.save(playerAccount);
    }

    @Transactional
    public void deletePlayerAccount(String username, String password) {
        playerAccountRepository.deleteByUsernameAndPassword(username, password);
    }

    public boolean checkPlayerAccount(String username, String password) {
        return playerAccountRepository.existsByUsernameAndPassword(username, password);
    }
}
