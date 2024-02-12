package nassing.togetherwefall.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Player")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    @Id
    private long id;
    private String name;
    private List<String> houseIds;
    private List<String> characterIds;
}
