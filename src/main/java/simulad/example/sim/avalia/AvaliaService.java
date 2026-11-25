package simulad.example.sim.avalia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import simulad.example.sim.avalia.dto.AvaliasDto;

import java.util.List;

@Service
public class AvaliaService {

    @Autowired
    private AvaliaRepository avaliaRepository;

    public List<Avalia> listarTodas() {
        return avaliaRepository.findAll();
    }

    public Avalia criar(AvaliasDto dto) {
        return avaliaRepository.save(Avalia.fromDto(dto));
    }


    public Avalia buscarPorId(Integer id) {
        return avaliaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }
}
