package nassing.togetherwefall.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nassing.togetherwefall.entities.player.PlayerAccount;

@Repository
public interface PlayerAccountRepository extends JpaRepository<PlayerAccount, Long> {
    PlayerAccount findByUsername(String username);

    boolean existsByUsernameAndPassword(String username, String password);

    void deleteByUsernameAndPassword(String username, String password);
}