package nassing.togetherwefall.entities;

import jakarta.persistence.*;
import nassing.togetherwefall.entities.channels.Channel;

import java.util.List;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "game")
    private List<Channel> channels;
}
