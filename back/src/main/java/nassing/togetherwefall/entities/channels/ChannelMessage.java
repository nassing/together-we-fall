package nassing.togetherwefall.entities.channels;

import jakarta.persistence.*;
import nassing.togetherwefall.entities.player.Player;

@Entity
public class ChannelMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String message;

    private String timestamp;

    @ManyToOne
    @JoinColumn(name = "channelId")
    private Channel channel;

    @OneToOne
    @JoinColumn(name = "playerId")
    private Player sender;

    public ChannelMessage() {
    }

    public ChannelMessage(String message, Channel channel, Player sender) {
        this.message = message;
        this.channel = channel;
        this.sender = sender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Player getSender() {
        return sender;
    }

    public void setSender(Player sender) {
        this.sender = sender;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
