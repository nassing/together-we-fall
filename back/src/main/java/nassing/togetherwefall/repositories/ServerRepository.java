package nassing.togetherwefall.repositories;

import nassing.togetherwefall.entities.game.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerRepository extends JpaRepository<Server, String> {
}