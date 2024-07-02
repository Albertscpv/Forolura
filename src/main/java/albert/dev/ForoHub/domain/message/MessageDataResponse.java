package albert.dev.ForoHub.domain.message;

import java.time.LocalDate;

public record MessageDataResponse(
        Long Id,
        String user,
        String topic,
        String message,
        String creation_date,
        Boolean online
) {
}
