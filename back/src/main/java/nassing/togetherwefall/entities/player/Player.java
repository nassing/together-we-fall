package nassing.togetherwefall.entities.player;

import jakarta.persistence.*;
import nassing.togetherwefall.entities.Building;
import nassing.togetherwefall.entities.Survivor;
import nassing.togetherwefall.entities.game.Server;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Player {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "player")
    private List<Survivor> survivors = new ArrayList<>();

    @OneToMany(mappedBy = "player")
    private List<Building> buildings = new ArrayList<>();

    @ManyToOne
    private PlayerAccount playerAccount;

    @ManyToOne
    private Server server;
}
