package messages;

import game.Player;

public class GameMessages {
    public static void printWelcomeMessage() {
        System.out.println(
                """
                ¡Bienvenidos a Exploradores de la Matemática Discreta!
                El objetivo es utilizar conceptos de matemática discreta para avanzar en la aventura.
                Que empiece la exploración...
                """
        );
    }

    public static void printInstructions(final String name) {
        System.out.println(
                STR."""

                Instrucciones:
                - Responde correctamente las preguntas para avanzar.
                - Si respondes incorrectamente, perderás una vida.
                - Si pierdes todas tus vidas, la aventura habrá terminado.
                - Si respondes correctamente todas las preguntas, serás el ganador.

                ¡Buena suerte \{name}!

                """
        );
    }

    public static void printCorrectAnswer() {
        System.out.println("¡Respuesta correcta!");
    }

    public static void printIncorrectAnswer() {
        System.out.println("¡Respuesta incorrecta!");
    }

    public static void presentQuestion(final String question) {
        System.out.println("Responde: ");
        System.out.println(question);
    }

    public static void presentTurnInfo(final Player player, final int score, final int position) {
        System.out.println(
                STR."""

                Turno de \{player.getName()}:
                - Posición en el tablero: \{position}
                - Puntuación: \{score}
                - Vidas: \{player.getLives()}
                """
        );
    }

    public static void printDiceValue(int diceValue) {
        System.out.print(STR."Avanzas \{diceValue} casillas.");
    }
}
