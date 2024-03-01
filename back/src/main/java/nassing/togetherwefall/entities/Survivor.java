package nassing.togetherwefall.entities;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import nassing.togetherwefall.entities.items.Tool;
import nassing.togetherwefall.entities.player.Player;

@Entity
public class Survivor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    private long hp;
    private long hunger;
    private long infectionRate;
    
    @ManyToOne
    private Player player;

    @OneToOne
    private Inventory inventory;

    @OneToOne
    private Tool tool;

    public Survivor() {
    }

    public Survivor(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getHp() {
        return hp;
    }

    public long getHunger() {
        return hunger;
    }

    public long getInfectionRate() {
        return infectionRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(long hp) {
        this.hp = hp;
    }

    public void setHunger(long hunger) {
        this.hunger = hunger;
    }

    public void setInfectionRate(long infectionRate) {
        this.infectionRate = infectionRate;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
