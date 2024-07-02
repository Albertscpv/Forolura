package albert.dev.ForoHub.domain.answers;

import java.time.LocalDate;
import java.util.List;

public record UpdateAnswersDTO(
        Long Id,
        String message_to_answer,
        String answer,
        String creation_date
) {
}
