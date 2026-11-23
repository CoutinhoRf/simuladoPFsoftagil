package simulad.example.sim.partida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avalias")
public class avaliaController {

    @Autowired
    private avaliaService avaliaService;
//listar
    @GetMapping
    public List<avalia> listarTodas() {
        return avaliaService.listarTodas();
    }
// cadastrar
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public avalia criar(@RequestBody avalia avalia,
                         @AuthenticationPrincipal Jwt jwt) {
        System.out.println(jwt.getClaimAsStringList("https://social-insper.com/roles"));
        return avaliaService.criar(avalia);
    }

    @GetMapping("/{id}")
    public avalia buscarPorId(@PathVariable Integer id) {
        return avaliaService.buscarPorId(id);
    }
}
