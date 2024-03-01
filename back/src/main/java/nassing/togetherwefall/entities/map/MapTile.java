package nassing.togetherwefall.entities.map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public abstract class MapTile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int x;
    private int y;

    public MapTile() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int[] getCoordinates() {
        return new int[]{x, y};
    }

    public void setCoordinates(Integer x, Integer y) {
        if(x != null) this.x = x;
        if(y != null) this.y = y;
    }
}
