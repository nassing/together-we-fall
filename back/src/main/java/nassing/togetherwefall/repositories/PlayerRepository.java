package nassing.togetherwefall.repositories;

import org.springframework.data.repository.CrudRepository;

import nassing.togetherwefall.entities.Player;

public interface PlayerRepository extends CrudRepository<Player, String> {
}
