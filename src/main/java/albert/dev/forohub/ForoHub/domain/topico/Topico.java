package albert.dev.forohub.ForoHub.domain.topico;

import albert.dev.forohub.ForoHub.domain.curso.Subject;
import albert.dev.forohub.ForoHub.domain.message.Answer;
import albert.dev.forohub.ForoHub.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Entity(name = "Topico")
@Table(name = "topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String title;

    private String  message;
    private LocalDate creationDate;
    private Boolean status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="author", referencedColumnName = "id")
    private User user;

    @ManyToOne(fetch = curso_)
    private Subject subject;

    @ManyToOne
    private List<Answer> answers;


    public Topico(TopicoDataRecord topicoDataRecord) {
        this.title = topicoDataRecord.title();
        this.message = topicoDataRecord.message();
        this.creationDate = topicoDataRecord.creationDate();
        this.status = topicoDataRecord.status();
        this.subject = topicoDataRecord.subject();
        this.answers = topicoDataRecord.answers();
    }

    public void updateData(UpdateTopicDTO updateTopicDTO){
        if(updateTopicDTO.title() != null){
            this.title = updateTopicDTO.title();
        }
        if(updateTopicDTO.message() != null){
            this.message = updateTopicDTO.message();
        }
        if(updateTopicDTO.creationDate() != null){
            this.creationDate = updateTopicDTO.creationDate();
        }
        if(updateTopicDTO.subject() != null){
            this.subject = updateTopicDTO.subject();
        }
        if(updateTopicDTO.answers() != null){
            this.answers = updateTopicDTO.answers();
        }
    }
}
