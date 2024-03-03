package nassing.togetherwefall.entities.player;

import jakarta.persistence.*;
import nassing.togetherwefall.entities.Building;
import nassing.togetherwefall.entities.game.Server;
import nassing.togetherwefall.entities.Survivor;


import java.util.ArrayList;
import java.util.List;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @OneToMany(mappedBy = "player")
    private List<Survivor> survivors = new ArrayList<>();

    @OneToMany(mappedBy = "player")
    private List<Building> buildings = new ArrayList<>();

    @ManyToOne
    private PlayerAccount playerAccount;

    @ManyToOne
    private Server server;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Survivor> getSurvivors() {
        return survivors;
    }

    public void addSurvivor(Survivor survivor) {
        survivors.add(survivor);
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public PlayerAccount getPlayerAccount() {
        return playerAccount;
    }

    public void setPlayerAccount(PlayerAccount playerAccount) {
        this.playerAccount = playerAccount;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }
}
