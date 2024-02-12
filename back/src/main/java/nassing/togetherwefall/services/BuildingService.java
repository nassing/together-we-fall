package nassing.togetherwefall.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nassing.togetherwefall.repositories.BuildingRepository;

@Service
public class BuildingService {
    private final BuildingRepository BuildingRepository;

    @Autowired
    public BuildingService(BuildingRepository BuildingRepository) {
        this.BuildingRepository = BuildingRepository;
    }

    // Méthodes pour gérer les joueurs
}