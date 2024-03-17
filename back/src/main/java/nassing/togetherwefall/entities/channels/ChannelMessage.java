package nassing.togetherwefall.entities.channels;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nassing.togetherwefall.entities.player.Player;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "twf", name = "channel_message")
public class ChannelMessage {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "message")
    private String message;

    @Column(name = "timestamp")
    private String timestamp;

    @ManyToOne
    @JoinColumn(name = "channelId")
    private Channel channel;

    @OneToOne
    @JoinColumn(name = "playerId")
    private Player sender;
}
