package nassing.togetherwefall.entities.items;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nassing.togetherwefall.entities.Inventory;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public abstract class AItem {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "inventoryId")
    private Inventory inventory;
}
