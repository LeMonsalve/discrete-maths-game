import game.Game;
import game.Player;

void main() {
    Player player = new Player();
    Game game = new Game(player);
    game.start();
}