package nassing.togetherwefall.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nassing.togetherwefall.entities.Building;

@Repository
public interface BuildingRepository extends JpaRepository<Building, String> {
}
