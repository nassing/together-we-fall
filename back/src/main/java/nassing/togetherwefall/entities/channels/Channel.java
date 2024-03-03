package nassing.togetherwefall.entities.channels;

import jakarta.persistence.*;
import nassing.togetherwefall.entities.game.Server;

import java.util.List;

@Entity
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "serverId")
    private Server server;

    @OneToMany(mappedBy = "channel")
    private List<ChannelMessage> messages;
}
