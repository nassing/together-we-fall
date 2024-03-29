package nassing.togetherwefall.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nassing.togetherwefall.entities.rooms.AbstractRoom;

@Repository
public interface RoomRepository extends JpaRepository<AbstractRoom, String> {
}
