package game;

public class Player {
    private int lives = 3;
    private String name = "Player";

    public Player() {}

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void loseLive() {
        lives--;
    }

    public boolean isAlive() {
        return lives > 0;
    }

    public int getLives() {
        return lives;
    }
}
