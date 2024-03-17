package nassing.togetherwefall.entities.game;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "twf", name = "action_queue")
public class ActionQueue {
    @Id
    @Column(name = "id")
    private UUID id;

    @OneToOne
    private Server server;

    @OneToMany
    private List<Action> queuedActions;
}
