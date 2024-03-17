package nassing.togetherwefall.entities.map;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "twf", name = "map")
public class Map {
    @Id
    @Column(name = "id")
    private UUID id;

    @OneToMany
    private List<MapTile> mapTiles;
}
