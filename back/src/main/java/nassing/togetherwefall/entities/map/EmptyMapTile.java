package nassing.togetherwefall.entities.map;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(schema = "twf", name = "empty_map_tile")
public class EmptyMapTile extends MapTile {
    public EmptyMapTile() {
        super();
    }
}
