package nassing.togetherwefall.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nassing.togetherwefall.entities.items.Tool;
import nassing.togetherwefall.entities.player.Player;
import org.checkerframework.checker.units.qual.C;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "twf", name = "survivor")
public class Survivor {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "hp")
    private long hp;

    @Column(name = "hunger")
    private long hunger;

    @Column(name = "infection_rate")
    private long infectionRate;

    @ManyToOne
    private Player player;

    @OneToOne(mappedBy = "survivor")
    private Inventory inventory;

    @OneToOne(mappedBy = "survivor")
    private Tool tool;
}
