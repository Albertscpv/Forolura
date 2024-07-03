package albert.dev.forohub.ForoHub.domain.message;


import albert.dev.forohub.ForoHub.domain.topico.Topico;
import albert.dev.forohub.ForoHub.domain.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name = "Answer")
@Table(name = "Answer")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Answer {
    private Long id;
    private String message;
    private Topico topico;
    private LocalDate creationDate;
    private User user;

    @OneToMany
    private String answer;
}
