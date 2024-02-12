package nassing.togetherwefall.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nassing.togetherwefall.repositories.InventoryRepository;

@Service
public class InventoryService {
    private final InventoryRepository InventoryRepository;

    @Autowired
    public InventoryService(InventoryRepository InventoryRepository) {
        this.InventoryRepository = InventoryRepository;
    }

    // Méthodes pour gérer les joueurs
}