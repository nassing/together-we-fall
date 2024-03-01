package nassing.togetherwefall.entities;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import nassing.togetherwefall.entities.player.Player;
import nassing.togetherwefall.entities.rooms.AbstractRoom;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    private int food;
    private int materials;
    private int spareParts;

    private int roomsCount;
    
    @ManyToOne
    private Player player;

    @OneToMany(mappedBy = "building")
    private List<AbstractRoom> rooms = new ArrayList<>();

    public Building() {
    }

    public Building(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFood() {
        return food;
    }

    public int getMaterials() {
        return materials;
    }

    public int getSpareParts() {
        return spareParts;
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    public Player getPlayer() {
        return player;
    }

    public List<AbstractRoom> getRooms() {
        return rooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void setMaterials(int materials) {
        this.materials = materials;
    }

    public void setSpareParts(int spareParts) {
        this.spareParts = spareParts;
    }

    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setRooms(List<AbstractRoom> rooms) {
        this.rooms = rooms;
    }
}