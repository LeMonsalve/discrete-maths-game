package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QuestionsManager {
    private final List<Question> questions = new ArrayList<>(QuestionsData.seed());
    private Map<QuestionTypes, List<Question>> questionsByType;

    public QuestionsManager() {
        updateQuestionsByType();
    }

    public boolean answerQuestion(final Question question, final String answer) {
        removeQuestion(question);
        question.setAnswered(true);
        addQuestion(question);

        return question.getAnswer().equalsIgnoreCase(answer);
    }

    public List<Question> getQuestionsByType(QuestionTypes type) {
        return questionsByType.get(type);
    }

    public List<Question> getQuestionsByAnswerAndType(String answer, QuestionTypes type) {
        return questions.stream()
                .filter(question -> question.getAnswer().equalsIgnoreCase(answer) && question.getType().equals(type))
                .collect(Collectors.toList());
    }

    private void addQuestion(Question question) {
        questions.add(question);
        updateQuestionsByType();
    }

    private void removeQuestion(Question question) {
        questions.remove(question);
        updateQuestionsByType();
    }

    private void updateQuestionsByType() {
        this.questionsByType = questions.stream()
                .collect(Collectors.groupingBy(Question::getType));
    }
}
