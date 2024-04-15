package game;

import helpers.GameConsoleActions;
import helpers.PositionHelpers;
import messages.GameMessages;
import questions.Question;
import questions.QuestionTypes;
import questions.QuestionsFilters;
import questions.QuestionsManager;

import java.util.List;

public class Board {
    private final QuestionsManager questionsManager = new QuestionsManager();

    private int playerPosition = 0;
    private int score = 0;

    public void nextAction(final Player player, int diceValue) {
        playerPosition += diceValue;

        int finalPosition = 30;
        if (playerPosition > finalPosition) {
            GameConsoleActions.finishGame(score);
        }

        presentQuestion(player);
    }

    public void presentQuestion(final Player player) {
        Question question = getQuestionAccordingToPosition();

        GameMessages.presentTurnInfo(player, score, playerPosition);

        GameMessages.presentQuestion(question.getQuestion());

        String answer = GameConsoleActions.retrievePlayerAnswer();

        if (questionsManager.answerQuestion(question, answer)) {
            GameMessages.printCorrectAnswer();
            score++;
        } else {
            GameMessages.printIncorrectAnswer();
            player.loseLive();
        }
    }

    private Question getQuestionAccordingToPosition() {
        int questionSectionSize = 7;
        if (PositionHelpers.isBetween(playerPosition, 0, questionSectionSize)) {
            return getQuestionBySection(QuestionTypes.INDUCTION);
        } else if (PositionHelpers.isBetween(playerPosition, questionSectionSize, questionSectionSize * 2)) {
            return getQuestionBySection(QuestionTypes.SETS);
        } else if (PositionHelpers.isBetween(playerPosition, questionSectionSize * 2, questionSectionSize * 3)) {
            return getQuestionBySection(QuestionTypes.RELATIONS);
        } else {
            return getQuestionBySection(QuestionTypes.FUNCTIONS);
        }
    }

    private Question getQuestionBySection(QuestionTypes type) {
        List<Question> questions = questionsManager.getQuestionsByType(type);

        int randomIndex = (int) (Math.random() * questions.size());

        return questions.get(randomIndex);
    }
}
