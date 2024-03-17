package nassing.togetherwefall.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nassing.togetherwefall.entities.player.Player;
import nassing.togetherwefall.entities.rooms.AbstractRoom;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "twf", name = "building")
public class Building {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "food")
    private int food;

    @Column(name = "materials")
    private int materials;

    @Column(name = "spare_parts")
    private int spareParts;

    @Column(name = "rooms_count")
    private int roomsCount;

    @ManyToOne
    private Player player;

    @OneToMany(mappedBy = "building")
    private List<AbstractRoom> rooms = new ArrayList<>();
}