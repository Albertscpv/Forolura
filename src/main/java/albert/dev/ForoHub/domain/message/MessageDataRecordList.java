package albert.dev.ForoHub.domain.message;

import albert.dev.ForoHub.domain.answers.Answers;

import java.util.List;

public record MessageDataRecordList(
        Long id,
        String user,
        String message){
    public MessageDataRecordList(Message message){
        this(message.getId(), message.getUser(), message.getMessage());
    }

}
