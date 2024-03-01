package nassing.togetherwefall.entities.map;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany
    private List<MapTile> mapTiles;

    public Map() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
