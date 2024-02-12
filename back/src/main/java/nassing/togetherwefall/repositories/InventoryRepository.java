package nassing.togetherwefall.repositories;

import org.springframework.data.repository.CrudRepository;

import nassing.togetherwefall.entities.Inventory;

public interface InventoryRepository extends CrudRepository<Inventory, String> {
}
