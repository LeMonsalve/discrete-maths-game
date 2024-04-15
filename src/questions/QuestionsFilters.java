package questions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.function.Predicate;

public class QuestionsFilters {
    @NotNull
    @Contract(pure = true)
    public static Predicate<Question> byTypeAndNotAnswered(QuestionTypes type) {
        return question -> question.getType() == type && !question.isAnswered();
    }
}
