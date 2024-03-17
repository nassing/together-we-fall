package nassing.togetherwefall.entities.map;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import nassing.togetherwefall.entities.Building;


@Entity
@Table(schema = "twf", name = "building_map_tile")
public class BuildingMapTile extends MapTile {
    @OneToOne
    private Building building;

    public BuildingMapTile() {
        super();
    }
}
