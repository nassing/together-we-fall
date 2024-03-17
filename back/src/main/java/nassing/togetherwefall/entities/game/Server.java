package nassing.togetherwefall.entities.game;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nassing.togetherwefall.entities.channels.Channel;
import nassing.togetherwefall.entities.player.Player;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "twf", name = "server")
public class Server {
    @Id
    @Column(name = "id")
    private UUID id;

    @OneToMany(mappedBy = "server")
    private List<Channel> channels;

    @OneToMany(mappedBy = "server")
    private List<Player> players;

    @OneToOne
    private ActionQueue actionQueue;
}
