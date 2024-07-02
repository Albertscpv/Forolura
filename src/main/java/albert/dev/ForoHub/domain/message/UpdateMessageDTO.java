package albert.dev.ForoHub.domain.message;

import jakarta.validation.constraints.NotNull;


public record UpdateMessageDTO(
        @NotNull
        Long Id,

        @NotNull
        String message,

        @NotNull
        String topic,

        @NotNull
        String creation_date
) {

}
