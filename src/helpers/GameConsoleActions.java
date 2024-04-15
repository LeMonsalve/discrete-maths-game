package helpers;

import game.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public abstract class GameConsoleActions {
    public static void retrieveAndSetPlayerName(final Player player) {
        System.out.println("Ingresa tu nombre: ");
        final Scanner scanner = new Scanner(System.in);
        final String name = scanner.nextLine().trim();

        if (!StringValidator.isValidAsName(name)) {
            System.err.println("Nombre inválido, el nombre debe contener solo letras o números.");
            retrieveAndSetPlayerName(player);
        }

        player.setName(name);
    }

    @NotNull
    public static String retrievePlayerAnswer() {
        System.out.println("Ingresa tu respuesta (V / F): ");
        final Scanner scanner = new Scanner(System.in);
        final String answer = scanner.nextLine().trim();

        if (!StringValidator.isValidAsAnswer(answer)) {
            System.err.println("Respuesta inválida, la respuesta debe ser 'V' o 'F'.");
            retrievePlayerAnswer();
        }

        return answer;
    }

    public static void pressEnterToRollDice() {
        System.out.println("Presiona Enter para lanzar el dado.");
        String value = new Scanner(System.in).nextLine();

        if (!value.isEmpty()) {
            System.err.println("Debes presionar Enter para lanzar el dado.");
            pressEnterToRollDice();
        }
    }

    public static void finishGame() {
        System.out.println(STR."¡Has perdido! Mejor suerte la próxima vez.");
        System.exit(400);
    }

    public static void finishGame(final int score) {
        System.out.println(STR."¡Felicidades, has ganado!\nTu puntaje es: " + score);
        System.exit(200);
    }
}
