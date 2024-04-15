package helpers;

import questions.Question;

public class QuestionFormatter {
    public static String format(final Question question) {
        return STR."Verdadero o falso: \{question} (V / F): ";
    }
}
