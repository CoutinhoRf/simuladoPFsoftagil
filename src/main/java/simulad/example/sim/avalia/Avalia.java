package simulad.example.sim.avalia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import simulad.example.sim.avalia.dto.AvaliasDto;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Avalia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String emailAvaliador;
    private String avliadoEmail;
    private String comentarios;
    private LocalDate dataAvaliação;
    private Integer nota;

    public static Avalia fromDto(AvaliasDto dto) {
        Avalia jogo = new Avalia();
        jogo.setEmailAvaliador(dto.getEmailAvaliador());
        jogo.setAvliadoEmail(dto.getAvliadoEmail());
        jogo.setComentarios(dto.getComentarios());
        jogo.setDataAvaliação(dto.getDataAvaliação());
        jogo.setNota(dto.getNota());
        return jogo;
    }
}
