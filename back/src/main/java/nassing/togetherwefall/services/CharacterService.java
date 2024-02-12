package nassing.togetherwefall.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nassing.togetherwefall.repositories.CharacterRepository;

@Service
public class CharacterService {
    private final CharacterRepository CharacterRepository;

    @Autowired
    public CharacterService(CharacterRepository CharacterRepository) {
        this.CharacterRepository = CharacterRepository;
    }

    // Méthodes pour gérer les joueurs
}