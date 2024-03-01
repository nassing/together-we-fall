package nassing.togetherwefall.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nassing.togetherwefall.entities.player.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}