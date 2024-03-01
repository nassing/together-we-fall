package nassing.togetherwefall.entities.items;

import jakarta.persistence.Entity;

@Entity
public class Weapon extends Equipment {
    private int damage;

    public Weapon() {
    }

    public Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
