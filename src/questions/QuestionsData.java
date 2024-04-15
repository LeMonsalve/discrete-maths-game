package questions;

import java.util.List;

public class QuestionsData {
    public static List<Question> seed() {
        return List.of(
            new Question("Para todo entero positivo n, 2n > n.", "v", QuestionTypes.INDUCTION),
            new Question("La afirmación 'Para todo entero positivo n, n^2 + n es par' es verdadera.", "v", QuestionTypes.INDUCTION),
            new Question("La afirmación 'Para todo entero positivo n, n! < 2^n' es falsa.", "f", QuestionTypes.INDUCTION),
            new Question("La afirmación 'Para todo entero positivo n, n^2 +2n+1=(n+1)' es verdadera.", "v", QuestionTypes.INDUCTION),
            new Question("La afirmación 'Para todo entero positivo n, 2^n < 3 ^n' es verdadera.", "v", QuestionTypes.INDUCTION),

            new Question("El conjunto vacío es subconjunto de cualquier conjunto.", "v", QuestionTypes.SETS),
            new Question("La intersección de conjuntos disjuntos es el conjunto vacío.", "v", QuestionTypes.SETS),
            new Question("Si dos conjuntos tienen la misma cardinalidad, entonces son iguales?", "f", QuestionTypes.SETS),
            new Question("La unión de un conjunto con su complemento universal es el conjunto universal?", "v", QuestionTypes.SETS),
            new Question("Si dos conjuntos son disjuntos, entonces su unión es igual a la suma de sus cardinales?", "v", QuestionTypes.SETS),
            new Question("El conjunto potencia de cualquier conjunto tiene siempre más elementos que el conjunto original?", "v", QuestionTypes.SETS),

            new Question("Toda relación reflexiva es simétrica.", "v", QuestionTypes.RELATIONS),
            new Question("Toda relación simétrica es transitiva.", "v", QuestionTypes.RELATIONS),
            new Question("Toda relación transitiva es reflexiva.", "v", QuestionTypes.RELATIONS),
            new Question("La relación de equivalencia divide el conjunto en clases de equivalencia disjuntas.", "v", QuestionTypes.RELATIONS),
            new Question("La relación de orden parcial es antisimétrica.", "v", QuestionTypes.RELATIONS),
            new Question("Toda relación de equivalencia es reflexiva.", "v", QuestionTypes.RELATIONS),

            new Question("Toda función inyectiva tiene una función inversa.", "v", QuestionTypes.FUNCTIONS),
            new Question("Toda función sobreyectiva tiene una función inversa.", "f", QuestionTypes.FUNCTIONS),
            new Question("La composición de dos funciones inyectivas es siempre inyectiva.", "v", QuestionTypes.FUNCTIONS),
            new Question("La composición de dos funciones sobreyectivas es siempre sobreyectiva.", "f", QuestionTypes.FUNCTIONS),
            new Question("La función identidad es siempre una función inyectiva.", "v", QuestionTypes.FUNCTIONS),
            new Question("Toda función biyectiva tiene una única función inversa.", "v", QuestionTypes.FUNCTIONS)
        );
    }
}
