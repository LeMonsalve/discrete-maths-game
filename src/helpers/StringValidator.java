package helpers;

public class StringValidator {
    public static boolean isValidAsName(final String string) {
        return string.matches("^[a-zA-Z0-9]*$") && !string.isEmpty();
    }

    public static boolean isValidAsAnswer(final String string) {
        return string.equalsIgnoreCase("v") || string.equalsIgnoreCase("f");
    }
}
