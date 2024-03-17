package nassing.togetherwefall.entities.channels;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nassing.togetherwefall.entities.game.Server;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "twf", name = "channel")
public class Channel {
    @Id
    @Column(name = "id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "serverId")
    private Server server;

    @OneToMany(mappedBy = "channel")
    private List<ChannelMessage> messages;
}
