package nassing.togetherwefall.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import nassing.togetherwefall.entities.Survivor;
import nassing.togetherwefall.services.SurvivorService;

import java.util.Map;

@RestController
@RequestMapping("/survivors")
public class SurvivorController {
    private final SurvivorService survivorService;

    @Autowired
    public SurvivorController(SurvivorService survivorService) {
        this.survivorService = survivorService;
    }

    @PostMapping
    public ResponseEntity<Survivor> addSurvivor(@RequestBody Map<String, Object> requestData) {
        String survivorName = (String) requestData.get("name");
        long playerId = (int) requestData.get("playerId");

        if (survivorName == null || playerId < 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Missing required attributes for survivor creation");
        }

        Survivor survivor = survivorService.createSurvivor(survivorName, playerId);

        if (survivor == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Could not create survivor");
        }

        return new ResponseEntity<>(survivor, HttpStatus.CREATED);
    }
}

// Endpoints pour créer, récupérer, mettre à jour, et supprimer des joueurs