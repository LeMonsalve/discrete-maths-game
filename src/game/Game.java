package game;

import helpers.BoardActions;
import helpers.GameConsoleActions;
import messages.GameMessages;

public class Game {
    private final Board board = new Board();
    private final Player player;

    public Game(final Player player) {
        this.player = player;
    }

    public void start() {
        GameMessages.printWelcomeMessage();

        GameConsoleActions.retrieveAndSetPlayerName(player);

        GameMessages.printInstructions(player.getName());

        while (player.isAlive()) {
            GameConsoleActions.pressEnterToRollDice();
            int diceValue = BoardActions.rollDice();
            GameMessages.printDiceValue(diceValue);
            board.nextAction(player, diceValue);
        }

        GameConsoleActions.finishGame();
    }
}
