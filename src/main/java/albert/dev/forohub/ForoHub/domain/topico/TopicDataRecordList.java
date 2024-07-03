package albert.dev.forohub.ForoHub.domain.topico;

import albert.dev.forohub.ForoHub.domain.curso.Subject;
import albert.dev.forohub.ForoHub.domain.message.Answer;
import albert.dev.forohub.ForoHub.domain.user.User;

import java.time.LocalDate;
import java.util.List;

public record TopicDataRecordList(
        String title,
        String message,
        LocalDate creationDate,
        Boolean status,
        User user,
        Subject subject,
        List<Answer> answers
) {
    public TopicDataRecordList(Topico topico){
        this(topico.getTitle(), topico.getMessage(), topico.getCreationDate(),
                topico.getStatus(), topico.getUser(), topico.getSubject(),topico.getAnswers());
    }
}
