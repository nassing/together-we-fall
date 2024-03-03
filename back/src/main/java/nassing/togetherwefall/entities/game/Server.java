package nassing.togetherwefall.entities.game;

import jakarta.persistence.*;
import nassing.togetherwefall.entities.channels.Channel;
import nassing.togetherwefall.entities.player.Player;

import java.util.List;

@Entity
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "server")
    private List<Channel> channels;

    @OneToMany(mappedBy = "server")
    private List<Player> players;

    @OneToOne
    private ActionQueue actionQueue;

    public Server() {
    }

    public long getId() {
        return id;
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    public void addChannel(Channel channel) {
        channels.add(channel);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public ActionQueue getActionQueue() {
        return actionQueue;
    }

    public void setActionQueue(ActionQueue actionQueue) {
        this.actionQueue = actionQueue;
    }
}
