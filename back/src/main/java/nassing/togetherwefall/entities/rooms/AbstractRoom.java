package nassing.togetherwefall.entities.rooms;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nassing.togetherwefall.entities.Building;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public abstract class AbstractRoom {
    @Id
    private UUID id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "buildingId")
    private Building building;
}
