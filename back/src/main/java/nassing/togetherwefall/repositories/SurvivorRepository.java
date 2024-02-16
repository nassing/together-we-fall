package nassing.togetherwefall.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nassing.togetherwefall.entities.Survivor;

@Repository
public interface SurvivorRepository extends JpaRepository<Survivor, String> {
}
