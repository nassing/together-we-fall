package nassing.togetherwefall.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Building")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Building {
    @Id
    private String id;
    private String name;
    private String inventoryId;
    private String playerId;

    private int food;
    private int materials;
    private int spareParts;

    private int roomsNumber;
    private List<String> roomIds; 
}