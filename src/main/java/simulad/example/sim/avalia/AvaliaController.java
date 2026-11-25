package simulad.example.sim.avalia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;
import simulad.example.sim.avalia.dto.AvaliasDto;

import java.util.List;

@RestController
@RequestMapping("/avalias")
public class AvaliaController {

    @Autowired
    private AvaliaService avaliaService;

    @GetMapping
    public List<Avalia> listarTodas() {
        return avaliaService.listarTodas();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Avalia criar(@RequestBody AvaliasDto avalia,
                         @AuthenticationPrincipal Jwt jwt) {
        System.out.println(jwt.getClaimAsStringList("https://social-insper.com/roles"));
        return avaliaService.criar(avalia);
    }

    @GetMapping("/{id}")
    public Avalia buscarPorId(@PathVariable Integer id) {
        return avaliaService.buscarPorId(id);
    }
}
