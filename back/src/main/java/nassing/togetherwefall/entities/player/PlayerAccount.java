package nassing.togetherwefall.entities.player;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class PlayerAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String password;

    @OneToMany(mappedBy = "playerAccount")
    private List<Player> players;

    public PlayerAccount() {
    }

    public PlayerAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
