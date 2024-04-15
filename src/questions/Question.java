package questions;

public class Question {
    private final String question;
    private final String answer;
    private final QuestionTypes type;
    private boolean isAnswered = false;

    public Question(final String question, final String answer, final QuestionTypes type) {
        this.question = STR."Verdadero o falso: \{question} (V / F): ";
        this.answer = answer;
        this.type = type;
    }

    @Override
    public String toString() {
        return STR."Question {question='\{question}\{'\''}, answer='\{answer}\{'\''}, type=\{type}, isAnswered=\{isAnswered}\{'}'}";
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public QuestionTypes getType() {
        return type;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(final boolean answered) {
        isAnswered = answered;
    }
}
