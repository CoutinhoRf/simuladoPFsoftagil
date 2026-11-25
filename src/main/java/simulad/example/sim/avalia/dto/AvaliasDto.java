package simulad.example.sim.avalia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliasDto {
	private String emailAvaliador;
	private LocalDate dataAvaliação;
	private String avliadoEmail;
	private String comentarios;
	private Integer nota;
}
