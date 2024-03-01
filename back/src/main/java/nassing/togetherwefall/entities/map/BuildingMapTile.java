package nassing.togetherwefall.entities.map;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import nassing.togetherwefall.entities.Building;


@Entity
public class BuildingMapTile extends MapTile {
    @OneToOne
    private Building building;

    public BuildingMapTile() {
    }
}
