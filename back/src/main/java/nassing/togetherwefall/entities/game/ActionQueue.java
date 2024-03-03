package nassing.togetherwefall.entities.game;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ActionQueue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private Game game;

    @OneToMany
    private List<Action> queuedActions;

    public ActionQueue() {
    }

    public long getId() {
        return id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public List<Action> getQueuedActions() {
        return queuedActions;
    }

    public void queueAction(Action action) {
        queuedActions.add(action);
    }

    public void unqueue() {
        queuedActions.remove(0);
    }
}
