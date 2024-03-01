package nassing.togetherwefall.entities;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.ArrayList;
import java.util.List;

import nassing.togetherwefall.entities.items.AItem;

@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private Survivor survivor;

    @OneToOne
    private Building building;

    @OneToMany(mappedBy = "inventory")
    private List<AItem> items = new ArrayList<>();

    public Inventory() {
    }

    public long getId() {
        return id;
    }

    public Survivor getSurvivor() {
        return survivor;
    }

    public void setSurvivor(Survivor survivor) {
        this.survivor = survivor;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public List<AItem> getItems() {
        return items;
    }

    public void addItem(AItem item) {
        items.add(item);
    }
}
