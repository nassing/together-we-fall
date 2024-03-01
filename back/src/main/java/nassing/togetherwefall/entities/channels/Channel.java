package nassing.togetherwefall.entities.channels;

import jakarta.persistence.*;
import nassing.togetherwefall.entities.Game;

import java.util.List;

@Entity
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "gameId")
    private Game game;

    @OneToMany(mappedBy = "channel")
    private List<ChannelMessage> messages;
}
