package nassing.togetherwefall.repositories;

import org.springframework.data.repository.CrudRepository;

import nassing.togetherwefall.entities.Item;

public interface ItemRepository extends CrudRepository<Item, String> {
}
