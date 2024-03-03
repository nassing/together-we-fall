package nassing.togetherwefall.controllers;

import nassing.togetherwefall.services.PlayerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class PlayerAccountController {

    private final PlayerAccountService playerAccountService;

    @Autowired
    public PlayerAccountController(PlayerAccountService playerAccountService) {
        this.playerAccountService = playerAccountService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createPlayerAccount(@RequestParam String username, @RequestParam String password) {
        try {
            playerAccountService.createPlayerAccount(username, password);
            return ResponseEntity.ok("Player account created successfully.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Failed to create player account: " + e.getMessage());
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deletePlayerAccount(@RequestParam String username, @RequestParam String password) {
        try {
            playerAccountService.deletePlayerAccount(username, password);
            return ResponseEntity.ok("Player account deleted successfully.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Failed to delete player account: " + e.getMessage());
        }
    }

    @PostMapping("/check")
    public ResponseEntity<Boolean> checkPlayerAccount(@RequestParam String username, @RequestParam String password) {
        try {
            if (playerAccountService.checkPlayerAccount(username, password)) {
                return ResponseEntity.ok(true);
            } else {
                return ResponseEntity.ok(false);
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(false);
        }
    }
}
