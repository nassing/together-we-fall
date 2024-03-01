package nassing.togetherwefall.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nassing.togetherwefall.entities.items.AItem;

@Repository
public interface ItemRepository extends JpaRepository<AItem, String> {
}
