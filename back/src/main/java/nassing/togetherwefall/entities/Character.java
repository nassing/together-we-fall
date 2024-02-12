package nassing.togetherwefall.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RedisHash("Character")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Character {
    @Id
    private String id;
    private String name;
    private String playerId;
    private String inventoryId;
}
