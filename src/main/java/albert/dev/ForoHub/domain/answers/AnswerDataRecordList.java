package albert.dev.ForoHub.domain.answers;

import java.util.List;

public record AnswerDataRecordList(
        Long Id,
        String user,
        String messageToAnswer,
        String answer
) {
    public AnswerDataRecordList(Answers answers){
        this(answers.getId(),answers.getUser() ,answers.getMessage_to_answer(), answers.getAnswer());
    }
}
