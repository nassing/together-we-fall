package nassing.togetherwefall.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nassing.togetherwefall.repositories.ItemRepository;

@Service
public class ItemService {
    private final ItemRepository ItemRepository;

    @Autowired
    public ItemService(ItemRepository ItemRepository) {
        this.ItemRepository = ItemRepository;
    }

    // Méthodes pour gérer les joueurs
}