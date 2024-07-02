package albert.dev.ForoHub.domain.answers;

import java.time.LocalDate;

public record AnswerDataResponse(
        Long Id,
        String message_to_answer,
        String user,
        String topic,
        String creation_date,
        String answer,
        Boolean online
) {
}
