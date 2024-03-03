package nassing.togetherwefall.entities.game;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ActionQueue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private Server server;

    @OneToMany
    private List<Action> queuedActions;

    public ActionQueue() {
    }

    public long getId() {
        return id;
    }

    public Server getServer() {
        return server;
    }

    public void setGame(Server server) {
        this.server = server;
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
