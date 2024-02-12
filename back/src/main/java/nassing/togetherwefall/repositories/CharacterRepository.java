package nassing.togetherwefall.repositories;

import org.springframework.data.repository.CrudRepository;

import nassing.togetherwefall.entities.Character;

public interface CharacterRepository extends CrudRepository<Character, String> {
}
