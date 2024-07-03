package albert.dev.forohub.ForoHub.domain.topico;


import albert.dev.forohub.ForoHub.domain.curso.Subject;
import albert.dev.forohub.ForoHub.domain.message.Answer;
import albert.dev.forohub.ForoHub.domain.user.User;

import java.time.LocalDate;
import java.util.List;

public record TopicoDataRecord(
        String title,
        String message,
        LocalDate creationDate,
        Boolean status,
        User user,
        Subject subject,
        List<Answer> answers

) {
}
