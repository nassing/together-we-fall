package nassing.togetherwefall.controllers;

import nassing.togetherwefall.entities.game.Server;
import nassing.togetherwefall.entities.player.Player;
import nassing.togetherwefall.services.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servers")
public class ServerController {

    private final ServerService serverService;

    @Autowired
    public ServerController(ServerService serverService) {
        this.serverService = serverService;
    }

    @PostMapping
    public ResponseEntity<Server> createServer() {
        Server newServer = serverService.createServer();
        return ResponseEntity.ok(newServer);
    }

    @DeleteMapping("/{serverId}")
    public ResponseEntity<Void> deleteServer(@PathVariable long serverId) {
        serverService.deleteServer(serverId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Server>> getAllServers() {
        List<Server> servers = serverService.getServers();
        return ResponseEntity.ok(servers);
    }

    @PostMapping("/{serverId}/join/{playerAccountId}")
    public ResponseEntity<Player> joinServer(@PathVariable long serverId, @PathVariable long playerAccountId) {
        Player player = serverService.joinServer(serverId, playerAccountId);
        return ResponseEntity.ok(player);
    }
}
