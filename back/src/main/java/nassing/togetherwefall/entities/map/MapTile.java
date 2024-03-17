package nassing.togetherwefall.entities.map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public abstract class MapTile {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "x")
    private int x;

    @Column(name = "y")
    private int y;
}
