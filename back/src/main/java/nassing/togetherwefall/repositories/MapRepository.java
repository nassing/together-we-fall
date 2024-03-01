package nassing.togetherwefall.repositories;

import nassing.togetherwefall.entities.map.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapRepository extends JpaRepository<Map, String> {
}