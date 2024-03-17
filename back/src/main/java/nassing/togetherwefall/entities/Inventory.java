package nassing.togetherwefall.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nassing.togetherwefall.entities.items.AItem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "twf", name = "inventory")
public class Inventory {
    @Id
    private UUID id;

    @OneToOne
    private Survivor survivor;

    @OneToOne
    private Building building;

    @OneToMany(mappedBy = "inventory")
    private List<AItem> items = new ArrayList<>();
}
