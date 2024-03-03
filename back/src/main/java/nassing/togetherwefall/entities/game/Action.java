package nassing.togetherwefall.entities.game;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;


@Entity
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


}
