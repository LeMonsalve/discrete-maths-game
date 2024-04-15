package helpers;

public class PositionHelpers {
    public static boolean isBetween(final int value, final int min, final int max) {
        return value >= min && value <= max;
    }
}
