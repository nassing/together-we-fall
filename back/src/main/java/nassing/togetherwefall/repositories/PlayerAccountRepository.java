package nassing.togetherwefall.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nassing.togetherwefall.entities.player.PlayerAccount;

@Repository
public interface PlayerAccountRepository extends JpaRepository<PlayerAccount, Long> {
}