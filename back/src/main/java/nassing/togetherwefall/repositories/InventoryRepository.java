package nassing.togetherwefall.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nassing.togetherwefall.entities.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, String> {
}
