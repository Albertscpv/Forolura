package albert.dev.forohub.ForoHub.domain.message;

import albert.dev.forohub.ForoHub.domain.topico.Topico;
import albert.dev.forohub.ForoHub.domain.user.User;

import java.time.LocalDate;

public record AnswerDataRecord(
            String message,
            Topico topico,
            LocalDate creationDate,
            User user,
            String answer
) {
}
