package helpers;

public abstract class BoardActions {
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}
