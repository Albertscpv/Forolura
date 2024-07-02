package albert.dev.ForoHub.domain.message;

import albert.dev.ForoHub.domain.answers.Answers;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.List;

public record MessageDataRecord(

        @NotBlank
        String user,

        @NotBlank
        String topic,

        @NotBlank
        String message,

        @NotNull
        String creation_date
) {
}
