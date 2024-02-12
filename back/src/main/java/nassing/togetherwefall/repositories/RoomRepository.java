package nassing.togetherwefall.repositories;

import org.springframework.data.repository.CrudRepository;

import nassing.togetherwefall.entities.Room;

public interface RoomRepository extends CrudRepository<Room, String> {
}
